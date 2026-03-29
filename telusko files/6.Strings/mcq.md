# Java String, StringBuilder, StringBuffer — Complete Practice Set
### (MCQs • Coding Exercises • Interview Questions)

---

# 1. MCQs (100+)

### **MCQs 1–25: Core String Fundamentals**

1. What is the primary characteristic of `String` in Java?  
   a) Mutable  
   b) Immutable  
   c) Thread-safe  
   d) Allocated in PermGen

2. Where are string literals stored?  
   a) Heap  
   b) Stack  
   c) String Constant Pool  
   d) Native memory

3. What happens when you modify a String using concatenation?  
   a) Original string changes  
   b) New object created  
   c) Same object reused  
   d) Compiler throws error

4. `"abc" == new String("abc")` evaluates to:  
   a) true  
   b) false

5. Which method places a String into SCP?  
   a) `concat()`  
   b) `valueOf()`  
   c) `intern()`  
   d) `strip()`

6. String immutability helps with:  
   a) Security  
   b) Efficient caching (SCP)  
   c) Thread-safety  
   d) All of the above

7. `String s = "a" + "b" + "c";` is evaluated at:  
   a) Runtime  
   b) Compile-time  
   c) JIT  
   d) JVM startup

8. What is stored inside `String` class?  
   a) char[] (before Java 9)  
   b) byte[] + coder flag (Java 9+)  
   c) Both A and B  
   d) None

9. `"abc".substring(0,1)` creates how many objects in Java 7?  
   a) 0  
   b) 1  
   c) 2  
   d) Depends on JVM

10. `"hello".charAt(0)` returns:  
    a) String  
    b) char  
    c) byte  
    d) int

11. Which operator is overloaded for Strings?  
    a) +=  
    b) +  
    c) ==  
    d) None

12. `String s1 = "abc"; String s2 = "ab" + "c"; s1 == s2` is:  
    a) true  
    b) false

13. `String s = new String("abc")` creates how many objects in JVM?  
    a) 1  
    b) 2  
    c) 3  
    d) Depends

14. SCP is maintained in:  
    a) Heap  
    b) Stack  
    c) Method Area  
    d) Stack Frame

15. Which class is immutable?  
    a) String  
    b) StringBuilder  
    c) StringBuffer  
    d) All

16. `"abc".intern()` returns:  
    a) A new object  
    b) Reference from SCP  
    c) Null  
    d) A clone

17. Which uses synchronized methods?  
    a) String  
    b) StringBuilder  
    c) StringBuffer  
    d) Both B and C

18. Which is fastest for heavy string mutation?  
    a) String  
    b) StringBuilder  
    c) StringBuffer

19. Default capacity of StringBuilder:  
    a) 16  
    b) 32  
    c) 0  
    d) 8

20. StringBuilder capacity formula:  
    a) `newCap = old + 16`  
    b) `newCap = old * 2`  
    c) `newCap = old * 2 + 2`  
    d) JVM dependent

21. Which is thread-safe?  
    a) String  
    b) StringBuilder  
    c) StringBuffer  
    d) All

22. Does String override hashCode()?  
    a) Yes  
    b) No

23. Does String override equals()?  
    a) Yes  
    b) No

24. Which is mutable?  
    a) String  
    b) char[]  
    c) int[]  
    d) All arrays

25. `"abc".equals(new String("abc"))` is:  
    a) true  
    b) false

---

### **MCQs 26–50: SCP + Heap + Internals**

26. SCP ensures:  
    a) Deduplication  
    b) Faster access  
    c) Memory optimization  
    d) All

27. SCP is garbage collected starting which Java version?  
    a) 6  
    b) 7  
    c) 8  
    d) 11

28. String literals are loaded during:  
    a) Class loading  
    b) Execution  
    c) First access  
    d) JIT

29. `s.intern()` stores string in:  
    a) Metaspace  
    b) Heap  
    c) Dedicated pool inside heap  
    d) Code area

