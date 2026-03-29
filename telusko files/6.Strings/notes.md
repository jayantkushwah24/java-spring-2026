# Complete In-Depth Notes on Java String, StringBuilder, StringBuffer


---

# 1. What Exactly Is a String in Java?

A `String` in Java is:

- A **final**, **immutable**, **value-based** class.
- Internally backed by:
    - **JDK 8 and below:** `char[] value`
    - **JDK 9+:** `byte[] value` + `byte coder` (Compact Strings)
- Implements `Serializable`, `Comparable<String>`, and `CharSequence`.

Java Strings are heavily optimized for:

- Security
- Performance
- Memory efficiency
- Thread-safety
- Deduplication & interning

---

# 2. Why String Is Immutable (Full Technical Reasoning)

### 2.1 Security
Strings are used in:

- Class names
- ClassLoader internals
- File paths
- Network hosts
- Database connection URLs
- Environment variables
- Password strings

Mutability would create major security risks.

### 2.2 String Pooling Requires Immutability
The JVM depends on immutability to safely:

- Reuse string literals
- Cache references
- Avoid synchronization

### 2.3 HashCode Caching
`hashCode` is cached inside the object:


private int hash; // zero until computed once

If the content changed, hash-based collections would break.

2.4 Thread-Safety for Free

Immutable objects have:

No internal synchronization

Safe publication guarantees

Zero race conditions

2.5 Final Class

String is final to prevent overriding methods that would break immutability.

3. Memory Model: Heap, SCP, Runtime Constant Pool
3.1 The String Constant Pool (SCP)

Stored inside heap (Java 7+)

Prior to Java 7 → stored in PermGen

Holds unique string literals

String literals are loaded by the ClassLoader, not created with new.

Example:

String s1 = "abc";
String s2 = "abc";


Both reference the same object in the SCP.

3.2 Heap Strings

Created using:

String s = new String("abc");


Creates:

"abc" literal in SCP (if not already present)

A new String object on heap

Why 2 objects?

SCP literal

A new heap object containing its own backing array (or copy)

4. Internal Implementation Differences (JDK 8 vs JDK 9+)
JDK 8
private final char[] value;


Always UTF-16

Memory-heavy, especially for ASCII text

JDK 9+: Compact Strings
private final byte[] value;
private final byte coder; // LATIN1=0, UTF16=1


Benefits:

50% less memory for ASCII-heavy workloads

Faster operations due to reduced footprint

5. Substring Internals (Memory-Leak Story)
JDK 6 & JDK 7 (pre-7u6)

substring used to reference the original array:

String big = "bigstring....";
String small = big.substring(0, 5);


small shared the same large char array → memory leak risk.

JDK 7u6+

Substring creates a new array copy.

6. String Interning — Full Mechanics

intern() inserts the string into SCP.

String s1 = new String("x");
String s2 = s1.intern();
String s3 = "x";


s2 == s3 → true

s1 == s2 → false

JVM intern behavior across versions:
Version	Pool Location
Java 6	PermGen
Java 7+	Heap
Java 8+	Heap (improved deduplication)
7. String Concatenation — Compiler & JVM Behavior
7.1 Compile-Time Concatenation (Constant Folding)
String s = "a" + "b" + "c";


Compiler rewrites as:

String s = "abc";


Zero runtime overhead.

7.2 Runtime Concatenation
String s = a + b;


Compiler rewrites to:

StringBuilder sb = new StringBuilder();
sb.append(a);
sb.append(b);
s = sb.toString();


This is why loops like this are slow:

String s = "";
for (int i = 0; i < n; i++) {
    s = s + i;
}

Time complexity = O(n²)
8. StringBuilder — Internal Working, Capacity Growth, Performance

StringBuilder is:

Mutable

Fastest for building strings

Not synchronized

Internal structure (simplified):

char[] value;
int count;

Capacity Expansion Formula:
newCapacity = oldCapacity * 2 + 2


Advantages:

Amortized O(1) append

Far fewer allocations

9. StringBuffer — Thread-Safe Version of StringBuilder

All methods are synchronized

Slower than StringBuilder

Use only when:

Multiple threads share the same buffer

And they modify it concurrently

Otherwise, it's unnecessary overhead.

10. Escape Analysis & Stack Allocation (Advanced JVM Optimization)

JIT checks whether an object “escapes” its scope.

If not, it performs:

Scalar replacement

Stack allocation

Object removal from heap → NO GC cost

Example:

String concat() {
    StringBuilder sb = new StringBuilder();
    sb.append("a");
    sb.append("b");
    return sb.toString();
}


JVM may:

Eliminate the StringBuilder object entirely

Inline the entire operation

11. Bytecode for String Concatenation

Example:

String x = "a" + b;


Bytecode (simplified):

new StringBuilder
dup
invokespecial <init>
ldc "a"
invokevirtual append
aload_1
invokevirtual append
invokevirtual toString
astore_2

12. G1 GC String Deduplication

G1 GC can automatically deduplicate identical strings:

During marking phase, JVM detects identical arrays

Replaces duplicates with shared arrays

Huge memory savings in:

Microservices

Web servers

High-throughput systems

13. JOL-Based Object Layout (Simplified)

For a String object:

String object:
  - Mark word (12 bytes)
  - Class pointer (4 or 8 bytes)
  - int hash
  - byte coder
  - reference to byte[] value

byte[]:
  - Mark word
  - Class pointer
  - int length
  - n bytes of data


Actual size depends on:

JVM word size

CompressedOops

Alignment padding

14. Comparison: String vs StringBuilder vs StringBuffer
Feature	String	StringBuilder	StringBuffer
Mutable	No	Yes	Yes
Thread-safe	Yes	No	Yes
Performance	Slow for concatenation	Fastest	Middle
Pooling	Yes	No	No
Use-case	Keys, configs, constants	Local concatenation	Multi-threaded shared buffer
Storage	byte[]	char[]	char[]
15. High-Level Interview Questions You Can Answer

Why is String immutable?

Why is String final?

What is SCP and where is it stored?

How many objects are created with new String("x")?

Why small substring sharing was removed?

Difference between StringBuilder and StringBuffer.

Explain Compact Strings (JDK 9+).

How does interning work?

Why is StringBuilder faster?

What is escape analysis?

How does JVM optimize string concatenation?

How does G1 deduplicate Strings?

Explain the impact of hash caching.

Difference between compile-time and runtime concatenation.

16. Coding Anti-Patterns to Avoid
16.1 String concatenation inside loops

Bad:

String s = "";
for (...) s += i;


Good:

StringBuilder sb = new StringBuilder();

17. Common Interview Traps
Trap 1:
"abc" == "abc" // true (SCP)

Trap 2:
new String("abc") == "abc" // false

Trap 3:
"a" + "b" // compile-time optimization

Trap 4:
"a" + new String("b") // runtime concatenation → NOT SCP

Trap 5:

String interning changes between Java versions.

18. Summary (FAANG-Level)

String = immutable, final, value-based, compact representation, pooled, cached hash.

StringBuilder = mutable, fast, unsynchronized, best for concatenation.

StringBuffer = mutable, synchronized, slower, only for multi-thread shared buffers.

SCP resides in heap (post Java 7).

Interned strings are reused across the JVM classloader space.

JVM performs aggressive optimizations: constant folding, escape analysis, deduplication.

Understanding bytecode behavior is essential for top-tier interviews.