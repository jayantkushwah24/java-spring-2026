# 100 OOP Coding Exercises (Java-focused) — Raw Markdown

> Instructions: each item is a standalone exercise. Implement in Java, write tests, and document class diagram and public API. Start simple and progressively add constraints/extensions.

## Beginner (1–25) — core OOP, classes, encapsulation, basic collections

1. **Money Value Object** — implement immutable `Money` with cents, addition, subtraction, comparison; Requirements: `equals/hashCode/toString`; Extensions: currency code and conversions.
2. **Immutable Person** — create immutable `Person(name, dob)`; Requirements: defensive copy for mutable fields; Extensions: age calculation and validation.
3. **Rectangle & Square (LSP)** — implement `Rectangle` with width/height and `Square extends Rectangle`; Demonstrate LSP violation and refactor using composition.
4. **Simple Bank Account** — `Account` with deposit/withdraw, balance validation; Requirements: custom exceptions for insufficient funds; Extensions: transaction history.
5. **Student Gradebook** — model `Student`, `Course`, `Grade`; calculate GPA; Requirements: encapsulate collections and provide read-only views.
6. **Library Book + Borrowing** — `Book`, `Member`, `Loan` classes; enforce borrowing limits; Extensions: overdue calculation.
7. **Toy Inventory (Builder)** — implement `Toy` with many optional fields using Builder pattern; Requirements: immutability after build.
8. **Read-Only List Wrapper (Decorator)** — wrap `List<E>` to prevent mutation; Requirements: throw `UnsupportedOperationException` on mutators.
9. **Simple Logger (Strategy)** — implement `Logger` with interchangeable `Formatter` strategies; Requirements: console and file formatters.
10. **Temperature Converter (Factory)** — factories for `Celsius`, `Fahrenheit`, `Kelvin` converters; Requirements: unit tests for conversions.
11. **Simple Employee Hierarchy** — `Employee` base + `Developer`/`Manager` subclasses; Requirements: polymorphic `calculateBonus()`; Extensions: add commission.
12. **Immutable Point & Distance** — `Point(x,y)` immutable with distance methods; Requirements: `equals/hashCode`.
13. **Enum-Based State Machine** — simple `Order` states using `enum` with transitions; Requirements: illegal transitions throw.
14. **Command Pattern — Light Switch** — `Command` interface, `OnCommand`, `OffCommand`, `Invoker`; Requirements: undo operation.
15. **Simple Cache (LRU)** — implement LRU cache using composition + `LinkedHashMap`; Requirements: thread-unsafe baseline.
16. **Student Builder + Validation** — builder with required/optional fields and validation rules; Requirements: fluent API.
17. **Shape Drawing API (Polymorphism)** — abstract `Shape` with `draw()`; concrete shapes override; Requirements: shape area calculations.
18. **Simple CSV Serializer** — object-to-CSV serializer using reflection for public fields/getters; Requirements: handle escaping.
19. **Pair/Triple Generic Classes** — implement generic `Pair<A,B>` and `Triple<A,B,C>`; Requirements: immutability and useful factory methods.
20. **Custom Exceptions Hierarchy** — design domain exceptions for a small domain (e.g., `BankingException` and subtypes); Requirements: proper messaging and cause chaining.
21. **Immutable Collection Snapshot** — class that captures mutable collection snapshot and exposes immutable view; Requirements: deep copy for nested mutable elements.
22. **Simple Iterator for Fibonacci** — `FibonacciIterator implements Iterator<Integer>` generating sequence on demand; Requirements: lazy generation.
23. **Adapter Pattern — Third-Party API** — adapt an existing class with incompatible interface to your own interface.
24. **Simple Validator Framework** — interface `Validator<T>` and combinators (`and`, `or`); Requirements: produce error messages.
25. **Phone Number Value Object** — immutable parser/formatter for phone numbers with validation rules.

## Intermediate (26–60) — inheritance, interfaces, generics, collections, I/O, basic concurrency

