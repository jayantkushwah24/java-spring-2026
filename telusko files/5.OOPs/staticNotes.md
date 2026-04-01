# Static Variables — In‑Depth Interview Notes (Product Company Level)

> Focus language: **Java** (with cross‑language comparisons where relevant). These notes are written to clear **top product‑company interviews** (system design + low‑level + tricky MCQs).

---

## 1. What is a Static Variable?

A **static variable** belongs to the **class**, not to any individual object of the class.

* Exactly **one copy** exists per class per ClassLoader
* Shared across **all instances** of the class
* Allocated **once** when the class is loaded

```java
class Counter {
    static int count = 0;
}
```

Creating 1 object or 1 million objects → **same `count` variable**.

---

## 2. Memory Location (Very Important)

### Where does a static variable live?

| Java Version       | Memory Area               |
| ------------------ | ------------------------- |
| Java 7 and earlier | Method Area (PermGen)     |
| Java 8+            | Metaspace (native memory) |

**Key interview line:**

> Static variables are associated with the class metadata, not with heap objects.

⚠️ The **value** may reference heap objects, but the **reference itself** is static.

```java
static List<String> cache = new ArrayList<>();
```

* `cache` reference → Metaspace
* `ArrayList object` → Heap

---

## 3. Static vs Instance Variables (Tabular Comparison)

| Feature    | Static Variable      | Instance Variable |
| ---------- | -------------------- | ----------------- |
| Belongs to | Class                | Object            |
| Copies     | One                  | One per object    |
| Memory     | Metaspace            | Heap              |
| Access     | `ClassName.var`      | `obj.var`         |
| Lifetime   | Until class unloaded | Until object GC   |

---

## 4. Initialization Order (Extremely Important)

### Order when a class is loaded:

1. Static variables (top → bottom)
2. Static blocks
3. Instance variables
4. Constructor

```java
class Test {
    static int a = 10;

    static {
        a = 20;
    }

    int b = 30;

    Test() {
        b = 40;
    }
}
```

Final values after object creation:

* `a = 20`
* `b = 40`

⚠️ **Static initialization happens only once**, even if 100 objects are created.

---

## 5. Static Variable vs Static Block

| Static Variable       | Static Block        |
| --------------------- | ------------------- |
| Single statement      | Multiple statements |
| Simple initialization | Complex logic       |
| Executes once         | Executes once       |

```java
static int x = 10;

static {
    x = compute();
}
```

Use static blocks when:

* Exception handling is required
* Multi‑step initialization

---

## 6. Static Variables and Object Creation

```java
class Demo {
    static int x = 0;
    Demo() {
        x++;
    }
}

new Demo();
new Demo();
new Demo();
System.out.println(Demo.x);
```

**Output:** `3`

Reason:

* Constructor runs per object
* Static variable is shared

---

## 7. Static Variables and Inheritance (Tricky)

Static variables are **not overridden**, they are **hidden**.

```java
class Parent {
    static int x = 10;
}

class Child extends Parent {
    static int x = 20;
}

System.out.println(Parent.x); // 10
System.out.println(Child.x);  // 20
```

Access depends on **reference type**, not object type.

```java
Parent p = new Child();
System.out.println(p.x); // 10
```

Interview gold line:

> Static variables participate in **compile‑time binding**, not runtime polymorphism.

---

## 8. Static Variables and Methods

* Static methods **can access static variables directly**
* Static methods **cannot access instance variables**

```java
static int x;
int y;

static void test() {
    x = 10;   // OK
    y = 20;   // Compile error
}
```

Reason:

* Static context exists without an object

---

## 9. Static Variables and Multithreading (CRITICAL)

Static variables are **shared across threads**.

```java
static int count = 0;
```

### Problem: Race Condition

```java
count++;
```

This is **not atomic**.

### Solutions:

1. Synchronization

```java
synchronized(ClassName.class) {
    count++;
}
```

2. Atomic Variables (Preferred)

```java
static AtomicInteger count = new AtomicInteger();
count.incrementAndGet();
```

Interview expectation:

> Static variables must be carefully handled in concurrent environments.

---

## 10. Static Variables and ClassLoader (Advanced)

Each **ClassLoader** maintains its **own copy** of static variables.

```text
ClassLoader A → StaticVar = 10
ClassLoader B → StaticVar = 10 (separate copy)
```

Used in:

* Application servers
* Plugin systems
* Hot reloading

Memory leak risk:

* Static references to ClassLoader‑scoped objects

---

## 11. Static Final Variables (Constants)

```java
static final int MAX = 100;
```

### Compile‑Time Constants

```java
static final int X = 10;
```

* Inlined by compiler
* No memory reference at runtime

### Runtime Constants

```java
static final int Y = new Random().nextInt();
```

* Initialized at runtime
* Stored in memory

---

## 12. Static Variables and Garbage Collection

* Static variables are **GC roots**
* Objects referenced by static variables **cannot be garbage collected**

```java
static List<BigObject> cache = new ArrayList<>();
```

⚠️ Common memory‑leak cause in long‑running applications.

Best practice:

```java
cache.clear();
cache = null;
```

---

## 13. Static Variables in Design Patterns

### Singleton

```java
class Singleton {
    private static Singleton instance;
}
```

### Factory Registry

```java
static Map<String, Factory> registry;
```

### Configuration Holder

```java
public static Properties config;
```

---

## 14. When NOT to Use Static Variables

Avoid static variables when:

* State is request‑specific
* Multi‑tenant applications
* Unit testing isolation matters
* Dependency injection is used

Static state breaks:

* Testability
* Scalability
* Clean architecture

---

## 15. Static Variable vs Global Variable

Java does **not** support global variables.

Static variables are the **closest equivalent**, but:

* Scoped to class
* Access controlled via modifiers

---

## 16. Cross‑Language Comparison (Interview Bonus)

### C++

* Static variables can be local or global
* Lifetime = entire program

### JavaScript

```js
class A {
  static x = 10;
}
```

* Per class, not per instance

### Python

```python
class A:
    x = 10
```

* Class variable behaves like static

---

## 17. Common Interview Traps

1. Static variables are **not thread‑safe by default**
2. Static ≠ constant
3. Static variables are **not polymorphic**
4. Static references can cause memory leaks
5. ClassLoader creates multiple static copies

---

## 18. One‑Line Interview Kill Shots

* “Static variables belong to the class, not the object.”
* “They are initialized at class‑loading time.”
* “They participate in compile‑time binding.”
* “They act as GC roots and can cause memory leaks.”
* “Concurrency control is mandatory for mutable static state.”

---

## 19. Final Verdict

Static variables are powerful **but dangerous**.

Top product companies expect you to:

* Understand memory + threading implications
* Avoid abusing static state
* Justify design decisions clearly

Master this → you are already ahead of 90% candidates.

---