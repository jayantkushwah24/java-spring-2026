✅ Java Variables Based on Scope — VERY IN-DEPTH

Java provides three major types of variables based on where they are declared and how long they live in memory:

Local Variables

Instance Variables (non-static fields)

Static Variables (class variables)

These exist because of Java’s memory model (stack + heap + metaspace + PC registers).

Let’s go extremely deep.

🔵 1. LOCAL VARIABLES

Declared inside a method, constructor, or block.

✔ Where Stored?

Stored inside stack frames of the executing thread.

When a method is called → a stack frame is created → local variables live there.

When method finishes → frame destroyed → variable disappears.

✔ Default Values?

❌ No default value
You MUST initialize them before use, or compile-time error.

Reason:
Stack memory is not guaranteed to be zero-initialized by JVM.

✔ Scope

Only accessible within the method/block where declared.

Example:

void test() {
int x = 5; // local variable
if (x > 0) {
int y = 10; // block-scoped local
}
// y is not accessible here
}

✔ Lifecycle

Created → when method invoked.
Destroyed → when method ends.

Even if an exception occurs → stack frame unwinds → variable gone.

✔ Thread Behavior

Each thread receives its own copy of local variables.
→ They are thread-safe by default.

✔ Access Modifiers?

❌ You cannot use: public, private, protected, static.

Reason:
They are not class members; they belong to stack frames.

✔ Bytecode-Level Insight

Local variables stored as:

slot numbers in the stack frame’s local variable array.

JVM instructions: iload, istore, aload, astore.

Example bytecode:

0: iconst_5
1: istore_1 // local variable at slot 1

🔵 2. INSTANCE VARIABLES (Non-static Fields)

Declared inside class but outside methods, without the static keyword.

✔ Where Stored?

Stored in Heap, inside each object instance.

If 10 objects are created → each object has its own copy of the instance variable.

✔ Default Values?

Yes. Assigned automatically:

Type Default
int 0
double 0.0
boolean false
object ref null

Reason:
Heap memory is zero-initialized by JVM.

✔ Scope

Accessible as long as object exists, using:

obj.variable

✔ Lifecycle

Created → when new object created.
Destroyed → when object becomes unreachable → Garbage Collector clears it.

✔ Access Modifiers Allowed

✔ public
✔ private
✔ protected
✔ default
✔ final
❌ NOT necessarily static.

✔ Thread Behavior

Each object has its own copy →
If same object shared across threads → instance variables can cause race conditions.
Needs synchronization (synchronized, locks, atomics).

✔ Bytecode-Level Insight

Accessed via:

getfield

putfield

Example:

getfield #2 <MyClass.x : I>

🔵 3. STATIC VARIABLES (Class Variables)

Declared using the static keyword.

Example:

static int count;

✔ Where Stored?

Stored in Method Area (Metaspace) —
NOT in heap or stack.

One copy per class, not per object.

✔ Default Values?

Same as instance variables:

numeric → 0

boolean → false

object reference → null

✔ Scope

Accessible using:

ClassName.variable

or

obj.variable // allowed but not recommended

✔ Lifecycle

Created → when class is loaded by JVM (ClassLoader).
Destroyed → when JVM shuts down or class unloaded.

✔ Advantages

Shared across all objects.

Best for constants, counters, configuration.

✔ Thread Behavior

Since shared across threads →
Static variables are NOT thread-safe by default.

✔ Bytecode-Level Insight

Accessed via:

getstatic

putstatic

Example:

getstatic #2 <MyClass.count : I>

🟢 In One Diagram (Very Clear)
+---------------------------+
| JVM Memory |
+---------------------------+

STACK <--- local variables (method scope)
HEAP <--- instance variables
METHOD AREA (Metaspace) <--- static variables

🟣 Comparison Table (Deep)
Feature Local Variable Instance Variable Static Variable
Memory Stack Heap Method Area
Lifetime Method execution Object lifetime JVM lifetime
Default Value ❌ No ✔ Yes ✔ Yes
Access using Only inside method obj.var ClassName.var
Thread safety ✔ Yes ❌ No ❌ No
Access modifiers ❌ Not allowed ✔ Allowed ✔ Allowed
One per Method call Object Class
🟠 Example Showing All Three
public class Employee {

    static int companyId = 1001; // static variable

    String name;  // instance variable

    void work() {
        int hours = 8; // local variable
        System.out.println(name + " works " + hours + " hours.");
    }

}

Runtime:

companyId → one copy for ALL employees (Metaspace)

name → each employee object has its own value (Heap)

hours → recreated on every work() call (Stack)

🟡 Interview-Level Explanation (Very Powerful Answer)

“Java has three types of variables based on scope:

Local variables are stored in the stack frame of a method and have no default values. They exist only during method execution.

Instance variables are stored inside the heap within each object. Each object gets its own copy, and JVM assigns default values. They live as long as the object is reachable.

Static variables are stored in the class’s memory representation inside the Method Area, loaded once when the class is loaded. Only one copy exists per class. They persist for the lifetime of the JVM.

Local = stack
Instance = heap
Static = method area.”

This is the ideal answer for interviews and deep understanding.
