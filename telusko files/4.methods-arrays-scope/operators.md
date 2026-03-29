# Java Operators — In-Depth Notes (Complete)

In Java, **operators** are special symbols that perform operations on variables and values.  
Java provides a rich set of operators categorized by **function**, **operands**, and **behavior**.

---

# 1. ARITHMETIC OPERATORS

Used for mathematical operations.

| Operator | Meaning             |
| -------- | ------------------- |
| +        | Addition            |
| -        | Subtraction         |
| \*       | Multiplication      |
| /        | Division            |
| %        | Modulus (remainder) |
| ++       | Increment           |
| --       | Decrement           |

---

## 1.1 Addition (+)

Used for:

- Numbers → mathematical addition
- Strings → concatenation
- Chars → added using ASCII/Unicode values

Example:

```java
int a = 10 + 20;
String s = "Hello " + "World";
1.2 Division (/) and Behavior
Division between:

int / int → int (decimal truncated)

double / int → double

Division by zero:

int/0 → ArithmeticException

double/0 → Infinity (IEEE 754 standard)

1.3 Modulus (%) — Corner Cases
matlab
Copy code
10 % 3 = 1
-10 % 3 = -1   // sign of dividend is preserved
10 % -3 = 1
1.4 Increment / Decrement (++ / --)
Two types:

Pre-increment (++a) → increases first, then uses value

Post-increment (a++) → uses value first, then increases

Example:
int x = 5;
int y = x++;  // y=5, x=6
int z = ++x;  // x=7, z=7
2. RELATIONAL (COMPARISON) OPERATORS
Used to compare two values → return boolean.

Operator	Meaning
==	Equal to
!=	Not equal
>	Greater
<	Less
>=	Greater or equal
<=	Less or equal

2.1 Comparison of Primitives
Straightforward numeric comparison.

2.2 Comparison of Objects
== → checks reference equality
equals() → checks content equality (if overridden)

Example:
String s1 = new String("Hi");
String s2 = new String("Hi");

s1 == s2;      // false (different objects)
s1.equals(s2); // true  (same content)
3. LOGICAL OPERATORS
Used with boolean values.

Operator	Meaning
&&	Logical AND (short-circuit)
!	Logical NOT

3.1 Short-Circuit Behavior
AND (&&)
If left operand is false → right operand not evaluated.

OR (||)
If left operand is true → right operand not evaluated.

Example:
if (x != 0 && (10/x > 1)) { }
Safe because 2nd condition only runs if x != 0.

4. BITWISE OPERATORS
Used for operations on binary bits.

Operator	Meaning
&	Bitwise AND
^	Bitwise XOR
~	Bitwise NOT
<<	Left shift
>>	Right shift (signed)
>>>	Unsigned right shift

4.1 Bitwise vs Logical
Bitwise works on bit level

Logical works on boolean values

4.2 Shift Operators
Left Shift (<<)
Shifts bits left → multiplies by 2^n

bash
10 << 1 = 20
Right Shift (>>)
Shifts right, preserving sign bit (MSB)

diff

-4 >> 1 = -2
Unsigned Right Shift (>>>)
Shifts right, fills left with 0 — even for negative numbers.

diff

-4 >>> 1 = large positive number
5. ASSIGNMENT OPERATORS
Operator	Meaning
=	Assign
+=	Add and assign
-=	Subtract and assign
*=	Multiply and assign
/=	Divide and assign
%=	Modulus and assign

Example:

java

int x = 10;
x += 5; // x = x + 5
6. UNARY OPERATORS
Operate on a single operand.

Operator	Meaning
+	Unary plus
-	Unary minus
++	Increment
--	Decrement
!	Logical NOT
~	Bitwise NOT

7. TERNARY OPERATOR (?:)
Shorthand for if-else.

Syntax:

java

condition ? valueIfTrue : valueIfFalse
Example:

int age = 20;
String type = (age >= 18) ? "Adult" : "Minor";
8. TYPECASTING OPERATORS
Implicit (Widening)
Automatically converts smaller type → larger type.

Order:

arduino

byte → short → int → long → float → double
Example:

int a = 10;
double d = a; // implicit
Explicit (Narrowing)
Requires manual cast → risk of data loss.

Example:

double d = 10.55;
int a = (int) d; // truncates decimal
9. INSTANCEOF OPERATOR
Checks if an object belongs to a class or subclass.

Example:

String s = "hello";
boolean result = s instanceof String; // true
Behavior with null
java
Copy code
null instanceof AnyClass  // false
10. NEW OPERATOR
Used to create objects in heap memory.

Example:

Employee e = new Employee();
Allocates memory + calls constructor.

11. DOT OPERATOR (.)
Used to access:

Methods

Variables

Packages

Example:

obj.method();
package.ClassName;
12. CONDITIONAL OPERATORS
&& and ||
Short-circuit logical operators.

& and |
Non-short-circuit (evaluates both sides always).

Example:

if (x != 0 & (10/x > 1)) { } // risky, always checks both
13. LAMBDA OPERATOR (->)
Introduced in Java 8.

Syntax:

(parameters) -> expression
(parameters) -> { block }
Example:

Runnable r = () -> System.out.println("Hello");
14. METHOD REFERENCE OPERATOR (::)
Introduced in Java 8.

Example:
System.out::println
Equivalent to:
s -> System.out.println(s)

15. ACCESS CONTROL OPERATORS
Keyword	Meaning
public	accessible everywhere
private	accessible in same class only
protected	same package + subclasses
default	same package only

Technically not operators, but used in class/member declaration.

16. PRECEDENCE & ASSOCIATIVITY (IMPORTANT)
Operators are evaluated based on precedence.

Highest → Lowest:

lua

() → . → ++ -- → * / % → + - → << >> >>> → < > <= >= → == !=
→ & → ^ → | → && → || → ?: → = += -= …
Associativity:

Most operators are left-to-right

Exceptions:
=, +=, -=, *=, /=, %= → right-to-left

COMPLETE SUMMARY TABLE
Category	Operators	Purpose
Arithmetic	+ - * / % ++ --	Math operations
Relational	== != > < >= <=	Comparisons
Logical	&&
Bitwise	&	^ ~ << >> >>>
Assignment	= += -= *= /= %=	Assign values
Unary	+ - ++ -- ! ~	Single operand ops
Ternary	?:	Conditional evaluation
Typecasting	(type)	Convert between types
Object/Type	new, instanceof	Memory allocation, type check
Member Access	.	Access variables/methods
Lambda	->	Functional programming
Method Reference	::	Refer to existing method

INTERVIEW ANSWER (TOP LEVEL)
“Java provides a rich set of operators classified into arithmetic, relational, logical, bitwise, assignment, unary, ternary, typecasting, object-oriented, lambda, and method reference operators. All operators have well-defined precedence and associativity rules enforced by the JVM and compiler. Java also supports short-circuit logical operators, signed/unsigned bitwise operations, and both implicit and explicit typecasting.”
```
