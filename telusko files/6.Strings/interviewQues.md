# 3. 100 Interview Questions

### **Foundational (1–30)**

1. Why are Strings immutable?
2. How does SCP work internally?
3. Explain string interning with memory diagrams
4. Difference b/w `==` and `.equals` in Strings
5. When does compiler optimize string concatenation?
6. What was substring memory leak pre-Java 7?
7. Difference between `"abc"` vs `new String("abc")`
8. Where is SCP stored in Java 8?
9. How does hashCode caching work?
10. Why is String final?
11. What is String deduplication?
12. Why is `char[]` replaced by `byte[]` in Java 9?
13. Explain Latin-1 vs UTF-16 optimization
14. Is String thread-safe? Why?
15. How does String.intern() behave in Java 6 vs 7+
16. How does JVM optimize `"a" + "b"`?
17. Why is `StringBuffer` thread-safe?
18. Why is StringBuilder faster?
19. When to use StringBuilder over StringBuffer?
20. Does string concatenation always create new object?
21. Explain string pooling algorithm
22. What is a rope (string tree)?
23. Why doesn’t JVM use ropes for String?
24. How does GC treat SCP?
25. Why could too many interned Strings cause OOM?
26. Performance cost of `.substring()` in Java 7+ vs 6
27. How does JIT optimize StringBuilder?
28. Are Strings stored in stack?
29. Explain escape analysis for string concatenation
30. How does JVM compress strings?

---

### **Advanced (31–70)**

31. Explain String object memory layout
32. Explain compression flag in String
33. How many bytes does `"abcd"` use in Java 11?
34. How to detect string encoding issues
35. Difference b/w char and codePoint
36. Why StringBuilder capacity formula is (old*2+2)
37. Cost of copying char[] during resize
38. Why not use StringBuffer always?
39. Why StringBuilder.append is not atomic
40. What happens when StringBuilder overflows capacity
41. How equals() works internally
42. Why StringBuffer considered legacy
43. How JDK optimizes loops with `+=`
44. Explain string deduplication in G1 GC
45. Why string interning reduces memory footprint
46. Draw memory map of `"hello" + x`
47. When intern() returns new vs old reference
48. Performance cost of calling intern() frequently
49. Why avoid string concatenation in large loops
50. How JVM decides when to flatten concatenation
51. Why String implements Comparable
52. How compareTo() works internally
53. What is lex ordering?
54. Why String hash function multiplies by 31
55. Explain polynomial rolling hash for strings
56. Why StringBuilder is not poolable
57. Intern pool structure: HashTable or Tree?
58. Why substring copies array in Java 7+
59. Why string literals survive class unloading
60. Why char[] is not UTF-8
61. Explain surrogate pairs
62. Why String is not lazy-evaluated
63. Why JVM avoids interning results of toString()
64. Why charAt is constant-time
65. Why StringBuilder reversible operations are O(n)
66. Memory differences: String vs byte[]
67. True immutability? Is it enforced?
68. ASCII compression in Java 9
69. Details of coder flag
70. How GC compacts interned strings

---

### **Expert (71–100)**

71. Implement your own intern pool — design considerations
72. Design a memory-efficient string storage architecture
73. How would you implement a mutable string?
74. Implement substring without copying
75. How to eliminate duplication of substrings
76. Optimize storage for millions of repeated strings
77. JVM-level optimizations for strings
78. How to detect duplicate strings at scale
79. String indexing performance analysis
80. How does StringBuilder interact with CPU cache?
81. Branch prediction effects on charAt
82. Runtime cost of polymorphic call in substring
83. Locking cost in StringBuffer under contention
84. Implement parallel string concat
85. Design string chunking algorithm
86. Implement checkpointed string builder
87. Optimize large document parsing
88. Implement rolling hash collision-proofing
89. Unicode normalization trade-offs
90. Multi-threaded string assembly design
91. Build DSL using strings
92. Streaming string builder design
93. Compare UTF-8 vs UTF-16 for Java
94. Implement memory-mapped string storage
95. Design zero-copy substring engine
96. Build concurrent string dictionary
97. Cache-friendly string comparison
98. Cost of hashing vs comparing strings
99. KV store optimized for string keys
100. Building large-scale string-processing systems

---
