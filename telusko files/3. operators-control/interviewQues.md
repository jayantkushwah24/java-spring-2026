# 🟩 30 Best Java Interview Questions — Operators + Control Flow

These questions test:

- deep understanding
- tricky operator behavior
- pitfalls
- compiler rules
- JVM execution
- control flow mastery
- real interview patterns

---

## 1. Explain operator precedence and associativity in Java.

Why does this expression produce its output?
int x = 10 + 20 \* 3 / 2 % 5;

yaml
Copy code

---

## 2. What is short-circuit evaluation?

Explain how `||` and `&&` can prevent NullPointerException with an example.

---

## 3. Difference between `==`, `!=`, `.equals()`, and `compareTo()`?

Explain with primitives, wrappers, and Strings.

---

## 4. Explain step-by-step evaluation of:

int a = 5;
int b = a++ + ++a + a-- + --a;

yaml
Copy code

---

## 5. Why is assignment (`=`) right-associative?

Explain execution of:
int a, b, c;
a = b = c = 20;

yaml
Copy code

---

## 6. What is the difference between `&` and `&&`, `|` and `||`?

Explain bitwise vs logical in depth.

---

## 7. Why are bitwise operators fast?

Explain how CPU ALU handles them.

---

## 8. What is the purpose of the unsigned right shift `>>>`?

Why is it needed when Java has no unsigned integers?

---

## 9. Explain why this code fails:

if (x = 10) { }

yaml
Copy code

---

## 10. Why can’t we use floating values inside switch?

Explain JVM bytecode-level reason.

---

## 11. What happens inside switch without a break?

Explain fall-through with a real example.

---

## 12. What is the difference between if-else and switch in terms of:

- performance
- JVM optimizations
- readability
- jump tables vs linear evaluation

---

## 13. Explain the flow of `for`, `while`, and `do-while` loops using a flow diagram.

---

## 14. What is an infinite loop?

Give examples using:

- for
- while
- do-while

Explain how JVM handles them at runtime.

---

## 15. What is an enhanced for-loop (for-each)?

Why can't we modify the collection inside it?

---

## 16. Explain the purpose of labeled break.

Give a scenario where labeled break is the only clean solution.

---

## 17. Why must local variables be initialized before use?

Explain the compiler and memory model reason.

---

## 18. What is the difference between break, continue, and return?

Explain their bytecode behavior.

---

## 19. What is the difference between pre-increment and post-increment in JVM bytecode?

Explain using: `i++` vs `++i`.

---

## 20. Explain "dead code" in control statements.

Why does Java prohibit:
if (false) { ... }

yaml
Copy code

---

## 21. Why can't switch accept long, float, double, or boolean?

Explain with bytecode and compatibility reasons.

---

## 22. Write a program to print numbers 1 to 100 without using loops.

(Hint: recursion or streams)  
Explain the internal control flow.

---

## 23. What is a nested loop?

Explain time complexity and flow using example patterns.

---

## 24. How does the ternary operator work internally?

Explain why it is an expression, not a statement.

---

## 25. Why can't we use multiple statements in the increment section of a for loop without commas?

Explain syntax rule and compilation behavior.

---

## 26. Explain how logical operators differ from bitwise when operands are booleans.

---

## 27. What is "switch expression" (Java 14+)?

Explain:

- arrow labels
- yield keyword
- exhaustiveness

---

## 28. Why does this produce unexpected output?

System.out.println(10 + 20 + "Java" + 30 + 40);

yaml
Copy code

---

## 29. What is unreachable statement error?

Explain why this fails:
while(true) {
break;
}
System.out.println("Hi"); // valid or invalid?

yaml
Copy code

---

## 30. When should you prefer:

- if-else
- switch
- ternary
- polymorphism instead of switch  
  Explain with examples.

---

# ⭐ BONUS SUPER-QUESTION (MASTER LEVEL)

Explain **everything that happens in this program**, step-by-step:
int x = 5;
switch (x++ + --x - ++x) {
case 5:
for (int i = 0; i < 3; i++) {
if (i % 2 == 0)
continue;
System.out.println(i);
}
break;

csharp
Copy code
case 6:
int i = 0;
while (i < 3) {
if (++i == 2)
break;
System.out.println(i);
}
break;

default:
System.out.println("Default");
}

yaml
Copy code
Explain:

- operator evaluation
- switch key computation
- loop flow
- continue and break
- memory behavior
- output reasoning

---