30. `"ab" + new String("c")` creates string in:  
    a) SCP only  
    b) Heap only  
    c) Both  
    d) Compiler dependent

31. Which is stored in SCP?  
    a) `"hello"`  
    b) `new String("hello")`  
    c) `builder.toString()`  
    d) All

32. String’s hashCode is:  
    a) Cached  
    b) Recomputed every time  
    c) Random  
    d) Native

33. StringBuilder’s `toString()` creates:  
    a) Same char[] shared  
    b) New String copy  
    c) Cached string  
    d) Immutable wrapper

34. StringBuilder is not thread-safe because:  
    a) It uses shared buffer  
    b) No synchronized methods  
    c) Does not lock on append  
    d) All

35. StringBuffer is slower due to:  
    a) Synchronization  
    b) Memory padding  
    c) JNI  
    d) Bigger buffer

36. Capacity grows when:  
    a) New string > current capacity  
    b) Always  
    c) Never  
    d) Only once

37. `new String()` creates a string of length:  
    a) 0  
    b) 1  
    c) Undefined

38. Which class is final?  
    a) String  
    b) StringBuilder  
    c) StringBuffer  
    d) All

39. `String.valueOf(null)` gives:  
    a) "null"  
    b) NullPointerException

40. Which uses byte[] after Java 9?  
    a) String  
    b) StringBuilder  
    c) StringBuffer  
    d) None

41. Does StringBuilder store coder flag?  
    a) Yes  
    b) No

42. `"abc".substring(1)` before Java 7 produced:  
    a) Shared char[]  
    b) New char[]  
    c) Compressed string

43. `"hello".replace('l','t')` creates how many objects?  
    a) 1  
    b) 2  
    c) 3

44. Which class supports method chaining?  
    a) StringBuilder  
    b) StringBuffer  
    c) Both  
    d) None

45. Calling `toString()` on StringBuilder is:  
    a) Expensive  
    b) Cheap  
    c) Copies internal buffer

46. Calling `"A" + 1 + 2` results in:  
    a) A12  
    b) A3

47. StringBuilder append order?  
    a) Left → right  
    b) Right → left

48. `"A" + 1` compiled as:  
    a) StringBuilder usage  
    b) StringBuffer usage  
    c) String concatenation operator

49. Repeated concatenation inside loops is:  
    a) Optimal  
    b) Bad practice → creates many objects

50. StringBuilder supports:  
    a) reverse()  
    b) delete()  
    c) insert()  
    d) All


51. Which JVM instruction is typically used to load a string literal from the class constant pool?  
    a) getstatic  
    b) ldc  
    c) anewarray  
    d) invokespecial

52. Which bytecode instruction is used for virtual (dynamically-dispatched) instance method calls (used by `StringBuilder.append`)?  
    a) invokestatic  
    b) invokespecial  
    c) invokevirtual  
    d) invokeinterface

53. After Java 9, `String` uses a `coder` field to indicate storage; which pair correctly describes possible encodings?  
    a) ASCII and UCS2  
    b) LATIN1 and UTF16  
    c) UTF8 and UTF16  
    d) ISO8859_1 and UTF8

54. Which of these operations is most likely to trigger a new `byte[]` allocation inside a `String` instance (Java 9+)?  
    a) `s.toUpperCase()` returning same content  
    b) `s.substring(0, s.length())` if it returns same string reference  
    c) `new String(s)`  
    d) `s.intern()` when s already in SCP

55. Which of the following is true about `String.hashCode()`?  
    a) It is computed using a native call every time.  
    b) It is cached inside `String` after the first computation.  
    c) It is stored in SCP.  
    d) It cannot be cached because `String` is mutable.

56. `StringBuilder` initial default capacity (when no capacity is provided) is:  
    a) 8  
    b) 16  
    c) 32  
    d) 0

