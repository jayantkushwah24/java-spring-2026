Object-Oriented Programming (OOP) — Deep Reference (Markdown)

Purpose: a single-file, interview-grade, authoritative reference on OOP as used in modern Java. Copy this raw Markdown into note.md. It is dense, explicit, and focused on what top-company interviewers expect: precise semantics, trade-offs, pitfalls, and concrete Java examples.

Table of contents

High-level definition & motivation

The four pillars — precise definitions

Encapsulation

Abstraction

Inheritance

Polymorphism

Design principles & rules you must know

SOLID

Composition over inheritance

Tell, don't ask

Law of Demeter

Java-specific semantics and subtleties

Class loading and initialization order

Object creation and memory layout (high-level)

[Constructors, initialization blocks, and this/super rules](#constructors-initialization-blocks-and-thissup er-rules)

Fields: default values, final, volatile, and visibility

Method dispatch: static vs dynamic, final, private, static binding

Overloading vs overriding (and bridge methods)

Generics, covariance/contravariance, and type erasure

Interfaces, abstract classes, default/private methods, and records

Immutability and safe publication

equals/hashCode contract and best practices

Cloning, copy constructors, and serialization

Design patterns through the OOP lens

Concurrency and OOP — how objects behave under threads

Performance and object design (practical)

Common interview pitfalls and precise answers to expecters’ follow-ups

Micro-exercises & study checklist (do these)

Concise cheat-sheet: must-memorize points

High-level definition & motivation

Object-oriented programming organizes code around objects — encapsulated bundles of state (fields) and behavior (methods). The goal is pragmatic: manage complexity by modeling domain concepts as interacting entities, enable code reuse, allow safer evolution (change in low-level details without wide ripple), and support reasoning about state and effects.

In interviews, OOP is not about buzzwords; it is about correct abstraction, separation of concerns, predictable mutable state, and choosing the right tool (composition, interfaces, immutability, patterns) for maintainability and concurrency.

The four pillars — precise definitions
Encapsulation

Definition (precise): Encapsulation restricts direct access to an object's internal representation and exposes a defined set of operations (the object's contract). It’s about controlling invariants and side effects.

Key consequences:

Invariants must be enforced in the class implementation (constructors, setters, factories).

Access modifiers (private / package-private / protected / public) are the primitive tools; packages + modules (JPMS) raise the abstraction level.

Encapsulation is violated by exposing mutable internals (e.g., returning internal arrays or collections without defensive copying or unmodifiable wrappers).

Java notes & examples:

public final class Money {
private final long cents;
public Money(long cents) {
if (cents < 0) throw new IllegalArgumentException("negative");
this.cents = cents;
}
public Money plus(Money other) { return new Money(this.cents + other.cents); }
public long getCents() { return cents; } // safe because primitive & final
}


If List is returned, always wrap:

public List<Item> getItems() {
return Collections.unmodifiableList(new ArrayList<>(items)); // defensive copy or unmodifiable view
}

Abstraction

Definition: Abstraction separates what an object does from how it does it. It creates an interface (conceptual boundary) that hides lower-level details.

Interview emphasis:

Use interfaces to encode behavior contracts.

Keep abstractions stable; change implementations behind them.

Prefer abstractions that minimize knowledge leaked to clients.

Example:
java.util.List<E> is an abstraction; ArrayList and LinkedList are implementations with different performance trade-offs.

Inheritance

Definition: Inheritance expresses an is-a relationship where a subtype reuses or extends the behavior/state of a supertype.

Essential caveats (interview focus):

Inheritance should express behavioral substitutability (Liskov Substitution Principle). Inheritance for code reuse alone is dangerous — prefer composition when behavior cannot be safely substituted.

Protected fields are leaky abstractions: subclass depends on superclass internals.

Java uses single class inheritance + multiple interface implementation to avoid the diamond problem. Multiple inheritance of state is disallowed.

Example pitfalls:

Extending concrete classes whose behavior is not designed for extension (e.g., String is final for good reason).

Fragile base class problem: changes in base class can break subclasses unexpectedly.

Polymorphism

Definition: Polymorphism allows code written to a supertype to operate on instances of multiple subtypes, with runtime dispatch choosing the concrete behavior.

Kinds:

Subtype polymorphism (interfaces/abstract classes).

Parametric polymorphism (generics).

Ad-hoc polymorphism (method overloading) — not runtime polymorphism.

Key Java detail: Method overriding uses dynamic dispatch (virtual methods) except for static, private, and final methods which are statically resolved.

Design principles & rules you must know
SOLID (short, precise)

S — Single Responsibility Principle: one reason to change.

O — Open/Closed: open for extension, closed for modification.

L — Liskov Substitution Principle: subtype must be substitutable for base type.

I — Interface Segregation: many specific interfaces rather than a fat one.

