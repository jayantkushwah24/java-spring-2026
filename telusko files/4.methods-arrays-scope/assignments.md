# 🟦 METHODS, ARRAYS, SCOPE — 20 PRACTICE + 30 INTERVIEW QUESTIONS (RAW MD)

==========================================================

# 📘 PART 1 — 20 BEST PRACTICE QUESTIONS

==========================================================

## 1. Write a method to find the maximum of 3 numbers.

Use method overloading to handle: int, double, float.

---

## 2. Write a method to reverse an array using:

- for loop
- while loop
- enhanced for loop (explain limitation)

---

## 3. Write a program to pass an array to a method and modify its elements.

Explain why changes reflect outside.

---

## 4. Write a method that takes variable arguments (`int...`) and returns the sum of all numbers.

---

## 5. Write a method to calculate factorial using recursion.

---

## 6. Write a method to calculate factorial without recursion using loops.

---

## 7. Write a method that returns both minimum and maximum from an array using a custom class/record.

---

## 8. Write a method to check if an element exists in an array using:

- linear search
- binary search

---

## 9. Write a method that swaps two values.

Explain why original values do NOT swap (call by value).

---

## 10. Write a program to demonstrate method overloading and show which method call is chosen using type promotion.

---

## 11. Write a method that returns an array of even numbers from a given array.

---

## 12. Write a method to print a 2D array using nested loops.

---

## 13. Write a method to transpose a 2D matrix.

---

## 14. Write a method to find second largest number in an array.

---

## 15. Write a program to find duplicate values in an array.

---

## 16. Write a method that counts vowels in a string.

---

## 17. Write a recursive method to compute nth Fibonacci number.

---

## 18. Write a method that takes an array and returns true if array is sorted.

---

## 19. Write a method that demonstrates shadowing of variables (scope).

---

## 20. Write a method that returns the sum of digits of a number (recursive + iterative).

---

==========================================================

# 📘 PART 2 — 30 BEST INTERVIEW QUESTIONS (ADVANCED)

==========================================================

## 1. What is the difference between method overloading and overriding?

Explain with memory model + binding (static vs dynamic).

---

## 2. How does Java’s “pass-by-value” actually work?

Explain why swapping two integers inside a method does not work.

---

## 3. What happens when you modify an array inside a method?

Explain with heap, reference passing, and call stack behavior.

---

## 4. JVM stores method local variables where? Explain with full stack frame layout:

- Local variable array
- Operand stack
- Constant pool reference

---

## 5. Explain how Java chooses which overloaded method to call.

Cover:

- type promotion
- widening
- autoboxing
- varargs
- ambiguity

---

## 6. Why is recursion slower than iteration in many cases?

Explain stack frames and function call overhead.

---

## 7. Explain stack overflow error in recursion.

Show how it happens in memory.

---

## 8. What is variable shadowing?

How is it different from hiding?

---

## 9. What is the difference between instance, static, and local variables?

Explain with memory areas: heap, method area, stack.

---

## 10. Why can’t static methods access instance variables?

Explain using memory model.

---

## 11. What is the difference between “returning an array” and “returning a reference to an array”?

Explain how both refer to same heap object.

---

## 12. Difference between 1D, 2D, and jagged arrays in Java.

Explain how jagged arrays are stored in heap.

---

## 13. Explain deep copy vs shallow copy for arrays.

Show examples using `clone()`.

---

## 14. Why does this code compile?

int[] x = new int[0];

yaml
Copy code
Explain zero-length array memory behavior.

---

## 15. Explain how enhanced for-loop works internally using iterators.

---

## 16. Why is array length a final variable (x.length)?

Explain design choice.

---

## 17. Why are arrays objects in Java?

Explain memory layout with object header + data.

---

## 18. Can you overload main method?

Can you override main method? Explain in detail.

---

## 19. Why do we need varargs?

Explain edge cases and precedence rules with overloading.

---

## 20. What happens if two overloaded methods differ only by return type?

Explain compile-time error and reason.

---

## 21. Explain strictfp keyword and why it is useful in methods.

---

## 22. Why can't we create arrays of generic types?

Explain type erasure.

---

## 23. What is default initialization of array elements?

Explain for all primitive types + reference types.

---

## 24. What is the difference between length of array vs length of string?

Explain why one is a variable and other is a method.

---

## 25. What is the difference between passing object reference vs passing primitive?

---

## 26. Why is array index starting from 0 in Java?

---

## 27. What is command-line argument array (`String[] args`)?

Explain how JVM creates it.

---

## 28. Explain multidimensional array memory representation.

Why is it not a true matrix but an array of array references?

---

## 29. Explain how “default value of local variables” works.

Why do locals not get default values?

---

## 30. Explain method signature.

Why return type is not part of signature?

---

# ⭐ BONUS SUPER INTERVIEW QUESTION

Explain step-by-step what happens in memory for the following code:
void test(int a, int[] arr) {
a = a + 10;
arr[0] = arr[0] + 10;
}

public static void main(String[] args) {
int x = 5;
int[] data = {1, 2, 3};
test(x, data);
System.out.println(x); // ?
System.out.println(data[0]); // ?
}

diff
Copy code
Cover:

- stack frame for main
- stack frame for test
- heap memory for array
- how references work
- why x does NOT change
- why data[0] DOES change

==========================================================