57. Which of the following growth strategies matches `StringBuilder`'s behaviour (Oracle/OpenJDK typical)?  
    a) newCap = oldCap + 16  
    b) newCap = oldCap * 2  
    c) newCap = oldCap * 2 + 2  
    d) newCap = oldCap + oldCap/2

58. Which of these is a reason the JVM can avoid allocating a `StringBuilder` for simple concatenations inside a method?  
    a) Escape analysis / scalar replacement  
    b) Bytecode verification  
    c) Class verification step  
    d) PermGen optimization

59. Which class provides a synchronized mutable sequence of characters?  
    a) String  
    b) StringBuilder  
    c) StringBuffer  
    d) StringWriter

60. What is the effect of calling `intern()` on a very large number of dynamically-created unique strings?  
    a) No effect; intern does nothing.  
    b) May cause higher heap usage and potentially OOM if pool grows without bound.  
    c) Causes strings to be moved to stack.  
    d) Causes JVM to free them earlier.

61. Which of the following is TRUE about `StringBuilder.toString()` implementation (typical OpenJDK behaviour)?  
    a) It always returns the same `String` object without copying internal buffer.  
    b) It returns a new `String` that may share or copy the internal char/byte array depending on JDK version and implementation.  
    c) It modifies the internal buffer to become immutable.  
    d) It returns a direct reference to the internal char[] (no copy) guaranteed.

62. For multi-threaded code that appends to the same buffer from different threads, which is the recommended type?  
    a) StringBuilder  
    b) StringBuffer  
    c) String  
    d) StringWriter

63. Which JVM area historically contained the String intern pool prior to Java 7?  
    a) Heap  
    b) Stack  
    c) PermGen (Permanent Generation)  
    d) Code cache

64. `String s = "ab"; s += "c";` — what does the compiler/JVM typically do?  
    a) Mutate the literal in SCP to "abc".  
    b) Create new `StringBuilder`, append and assign a new `String` to s.  
    c) Modify "ab" in-place.  
    d) Throw runtime exception.

65. Which is NOT a reason to prefer `StringBuilder` over plain `String` concatenation in loops?  
    a) Reduce allocations  
    b) Improve asymptotic time complexity  
    c) Enable string interning automatically  
    d) Reduce GC pressure

66. Which of the following best describes compact strings (java 9+)?  
    a) Strings always use UTF-8 storage internally.  
    b) Strings use either 1 byte/char (LATIN1) or 2 bytes/char (UTF16) based on content.  
    c) Strings store characters as bit-packed 7-bit ASCII.  
    d) Strings are compressed and stored off-heap.

67. In Java, which of the following is resolved using *static* (compile-time) binding rather than dynamic dispatch?  
    a) public instance method override  
    b) private method calls  
    c) interface method calls  
    d) virtual instance methods

68. Which of the following methods in `String` is documented to return the same object if no changes are required (i.e., may avoid allocation)?  
    a) `replace(char oldChar, char newChar)`  
    b) `toLowerCase(Locale)` (if already lower-case)  
    c) `trim()` (if no leading/trailing whitespace)  
    d) All of the above (each may return same instance in some JDKs)

69. When you do `String s = String.join("-", list)`, which class is commonly used under the hood to build the result?  
    a) StringBuffer  
    b) StringBuilder  
    c) String  
    d) StringJoiner (which itself uses StringBuilder)

70. Which of the following is true about `new String(bytes, charset)`?  
    a) It always uses the same internal byte[] reference passed in.  
    b) It decodes bytes into internal char/byte representation and does not keep the original array reference.  
    c) It stores a reference to the input array for future conversions.  
    d) It only works for ASCII.

71. What happens when you call `"a".concat(null)`?  
    a) Throws NullPointerException  
    b) Returns "anull"  
    c) Returns "a"  
    d) Depends on JDK version

72. Which of the following is a valid way to create an empty string?  
    a) `new String()`  
    b) `""`  
    c) `String.valueOf("")`  
    d) Any of the above