D — Dependency Inversion: depend on abstractions, not concretions.

Interview angle: Give concrete examples where violating a principle caused a bug or complex refactor.

Composition over inheritance

Prefer object composition and delegation when subclassing only for code reuse leads to incorrect behavioral assumptions.

Composition yields explicit dependencies and easier testability.

Tell, don't ask

Call methods to do work (tell an object to act) rather than query it for data and make decisions externally (ask). This preserves encapsulation and enables polymorphism.

Law of Demeter (principle of least knowledge)

A method m of object o should only call methods of:

o itself,

objects passed as parameters,

objects it creates,

its direct component objects,

its immediate friends (no chained a.getB().getC().doX()).

Helps avoid tight coupling.

Java-specific semantics and subtleties
Class loading and initialization order

Key facts:

Java class loading: Bootstrap → Platform → Application loaders (simplified). Static linking happens at load/resolve/link time.

Initialization order for a class:

Superclass static initializers and static fields (in textual order).

This class's static initializers/fields.

Superclass instance initializers and instance fields.

This class's instance initializers and instance fields.

Constructor body.

Static initializers run once per ClassLoader. Different class loaders can load separate copies of the same class.

Interview pitfalls to demonstrate you know:

Static initialization deadlocks (two classes initializing and referencing each other).

Class.forName() side effects (initialization vs loading).

Circular dependencies: resolved at runtime via field default values and order; but constructors can observe partially initialized state.

Object creation and memory layout (high-level)

new allocates an object header + fields. JIT and VM may perform escape analysis and allocate on stack/elide allocations.

Object header contains type pointer and synchronization metadata (mark word).

HotSpot optimizations (escape analysis, scalar replacement) can remove allocations — but design should not rely on these optimizations for correctness.

Constructors, initialization blocks, and this/super rules

Constructor chaining: the first statement must be either this(...) or super(...).

super(...) invokes the superclass constructor before subclass instance fields are initialized.

Avoid calling overridable methods from constructors — subclass overriding methods can see uninitialized state.

Bad example:

class Base {
Base() { call(); }
void call() { System.out.println("Base"); }
}
class Derived extends Base {
private final String name = "d";
@Override void call() { System.out.println(name.length()); } // NPE or 0?
}


Derived.call() may run before name is initialized. That's why calling overridable methods from constructors is unsafe.

Fields: default values, final, volatile, and visibility

Default values: object refs null, numeric primitives 0, boolean false.

final fields establish a freeze semantics: when an object is safely published, final fields are visible to other threads without additional synchronization (special JMM guarantees). But final must be set in constructor and not leak this during construction.

volatile ensures visibility and ordering for reads/writes of that field. Does not provide atomicity for compound actions.

private fields are not accessible to other classes but can be accessed via reflection (with setAccessible(true)), breaking encapsulation in a different sense — but reflection access requires privileges.

Method dispatch: static vs dynamic, final, private, static binding

