# JDK vs JRE vs JVM (In-Depth Notes)

---

# 1. JVM (Java Virtual Machine)

## What is JVM?

The **Java Virtual Machine (JVM)** is an abstract runtime engine responsible for executing Java **bytecode**.  
It provides the environment where Java programs run.

It is **platform-dependent** (different JVM for Windows, Linux, macOS) but **bytecode is platform-independent**.

---

## Responsibilities of JVM

### 1. **Loads Code**

ClassLoader loads `.class` files (bytecode) into memory.

### 2. **Verifies Code**

Bytecode Verifier ensures:

- No illegal memory access
- No stack manipulation errors
- Secure execution

This provides **Java’s strong security model**.

### 3. **Executes Code**

JVM uses two techniques:

- **Interpreter** → Executes bytecode instruction-by-instruction
- **JIT Compiler** → Converts hot code into machine code for high performance

### 4. **Memory Management**

JVM manages memory automatically:

- Heap (Objects)
- Stack (Method calls)
- PC Register
- Native Method Stack
- Metaspace (Class metadata)

### 5. **Garbage Collection (GC)**

Reclaims memory of unused objects automatically.

---

## JVM Final Summary

### JVM = Runs bytecode + Manages memory + Performs JIT + Provides portability & security.

---

# 2. JRE (Java Runtime Environment)

## What is JRE?

The **Java Runtime Environment** provides everything required to **run** a Java application, but NOT to develop one.

It includes:

- JVM
- Core libraries (rt.jar / modules)
- Supporting configuration files
- Java class libraries (Collections, IO, Networking, etc.)

---

## What JRE Contains

| Component                   | Description                                  |
| --------------------------- | -------------------------------------------- |
| **JVM**                     | Executes bytecode                            |
| **Java Standard Libraries** | Pre-written classes from Java API            |
| **Runtime files**           | Property files, resources, security policies |

---

## What JRE Does NOT Contain

- `javac` (Java Compiler)
- Debuggers
- Profilers
- Development tools

Thus, **you cannot develop Java programs using only JRE**.

---

## JRE Final Summary

JDK = JRE + Compiler + Debugger + Development Tools

---

# 4. Relationship Between JDK, JRE, JVM

      ┌─────────────────────────────┐
      │             JDK             │
      │  (Development + Runtime)    │
      │                             │
      │  ┌───────────────────────┐  │
      │  │         JRE           │  │
      │  │     (Only Runtime)    │  │
      │  │                       │  │
      │  │   ┌───────────────┐  │  │
      │  │   │     JVM       │  │  │
      │  │   │ (Executes     │  │  │
      │  │   │  Bytecode)    │  │  │
      │  │   └───────────────┘  │  │
      │  └───────────────────────┘  │
      └─────────────────────────────┘

---

# 5. Key Differences in Table Form

| Feature                | JVM           | JRE            | JDK                     |
| ---------------------- | ------------- | -------------- | ----------------------- |
| Contains Compiler?     | ❌ No         | ❌ No          | ✔ Yes (`javac`)         |
| Can Run Java Code?     | ✔ Yes         | ✔ Yes          | ✔ Yes                   |
| Can Compile Java Code? | ❌ No         | ❌ No          | ✔ Yes                   |
| Contains JVM?          | ✔ Itself      | ✔ Yes          | ✔ Yes                   |
| Use Case               | Runs bytecode | Runs Java apps | Develop + run Java apps |

---

# 6. Final Summary for Interviews

JVM executes bytecode.
JRE provides JVM + libraries needed to run Java programs.
JDK provides JRE + development tools needed to write and compile Java programs.

- **JDK = JRE + javac + dev tools**
- **JRE = JVM + libraries**
- **JVM = Executes bytecode**

---

# End of File