73. What is the typical time complexity to compare two equal-length strings for equality?  
    a) O(1)  
    b) O(log n)  
    c) O(n) (character-by-character)  
    d) O(n^2)

74. Which of the following operations is *NOT* affected by the `coder` (LATIN1 / UTF16) choice of a `String` instance?  
    a) `length()` semantics (number of `char`-code-units vs code points)  
    b) `byte[]` memory footprint of internal storage  
    c) Performance of `charAt()` (may differ slightly)  
    d) `String.hashCode()` result (must be same irrespective of coder)

75. Which method is used to convert a `String` into a `byte[]` using a specific charset?  
    a) `String.getBytes()`  
    b) `String.toByteArray()`  
    c) `String.toBytes(Charset)`  
    d) `String.encode(Charset)`

76. Which statement about `StringBuilder` and `StringBuffer` constructors is correct?  
    a) StringBuilder() creates a buffer of size 0.  
    b) StringBuilder(int capacity) guarantees no further reallocations for that many chars.  
    c) StringBuffer has no constructors with initial capacity.  
    d) All constructors are synchronized.

77. Which of the following statements about `String.intern()` is true?  
    a) It always returns a new `String` object.  
    b) It returns a canonical representation for the string object.  
    c) It removes the string from SCP.  
    d) It always makes the string immutable.

78. Which of the following is *not* a standard method of `StringBuilder`?  
    a) append(CharSequence)  
    b) replace(int, int, String)  
    c) ensureCapacity(int)  
    d) intern()

79. What is the char index returned by `s.codePointAt(i)` compared to `s.charAt(i)` when encountering a surrogate pair?  
    a) Both return the same 16-bit `char` value.  
    b) `codePointAt` returns the full unicode code point (an int), while `charAt` returns the 16-bit code unit.  
    c) `codePointAt` throws exception on surrogate pairs.  
    d) `charAt` returns the full code point.

80. Which of the following is a safe practice to avoid accidental `String` memory leaks when working with substrings of very large strings?  
    a) Keep referencing the large original String forever.  
    b) Use `substring()` in JDK 6 style to share backing array.  
    c) Create a new String copy of the substring (`new String(s.substring(...))`).  
    d) Always use intern() on substrings.

81. Which of the following is true about `String` concatenation in a loop that concatenates many small strings (e.g., joining thousands of tokens)?  
    a) Using `+` inside loop is best.  
    b) Use `StringBuilder` to accumulate tokens for performance.  
    c) Use `StringBuffer` always regardless of threading.  
    d) Use `concat()` is always faster than `append()`.

82. Which property allows `String` instances to be safely used as keys in `HashMap` without additional synchronization?  
    a) Immutability of String  
    b) Synchronization in `String` methods  
    c) String stored in SCP  
    d) String's hashCode is native

83. Which of the following statements about `String.substring(begin, end)` (Java 7u6+) is correct?  
    a) It returns a view backed by the original String’s array.  
    b) It returns a newly allocated `String` containing the requested characters.  
    c) It always interns the result.  
    d) It returns the same `String` object when begin==0 and end==length.

84. What is the result of `"a".compareTo("A")` (ASCII/Unicode code point ordering)?  
    a) 0  
    b) Positive number  
    c) Negative number  
    d) Throws exception

85. Which of the following reduces peak memory usage when many identical strings are created at runtime?  
    a) Calling `toString()` on each string  
    b) Using `intern()` on repeated values (with caution)  
    c) Using `new String()` for each value  
    d) Converting to `StringBuffer`

86. Which of the following methods directly writes to the `String` internal buffer without creating a new `String`?  
    a) `String.replace()`  
    b) `String.toUpperCase()`  
    c) `StringBuilder.append()`  
    d) `String.intern()`

87. If you have a `char[] arr` and you want to create a `String` without copying the array (i.e., to share the array), is this supported in standard public API (pre-JDK-internal hacks excluded)?  
    a) Yes, `new String(arr, false)` exists.  
    b) No, `String` constructors copy the array for safety.  
    c) Yes, using `String.valueOf(arr)` shares the array.  
    d) Only for ASCII arrays.