Instance methods (non-private, non-static, non-final) use dynamic dispatch (runtime based on object's class).

final methods cannot be overridden — allowing potential JVM inlining optimizations.

private methods are not visible for overriding; they are statically bound to the declaring class.

static methods are class-level and statically resolved (call site determined at compile time).

Implication: obj.staticMethod() calls the compile-time type's static method, which may confuse novices.

Overloading vs overriding (and bridge methods)

Overloading: same method name, different parameter types — compile-time resolution based on static types.

Overriding: subclass provides implementation with same signature — runtime polymorphism.

Type erasure (generics) can create the need for bridge methods in generated bytecode to preserve binary compatibility for overridden methods with erased signatures.

Example:

class A {
String f(List<String> l) { ... }
}
class B extends A {
@Override
String f(List l) { ... } // after erasure signature matches; compiler may generate bridge methods
}

Generics, covariance/contravariance, and type erasure

Java generics are invariant: List<Dog> is not assignable to List<Animal>.

Use wildcards:

? extends T — covariance for read-only: you can read T but cannot safely add (except null).

? super T — contravariance for write: you can add T but reading yields Object.

Type erasure: generic type parameters are removed at runtime; this means you cannot use instanceof List<String> or create new T[]. Erasure also requires casts in some cases — the compiler inserts them.

Bounded type parameters and wildcards matter for API design to preserve flexibility while maintaining type safety.

Interfaces, abstract classes, default/private methods, and records

Interfaces define contracts; since Java 8, they can have default and static methods. Since Java 9, they can have private methods. Default methods create multiple-inheritance-of-behavior scenarios that are resolved by priority rules (class wins over interface; most specific interface wins).

Abstract classes hold partial implementations and state; use when you need sharing of state across implementations.

record (Java 14+) provides a compact syntax for immutable data carriers with canonical constructor, equals, hashCode, and toString. Use when you want transparent, shallowly immutable data objects.

Conflict resolution (interfaces):

If a class inherits multiple default methods with same signature, explicit override required or the class must disambiguate.

Immutability and safe publication

Immutable objects are thread-safe (provided fields are themselves immutable and no leaking of this).

Construction must ensure no visible reference escapes before construction completes.

Safe publication options: final fields correctly published (constructor finishes without leaking this), volatile reference assignment, storing reference into a final field of another object, initialization within a static initializer, synchronization-based publication.

equals/hashCode contract and best practices

Rules:

equals is reflexive, symmetric, transitive, consistent, and for any non-null x, x.equals(null) must be false.

If a.equals(b) then a.hashCode() == b.hashCode() must hold.

Implement equals and hashCode together. Use the same fields for equality and hashing.

Consider using Objects.equals and Objects.hash or IDE-generated implementations. For performance-sensitive classes, hand-optimized hashCode may be required.

For inheritance hierarchies, consider whether equals should be final in base class (to avoid symmetry issues) or use the getClass() vs instanceof debate:

Use getClass() for strict type equality (no cross-type equality).

Use instanceof if equality can sensibly be extended to subclasses — risk violating symmetry if subclass adds extra fields.

Cloning, copy constructors, and serialization

Cloneable and Object.clone() are considered broken by many experts: shallow copy defaults and checked exception make it awkward.

Prefer copy constructors or static factory methods (MyType copyOf(MyType other)) for copying — explicit and easier to reason about.

Serialization (Serializable) has security, versioning, and performance pitfalls. Prefer external serialization mechanisms (JSON, protobuf) or java.io.Serializable only when necessary and with explicit serialVersionUID and careful readObject/writeObject handling.

Design patterns through the OOP lens

Present patterns as solutions to recurring design trade-offs. For interviews, explain intent, structure, consequences, and a small Java example.

Creational

Factory Method / Abstract Factory — abstract object creation; useful to decouple clients from concrete classes.

Builder — for constructing complex immutable objects with many parameters; preferable to telescoping constructors.

Singleton — global access point. Prefer enum singletons in Java (enum Singleton { INSTANCE; }) for serialization safety and thread-safety.

Structural

Adapter — translate one interface to another; useful for integrating legacy code.

Decorator — add responsibilities at runtime; prefer composition for flexible wrapping (e.g., InputStream filters).

Proxy — control access (virtual/protection/remote); java.lang.reflect.Proxy & dynamic proxies for interfaces; CGLIB for classes (historically).

Behavioral

Strategy — encapsulate algorithms as interchangeable objects; often preferable to conditional logic.

Observer — event/notification decoupling; used in event-driven architectures.

Command — encapsulate requests as objects; makes undo/queueing easier.

Interview expectation: Don’t memorize templates—explain trade-offs: complexity, testability, coupling, and where pattern would or would not be applied.

Concurrency and OOP — how objects behave under threads
Thread-safety categories

Immutable: inherently thread-safe.

Stateless: thread-safe if methods don't mutate shared data (e.g., Spring singleton controllers must be stateless).

Thread-safe mutable: uses synchronization or concurrency controls.

Thread-confined: only accessed by one thread.

Guarded-by annotations / conventions: document what lock protects which fields (e.g., @GuardedBy("this")).

Synchronization primitives (brief)

synchronized — mutual exclusion + memory visibility.

volatile — visibility and ordering for single variable reads/writes.

java.util.concurrent — ReentrantLock, ReadWriteLock, Atomic* classes, ConcurrentHashMap, etc.

Higher-level constructs: CompletableFuture, ExecutorService, Phaser, CountDownLatch.

Object-level design for concurrency

Prefer immutability to avoid synchronization.

Encapsulate synchronization inside the class (do not expose lock objects publicly).

For composite objects, avoid external synchronization spanning multiple objects (deadlock risk). Acquire locks in canonical order or use tryLock/timeouts.

Visibility gotchas:

Without proper synchronization, a thread may see a partially constructed object. Use final fields or publish via volatile/reference with synchronization.

Performance and object design (practical)
Object granularity

Frequently-created short-lived objects are fine; JVM optimizes with generational GC and escape analysis.

Avoid creating unnecessary temporary objects in hot code paths (boxing, string concatenation in loops — prefer StringBuilder or StringJoiner).

Prefer primitive fields for performance-sensitive classes.

Memory footprint

Consider using primitives and compact representations (e.g., int instead of Integer).

Use transient for fields not needed for serialization.

For huge collections, consider memory-efficient data structures (Troves, primitive arrays, or specialized libraries).

Equality and hashing cost

equals and hashCode should be O(1) ideally. Avoid expensive operations inside these methods because hash containers call them frequently.

Common interview pitfalls and precise answers to expecters’ follow-ups

"Why not use inheritance?"
Answer: Because inheritance couples to implementation and can violate LSP. Use it only when subtype guarantee holds; otherwise use composition. Give example: extending ArrayList to add logging breaks encapsulation of ArrayList internals.

"What's the difference between interface and abstract class?"
Answer: Interfaces declare behavior contract (multiple inheritance of type) and since Java 8 can include behavior (default). Abstract classes can hold state and constructors. Choose interface for type abstraction and abstract classes for shared code + state where single inheritance is acceptable.

"How do you make a class immutable?"
Answer (concise checklist):

final class (or careful design),

all fields private final,

no setters,

defensive copies on input and output,

do not leak this during construction,

ensure referenced objects are also immutable or unmodifiable.

"Explain Liskov Substitution Principle with example."
Answer: Subtype must honor base-type behavior. Example: Rectangle and Square — implementing Square extends Rectangle often violates LSP because setWidth and setHeight semantics change; prefer composition or separate interface.

"Is synchronized enough for thread-safety?"
Answer: synchronized provides mutual exclusion and visibility for the guarded fields but it must be applied consistently. For non-blocking needs, prefer Atomic* primitives or higher-level concurrency constructs. Also mention volatile differences and the need for compound action atomicity.

"When to override equals/hashCode or compareTo?"
Answer: Implement equals/hashCode when identity is value-based (keys for maps/sets). Use compareTo when class has natural ordering (and maintain compareTo consistent with equals ideally). Discuss transitive and consistent contracts.

Micro-exercises & study checklist (do these)

Implement an immutable Money value object, including equals, hashCode, toString, and tests for serialization and concurrency visibility. Show defensive copying for collections.

Create Rectangle and Square examples demonstrating LSP violation; then refactor with Composition.

Implement a thread-safe Counter using synchronized, then an alternate using AtomicLong. Benchmark and reason about trade-offs.

Write a Builder for a class with 10 optional fields — test method chaining and immutability.

Show a List wrapper that enforces read-only access (Decorator pattern) and test runtime behavior.

Implement equals in inheritance (use getClass() vs instanceof) and produce test cases that fail when using inconsistent policies.

Concise cheat-sheet: must-memorize points

equals + hashCode must be consistent; implement together.

Prefer composition to inheritance for code reuse.

Do not call overridable methods from constructors.

Make objects immutable for thread-safety where possible.

Use final for fields you want frozen; volatile for visibility; synchronized for mutual exclusion.

Generics are compile-time only (type erasure); use wildcards for API flexibility.

interface = contract; abstract class = partial implementation + state.

Default methods in interfaces can produce ambiguity — resolve explicitly.

Avoid Cloneable — prefer copy constructors/factories.

For equality in hierarchies, think about symmetry and transitivity; prefer composition or final equality methods to avoid subtle bugs.

Appendix — curated Java code examples
Immutable Money value object
public final class Money {
private final long cents;
public Money(long cents) {
if (cents < 0) throw new IllegalArgumentException("negative");
this.cents = cents;
}
public Money plus(Money other) { return new Money(this.cents + other.cents); }
public Money minus(Money other) { return new Money(this.cents - other.cents); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return cents == money.cents;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(cents);
    }

    @Override
    public String toString() {
        return String.format("%d.%02d", cents / 100, Math.abs(cents % 100));
    }
}

Builder pattern for complex immutable object
public final class User {
private final String username;
private final String email;
private final Optional<String> phone;

    private User(Builder b) {
        this.username = b.username;
        this.email = b.email;
        this.phone = Optional.ofNullable(b.phone);
    }

    public static class Builder {
        private final String username; // required
        private final String email; // required
        private String phone; // optional

        public Builder(String username, String email) {
            this.username = Objects.requireNonNull(username);
            this.email = Objects.requireNonNull(email);
        }
        public Builder phone(String phone) { this.phone = phone; return this; }
        public User build() { return new User(this); }
    }
}

Dangerous constructor example (do not do)
public class Bad {
public Bad() {
startThread(this); // `this` escapes during construction -> unsafe publication
}
private void startThread(Object obj) { new Thread(() -> doWork(obj)).start(); }
}


Fix: avoid leaking this during construction. Use factories or init method after fully constructed.

Final words — practical interview posture

Be precise: interviewers probe edge cases. When you answer, mention exceptions and why a design might fail or be disallowed.

Use small code snippets to demonstrate points; prefer final and immutability in examples.

Show trade-offs: simplicity vs flexibility, performance vs safety.

Practice articulating why you chose composition or a pattern — not just what it is.

Quick reference links (for your local copy)

Java Language Specification — Class and Instance Initialization (memorize the order).

Effective Java — Joshua Bloch (items on immutability, equals/hashCode, constructors vs factories).

Java Concurrency in Practice — Brian Goetz (for safe publication and concurrency semantics).

(Include these references in your study plan; interviewers expect familiarity with these exact concepts.)