26. **Inventory System with Aggregation** — `Warehouse` contains `Item`s with quantities; Requirements: transfer between warehouses.
27. **Observer Pattern — Event Bus** — implement simple event bus with listeners and event dispatch; Requirements: synchronous dispatch, priorities.
28. **Factory Method — Shape Factory** — create shapes from config string; Requirements: plug-in new shapes via registration.
29. **Prototype Pattern — Deep Clone** — implement deep clone for a complex graph without using `Cloneable`; Requirements: cycle handling.
30. **Thread-Safe Counter** — implement counter with `synchronized` and then with `AtomicLong`; Requirements: unit tests for concurrency.
31. **Custom Thread Pool (simplified)** — minimal `ThreadPool` with task queue and worker threads; Requirements: shutdown semantics.
32. **Strategy Pattern with Comparator** — implement multiple sort strategies for `Person` and switch at runtime.
33. **Template Method — Data Processing Pipeline** — abstract base for reading-processing-writing with hooks.
34. **DAO Pattern with In-Memory Storage** — `Repository<T>` interface and `InMemoryRepository<T>` implementation; Requirements: CRUD and pagination.
35. **Simple ORM Mapper (reflection)** — map result rows (`Map<String,Object>`) to POJOs via annotations.
36. **Event Sourcing Basics** — model aggregate root with event list and apply/replay mechanism; Requirements: snapshot support.
37. **Decorator Pattern — Stream Filters** — chainable filters that modify data in a pipeline.
38. **Command Bus with Undo/Redo** — commands recorded and support undo/redo stacks.
39. **Rate Limiter (Token Bucket)** — implement token-bucket limiter as an object; Requirements: thread-safe and leaky-bucket variant.
40. **Immutable Tree Structure** — persistent immutable tree (functional-style) with structural sharing; Requirements: insert/delete produce new tree.
41. **Visitor Pattern — AST Evaluation** — build small expression AST and evaluate via Visitor.
42. **Balance Transfer with Transactions (simulated)** — model services and perform transfers with rollback semantics simulated in-memory.
43. **Custom Serialization Format** — design and implement simple binary serializer for objects with versioning.
44. **Type-Safe Heterogeneous Container** — implement container that stores multiple typed objects safely.
45. **Priority Queue with Custom Comparator** — implement wrapper exposing stable ordering and tie-breakers.
46. **Graph Data Structure (OOP)** — classes for `Node` and `Edge` with graph algorithms (BFS/DFS).
47. **Repository + Specification Pattern** — query objects as specifications to filter in-memory data.
48. **Service Locator vs DI simple container** — implement and compare two simple implementations.
49. **Plugin Loader using Reflection** — load implementations from classpath and instantiate via interface.
50. **State Pattern — Vending Machine** — implement states and transitions for vending logic.
51. **Observer with Weak References** — implement listeners registered with weak refs to avoid leaks.
52. **Immutable BiMap** — implement immutable bidirectional map with inverse lookup.
53. **Builder + Validation Framework Integration** — builder that validates with pluggable validators.
54. **Transaction Log Replay** — write transactional operations to log and replay to reconstruct state.
55. **Thread-Confined Resource Manager** — ensure resources are used only by owning thread; Requirements: assert and tests.
56. **Dynamic Proxy for Logging** — use `java.lang.reflect.Proxy` to log method calls for any interface.
57. **Composite Pattern — File System** — implement `File` and `Directory` composite with size and traversal.
58. **Cache with Eviction Policies** — LRU, LFU implementations using strategy pattern.
59. **Dollar-Cost Averaging Simulator** — model investment operations over time with strategies pluggable.
60. **Data Transfer Objects + Mapper** — design DTOs and mappers with tests and null-handling.

## Advanced (61–90) — design patterns, performance, JVM, concurrency, testing, architecture