88. Which of the following best describes `String.equalsIgnoreCase()` behavior?  
    a) It compares code points with case folding (locale-independent simple case folding).  
    b) It uses locale-sensitive mapping always.  
    c) It compares raw bytes.  
    d) It is identical to `equals()`.

89. Which of the following will most likely produce a different memory footprint for the same textual content?  
    a) A `String` created from ASCII-only content (Latin-1) versus the same content containing non-Latin characters (needing UTF-16).  
    b) A `String` and its interned counterpart.  
    c) Two Strings with same content but created with `new String()` will have identical memory.  
    d) None of the above.

90. For `StringBuilder sb = new StringBuilder("abc"); sb.insert(1, "XYZ");` what is the result of `sb.toString()`?  
    a) "aXYZbc"  
    b) "abcXYZ"  
    c) "XYZabc"  
    d) "aXYZ"

91. Which of these operations on `String` are guaranteed to be constant-time?  
    a) `length()`  
    b) `charAt(i)`  
    c) `isEmpty()`  
    d) All of the above

92. Which one of these will NOT create any new `String` objects (ignoring JVM internals/optimizations)?  
    a) `"a" + "b"` where both literals present at compile time  
    b) `new String("a")`  
    c) `String s = ""; s += "a";` (in loop)  
    d) `StringBuilder sb = new StringBuilder(); sb.append("a").toString();`

93. Which method in `String` is deprecated because it causes security problems and is rarely used?  
    a) `getBytes()`  
    b) `getChars()`  
    c) `intern()`  
    d) `hashCode()`

94. Which JDK feature can automatically reduce duplicated `String` objects at runtime in large heaps?  
    a) Escape analysis  
    b) String deduplication in G1 GC  
    c) Method inlining  
    d) Class Data Sharing (CDS)

95. Which of the following is true about `StringBuilder`'s `reverse()` method?  
    a) It returns a new `StringBuilder` and leaves original unchanged.  
    b) It reverses in place and returns the same `StringBuilder` instance.  
    c) It is thread-safe.  
    d) It throws UnsupportedOperationException for UTF-16 surrogate pairs.

96. Which of the following is the correct way to safely build a `String` from pieces in parallel (multiple threads) and then combine results?  
    a) Have all threads append to the same `StringBuilder` instance without locking.  
    b) Have each thread use its own `StringBuilder`, then combine via `StringBuilder.append(other.toString())` in a single thread.  
    c) Use a single `StringBuffer` and hope for best.  
    d) Use `String.concat()` in each thread with a shared reference.

97. Which of the following is true about `String` immutability and `final` fields?  
    a) If a `String` has final fields, it's mutable.  
    b) `final` fields in `String` help ensure safe publication across threads.  
    c) `final` has no effect on immutability or publication.  
    d) `String` uses no final fields.

98. Which of the following demonstrates a safe way to publish an immutable `String` to other threads?  
    a) Assign to a volatile field  
    b) Assign to a non-volatile field without synchronization  
    c) Publish through a data race but with `final` fields only  
    d) Always use `synchronized` block to read String

99. Which of these statements about `String` and memory alignment is correct?  
    a) `String` objects are packed tightly without any alignment.  
    b) JVM imposes object alignment and padding, so actual memory footprint can be higher than the sum of fields.  
    c) `String` memory size equals exactly `object header + fields + byte[] length`.  
    d) `String` objects are stored off-heap so alignment is irrelevant.

100. Which of the following best summarizes why `String` uses a cached `hash` field rather than recomputing every time?  
     a) To save memory  
     b) To speed up repeated hash-based lookups (HashMap keys) because Strings are frequently used as keys  
     c) To allow `String` to be mutable safely  
     d) To make `hashCode()` non-deterministic

---

