Dynamic Dispatch (Very Deep Dive)
1. What Dynamic Dispatch Is

Dynamic dispatch is the runtime mechanism that determines which implementation of an overridden method should execute when a method is invoked through a reference of a superclass type.

This is the backbone of runtime polymorphism in Java.

In simple terms:

The method to run is selected at runtime, based on the actual object (the instance), not the reference type.

2. Why It Exists

Java is built around subtype polymorphism (OOP).
Dynamic dispatch solves a critical need:

Variables, parameters, and fields often hold references to objects of different subclasses.

The compiler cannot know which class instance the reference will point to at execution time.

Therefore, the method binding must be deferred to runtime.

This supports key OOP goals:

Extensibility

Late-binding

Separation of interface and implementation

Substitutability (Liskov Substitution Principle)

3. How Dynamic Dispatch Works Internally

Java uses a virtual method table (vtable)–like mechanism in the JVM.

3.1 Key Concepts

Every class has a method table mapping method signatures to actual implementations.

When a subclass overrides a method, it replaces the parent’s entry in its vtable.

At runtime, when the JVM needs to execute a method:

It looks at the actual object's class

Consults that class’s vtable

Resolves the correct overridden method

Invokes it

3.2 Execution Steps

Consider:

Parent p = new Child();
p.doWork();


Runtime steps:

Reference type is Parent, but object on heap is Child.

JVM calls invokevirtual bytecode.

JVM uses reference to locate object header → class pointer.

Class pointer gives access to Child.class metadata.

From Child’s vtable, JVM resolves the actual method.

Child’s overridden method executes.

Static types influence compile-time checks only; execution depends strictly on instance type.

4. Dynamic vs Static Dispatch
   Feature	Static Dispatch	Dynamic Dispatch
   When Resolved	Compile-time	Runtime
   Used For	Method overloading	Method overriding
   Based On	Reference type + argument types	Actual instance of the object
   Bytecode Instruction	invokestatic, invokespecial	invokevirtual, invokeinterface
5. Bytecode Level Understanding

Java's dynamic dispatch relies on specific JVM instructions:

invokevirtual → for dispatch on class methods (non-private, non-static, non-final)

invokeinterface → for dispatch on interface methods

These instructions trigger the dynamic resolution process.

Important:

private, static, final, and constructors use static dispatch (no polymorphism)

Only virtual methods participate in dynamic dispatch.

6. Why Dynamic Dispatch Is Fundamental to Java OOP

Core of inheritance-based polymorphism
Without it, subclassing would lose most of its power.

Design Patterns rely on it

Strategy

Template Method

Factory Method

Visitor

State

Command

Spring Framework internally relies heavily on dynamic dispatch

Bean method overrides

Proxy-based AOP

Transaction interceptors

DispatcherServlet delegations

7. Example to Demonstrate Deep Behavior
   class A {
   void f() { System.out.println("A"); }
   }

class B extends A {
void f() { System.out.println("B"); }
}

A ref = new B();
ref.f(); // prints B


Reason:

JVM resolves method using actual object B → dynamic dispatch.

Even more subtle:

A ref = new B();
A ref2 = new A();

ref.f();  // B
ref2.f(); // A


Two references of the same type (A) produce different outputs solely because dynamic dispatch selects based on the actual instance, not reference.

8. When Dynamic Dispatch Does NOT Occur

No dynamic dispatch for:

static methods (static dispatch)

private methods (not polymorphic)

constructors

final methods (cannot be overridden)

fields (field hiding ≠ method overriding)

Example pitfall:

class A {
int x = 10;
}

class B extends A {
int x = 20;
}

A ref = new B();
System.out.println(ref.x); // prints 10 (no dynamic dispatch)


Field access is resolved at compile-time using reference type.

9. Dynamic Dispatch in Interface Calls

Interface method invocation uses invokeinterface.

Process:

JVM checks object instance at runtime

Locates implementation class metadata

Resolves method

Invokes actual implementation

Dynamic dispatch prevents interface calls from losing performance or correctness.

10. Performance Characteristics

Dynamic dispatch is fast due to:

vtable caching

method resolution caching

inline caching in JIT

hotspot optimizations

However:

It is slower than static dispatch

It prevents some compiler optimizations

But in modern JVMs the cost is negligible

In high-performance systems, patterns like:

final classes

sealed classes

static methods

devirtualization (JIT optimization)

can reduce dynamic dispatch overhead.

11. Interview-Grade Talking Points

Senior-level candidates should mention:

Java implements polymorphism through dynamic dispatch using vtables.

The JVM resolves overridden methods at runtime via invokevirtual/invokeinterface.

Dynamic dispatch applies only to instance methods, not static/private/final/constructors.

Field access is statically bound, unlike methods.

It is foundational for frameworks like Spring (proxying, AOP, DI).

The JIT can optimize dynamic dispatch via inline caching and devirtualization.

Dynamic dispatch enables LSP and OOP extensibility.