61. **Custom Classloader Demo** — load same class twice in different classloaders and show isolation.
62. **Devirtualization Experiment** — write benchmark comparing final vs non-final method calls and explain results.
63. **Producer-Consumer with BlockingQueue** — robust implementation with multiple producers/consumers and graceful shutdown.
64. **Thread-Safe LRU Cache** — implement with concurrent structures; Requirements: minimal lock contention.
65. **Actor-like Lightweight System** — implement mailbox-based actors exchanging immutable messages.
66. **Reactive Pull-Push Adapter** — adapter between blocking iterator and reactive push-style interface.
67. **Deadlock Detector (simulation)** — simulate lock ordering and detect deadlock conditions; Requirements: reporting.
68. **Immutable Snapshot for High-Concurrency Reads** — design data structure optimized for many readers, few writers.
69. **CQRS (Command Query Responsibility Segregation) Mini** — separate write model and read model with event propagation.
70. **Circuit Breaker Implementation** — implement CB with failure thresholds, half-open, and metrics.
71. **Custom GC-Friendly Pool** — object pool minimizing GC pressure using arrays and reuse patterns.
72. **Design a Scheduler (cron-like)** — schedule tasks, persistence of schedules, time-zone handling.
73. **Actor Supervision Strategy** — design restart strategies with backoff and state reconciliation.
74. **Pluggable Authentication Mechanism** — design interface and multiple implementations (basic, token, oauth-sim).
75. **Distributed Lock Simulator** — simulate a distributed lock service (consensus omitted) and client usage.
76. **High-Performance Ring Buffer** — implement single-producer/single-consumer ring buffer (disruptor-like).
77. **Class Diagram & Refactor Exercise** — given a messy codebase, propose OOP refactors with patterns and justify.
78. **Serialization Compatibility Across Versions** — design format and migrate old serialized data safely.
79. **Implement `CompletableFuture`-like API** — simplified futures with chaining, exceptions, and combining.
80. **Multi-tenant Resource Quota Manager** — per-tenant quotas with isolation and fair sharing.
81. **Design Pluggable Metrics Collector** — interface to collect metrics with backends (console, prometheus-like).
82. **Snapshot Isolation Simulation** — simulate concurrent transactions with snapshot isolation semantics.
83. **API Rate Limiter with Persistence** — enforce global rate limits persisted across restarts.
84. **Plugin Hot-Reload Framework** — load/unload plugins at runtime and manage version compatibility.
85. **Design & Implement Saga Orchestrator** — orchestrate distributed transactions with compensations.
86. **Immutable Data Structure Library** — implement persistent list, map, and set with good complexity.
87. **Design a DSL with AST and Visitor** — small DSL parser producing AST and visitors for evaluation and optimization.
88. **Zero-Downtime Schema Migration Simulator** — design approach for entity changes without downtime.
89. **Security: Object Capability Model Demo** — design objects that grant limited capabilities instead of global permissions.
90. **High-Availability Leader Election (simulated)** — design and simulate leader election and failover handlers.

## Expert / Top-Company-Level (91–100) — systems, puzzles, heavy design + proofs

91. **Design a Distributed Cache with Consistency** — describe and implement a simplified partitioned cache with eventual consistency and simple reconciliation.
92. **Design & Implement a Typed Messages RPC Framework** — generate stubs at runtime, support versioning and backward compatibility.
93. **Design a Pluggable, Type-Safe Workflow Engine** — model tasks/states, dynamic wiring, compensation, and long-running workflows.
94. **Design a Real-Time Collaborative Editor (operational transform / CRDT)** — implement core data type and convergence proofs via tests.
95. **Implement a Consensus Simulator (simplified Raft)** — simulate leader election, log replication, and handle network partitions in tests.
96. **Design a Transactional In-Memory Database Engine** — MVCC, snapshots, isolation levels, and recovery from log.
97. **Implement an Efficient Query Planner for In-Memory Data** — cost-based planner and simple optimizer with rule system.
98. **Design a Secure Sandbox for Third-Party Code Execution** — classloader isolation, permission model, resource quotas, revocation.
99. **Design & Build a Static Analysis Tool for OOP Anti-Patterns** — detect God classes, cyclic dependencies, LSP violations, and suggest fixes.
100. **End-to-End: Build a Microservice Platform Minimal Stack** — implement service registration, discovery, circuit breakers, metrics, tracing headers, and pluggable auth; provide sample services and failure tests.

---

# Recommended workflow for each exercise

1. Write a short spec and class diagram.
2. Implement minimal passing solution.
3. Add unit tests (including concurrency tests where applicable).
4. Document public API and trade-offs.
5. Add one or two extensions/challenges from the "Extensions" implied above.

# Suggested tools & grading

- Use JUnit 5 + Mockito for tests.
- For concurrency exercises, use `ExecutorService` and stress tests.
- Measure performance where relevant (JMH for microbenchmarks).
- Score yourself on correctness, tests, documentation, and design (0–10).

---

End of list.