# ANSWERS & EXPLANATIONS — MCQs 1–100

Below are the **correct choices** for MCQs 1–100 followed by concise explanations. (Questions 1–50 were listed earlier in the combined file; answers here cover all 100.)

---

## Q1 — Q25 (recap + answers)

1. **Answer: b** — `String` is immutable: its value cannot change after creation.
2. **Answer: c** — Primitive types are not objects in Java.
3. **Answer: b** — String concatenation produces a new object (because String is immutable).
4. **Answer: b** — `new String("abc")` creates a new heap object; comparing reference to literal is false.
5. **Answer: c** — `intern()` places the String in the SCP.
6. **Answer: d** — Immutability aids security, pooling and thread-safety.
7. **Answer: b** — `"a" + "b" + "c"` is constant-folded at compile-time.
8. **Answer: c** — pre-Java 9 char[]; Java 9+ uses byte[] + coder.
9. **Answer: b** — Typically one `String` object is created for the substring (post-fix), but historically sharing existed; depends on JDK. Historically substring created a new String but may reuse array in old JDKs—safe answer: 1 (the substring object).
10. **Answer: b** — `charAt` returns a `char`.
11. **Answer: b** — `+` is overloaded for String concatenation.
12. **Answer: a** — both are compile-time constants so they reference same SCP entry.
13. **Answer: b** — literal in SCP + new String() on heap = 2 objects.
14. **Answer: a** — SCP resides in heap (from Java 7+).
15. **Answer: a** — `String` is immutable, while `StringBuilder` and `StringBuffer` are mutable.
16. **Answer: b** — intern returns reference from SCP.
17. **Answer: c** — `StringBuffer` uses synchronized methods.
18. **Answer: b** — `StringBuilder` is fastest for mutation.
19. **Answer: a** — default capacity for empty StringBuilder is 16 (typical).
20. **Answer: c** — typical growth formula: newCap = old*2 + 2.
21. **Answer: d** — String is immutable (hence thread-safe), StringBuffer is thread-safe, StringBuilder is not.
22. **Answer: a** — String overrides hashCode.
23. **Answer: a** — String overrides equals to compare content.
24. **Answer: d** — arrays are mutable; String is not.
25. **Answer: a** — equals compares content → true.

---

## Q26 — Q50 (answers & brief explanations)

26. **Answer: d** — SCP deduplicates literals, improving memory and potentially access.
27. **Answer: b** — From Java 7, SCP was moved from PermGen to Heap and thus GC-able.
28. **Answer: a** — Literals are loaded during class loading (runtime constant pool resolution).
29. **Answer: c** — `intern()` stores canonical instance in SCP which lives on heap in modern JVMs.
30. **Answer: b** — `new String("c")` creates a heap String; concatenation with runtime values uses StringBuilder and produces heap objects.
31. **Answer: a** — Literal `"hello"` is in SCP; `new String("hello")` creates a heap object.
32. **Answer: a** — String caches its hash code after the first calculation.
33. **Answer: b** — `toString()` typically creates a new `String` (may copy internal buffer). Implementation details can vary.
34. **Answer: b** — StringBuilder is not synchronized; it's intentionally not thread-safe for performance.
35. **Answer: a** — Synchronization adds overhead to StringBuffer.
36. **Answer: a** — Capacity grows when appended content exceeds current capacity.
37. **Answer: a** — `new String()` produces an empty string of length 0.
38. **Answer: a** — `String` is final; also `StringBuilder` and `StringBuffer` are not final in older JDKs (but `String` is the key final one). (Correct answer from choices: String is final.)
39. **Answer: a** — `String.valueOf(null)` returns `"null"` (the overload that takes Object). `String.valueOf((Object)null)` returns "null". `null` literal used directly will NPE only if you call methods on null.
40. **Answer: a** — `String` uses byte[] (Java 9+). StringBuilder/StringBuffer use char[]; String uses byte[] internally. So answer: String.
41. **Answer: b** — StringBuilder does not use a coder flag; that's for String.
42. **Answer: a** — Old substring implementations shared the backing array (pre-7u6).
43. **Answer: b** — `replace` creates a new String (may create internal arrays); count depends on implementation but usually it produces a new String.
44. **Answer: c** — Both StringBuilder and StringBuffer support chaining via returning `this`.
45. **Answer: c** — `toString()` typically copies internal buffer into a new String (costly relative to appends).
46. **Answer: a** — `"A" + 1 + 2` is `"A12"` because concatenation with string proceeds left-to-right.
47. **Answer: a** — append order is left-to-right.
48. **Answer: a** — The compiler desugars concatenation into StringBuilder usage.
49. **Answer: b** — Repeated concatenation in loops is bad practice (creates many temporary Strings).
50. **Answer: d** — StringBuilder supports reverse, delete, insert, etc.

---

## Q51 — Q75 (answers & brief explanations)

51. **Answer: b** — `ldc` loads constants including string literals from the class constant pool.
52. **Answer: c** — `invokevirtual` is used for standard virtual method invocation.
53. **Answer: b** — Java 9 introduced LATIN1 (one byte per char) and UTF16 for storage decisions.
54. **Answer: c** — `new String(s)` explicitly creates a new String object, which will allocate its own internal array/copy.
55. **Answer: b** — `String.hashCode()` is cached in the `hash` field after first computation.
56. **Answer: b** — Default capacity of StringBuilder() is 16.
57. **Answer: c** — OpenJDK typical growth: newCap = oldCap * 2 + 2 (historical behavior).
58. **Answer: a** — Escape analysis/scalar replacement can eliminate the allocation.
59. **Answer: c** — `StringBuffer` is the synchronized mutable sequence.
60. **Answer: b** — Interning many unique strings grows the pool and can increase heap usage / cause OOM.
61. **Answer: b** — `toString()` usually creates a new String; exact behavior may vary by JDK (copies internal buffer).
62. **Answer: b** — For multi-threaded concurrent appends to same buffer, use `StringBuffer` (or better: use thread-local builders and combine).
63. **Answer: c** — Prior to Java 7, intern pool lived in PermGen (Permanent Generation).
64. **Answer: b** — `s += "c"` desugars into StringBuilder append and assigns a new String to s.
65. **Answer: c** — `StringBuilder` does NOT enable interning automatically; interning is separate.
66. **Answer: b** — Compact strings use 1 or 2 bytes per character depending on content.
67. **Answer: b** — private methods are statically bound (compile-time), not dynamically dispatched.
68. **Answer: d** — Methods such as `replace`, `toLowerCase`, `trim` may return the same instance if no change was needed (JDK may optimize).
69. **Answer: d** — `String.join()` uses `StringJoiner` which itself uses `StringBuilder`.
70. **Answer: b** — `new String(bytes, charset)` decodes into the String’s internal representation; it does not retain original array reference.

---

## Q71 — Q100 (answers & brief explanations)

71. **Answer: a** — `concat(null)` actually throws `NullPointerException` (the `concat` method expects non-null argument).
72. **Answer: d** — All presented ways create empty String; `new String()` creates "", `""` is literal, `String.valueOf("")` returns "". All are valid.
73. **Answer: c** — Comparing equal-length strings requires comparing characters; O(n) time.
74. **Answer: d** — `hashCode()` must produce same result whether stored as LATIN1 or UTF16 — the logical `hashCode()` result is independent of internal coder. `length()` semantics and `charAt` behavior are defined; `length()` returns number of `char` units (not code points), but coder affects internal storage footprint.
75. **Answer: a** — `String.getBytes(Charset)` or `getBytes()` overloads convert to byte[]. (The standard method is `getBytes(Charset)`.)
76. **Answer: b** — `StringBuilder(int capacity)` preallocates buffer to that capacity, avoiding reallocations up to that size.
77. **Answer: b** — `intern()` returns the canonical representation (the reference from SCP).
78. **Answer: d** — `intern()` is not a method on `StringBuilder`; the listed methods are valid for StringBuilder except `intern()`.
79. **Answer: b** — `codePointAt` returns full Unicode code point (int) when encountering surrogate pairs, while `charAt` returns a single `char` (16-bit) code unit.
80. **Answer: c** — To avoid memory leak from large backing arrays, create a new String copy of the substring (e.g., `new String(s.substring(...))`) so the large original char/byte array can be GC'd.
81. **Answer: b** — Use `StringBuilder` to accumulate tokens for performance; `+` in loop is inefficient.
82. **Answer: a** — Immutability ensures safe use as keys without further synchronization.
83. **Answer: b** — Since Java 7u6, substring returns a new String copying the necessary chars; it does not share the original backing array.
84. **Answer: c** — `"a".compareTo("A")` returns a positive or negative depending on code points; `'a'` (97) > `'A'` (65) so it returns positive (so **b** Positive number). *(Note: Unicode code point of 'a' is greater so result is > 0 — answer b.)*
85. **Answer: b** — Interning repeated values can reduce duplicates (but use carefully; intern pool growth has costs).
86. **Answer: c** — `StringBuilder.append()` mutates the builder’s internal buffer and does not create a new `String`. `String` methods produce new `String` instances.
87. **Answer: b** — Public API copies input char[] into the String for safety; sharing is not supported in standard safe API.
88. **Answer: a** — `equalsIgnoreCase` uses case folding; it is not strictly locale-sensitive (it uses basic case mapping rules, not locale-sensitive transformations like Turkish).
89. **Answer: a** — If content fits LATIN1, internal storage uses 1 byte/char; non-Latin characters require UTF-16 (2 bytes/char), leading to different memory footprints.
90. **Answer: a** — Insert at index 1 yields "aXYZbc".
91. **Answer: d** — Length, charAt and isEmpty are constant-time operations.
92. **Answer: a** — `"a" + "b"` (both compile-time literals) is constant-folded into `"ab"` and does not create runtime Strings. The other options create new Strings.
93. **Answer: a** — `getBytes()` itself is not deprecated globally, but `finalize()` is deprecated (not asked). Of given choices, none are widely deprecated; however `getBytes()` without charset is discouraged due to platform default encoding issues. The question likely intended that none of these are deprecated; if forced, choose that `getBytes()` without charset is discouraged — **(best answer: none are deprecated, but platform-default `getBytes()` is discouraged)**.
94. **Answer: b** — G1 GC has String Deduplication which can reduce duplicate string storage.
95. **Answer: b** — `reverse()` reverses the builder content in place and returns the same instance.
96. **Answer: b** — Use per-thread `StringBuilder`s and combine results in a single thread to avoid locking.
97. **Answer: b** — `final` fields provide safe publication semantics, and `String` uses final fields to support immutability guarantees.
98. **Answer: a** — Assigning to a `volatile` field or publishing through safely published final fields or synchronized blocks are correct; volatile is a correct safe publication method.
99. **Answer: b** — JVM adds object alignment and padding so actual memory footprint can be larger than sum of fields.
100. **Answer: b** — Caching hash speeds up repeated hash lookups, particularly when Strings are used as keys (e.g., HashMap).

---

# Notes on ambiguous/implementation-dependent items

- A few behaviors (e.g., exact `StringBuilder.toString()` copying semantics or whether certain `String` methods return the same instance) can vary slightly by JDK version and implementation. Where the question says “typical OpenJDK behaviour” that is the basis for the answer.
- Questions about memory layout, SCP location, substring sharing, and deduplication depend on Java version (6 vs 7 vs 8 vs 9+). Answers above assume modern JDKs unless otherwise noted.
- For question 93 the API `String.getBytes()` is not deprecated but using the platform-default charset is discouraged—prefer `getBytes(StandardCharsets.UTF_8)`.

---







