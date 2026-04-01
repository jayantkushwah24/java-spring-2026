# Wrapper Classes in Java

## 1. Definition
Wrapper classes in Java are used to **convert primitive data types into objects**.  
They are part of the `java.lang` package.

Java is object-oriented, but primitives are not objects. Wrapper classes bridge this gap.

---

## 2. Primitive Types vs Wrapper Classes

| Primitive Type | Wrapper Class |
|---------------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

## 3. Why Wrapper Classes Are Needed

1. **Collections Framework**
    - Collections (`ArrayList`, `HashMap`, etc.) do not support primitive types.
   ```java
   ArrayList<Integer> list = new ArrayList<>();
Object Requirement

Many APIs and frameworks require objects, not primitives.

Utility Methods

Parsing, comparison, and conversion operations.

java
Copy code
int x = Integer.parseInt("100");
Null Handling

Wrapper objects can store null, primitives cannot.

java
Copy code
Integer a = null;
4. Autoboxing and Unboxing
   Autoboxing
   Automatic conversion of primitive → wrapper object.

java
Copy code
int a = 10;
Integer b = a;
Unboxing
Automatic conversion of wrapper object → primitive.

java
Copy code
Integer x = 20;
int y = x;
Internally:

Autoboxing → Integer.valueOf()

Unboxing → intValue()

5. Commonly Used Wrapper Methods
   Parsing Methods
   java
   Copy code
   int a = Integer.parseInt("123");
   double b = Double.parseDouble("10.5");
   Value Conversion
   java
   Copy code
   Integer x = 50;
   int y = x.intValue();
   Comparison
   java
   Copy code
   Integer a = 10;
   Integer b = 20;
   a.compareTo(b); // returns -1
6. Wrapper Classes Are Immutable
   Once created, the value of a wrapper object cannot be changed.

java
Copy code
Integer a = 10;
a = 20; // new object created
7. == vs equals() with Wrapper Classes
   == (Reference Comparison)
   Checks memory address.

equals() (Value Comparison)
Checks actual value.

java
Copy code
Integer a = 100;
Integer b = 100;

a == b;        // true (cached)
a.equals(b);   // true
java
Copy code
Integer x = 200;
Integer y = 200;

x == y;        // false
x.equals(y);   // true
8. Integer Caching
   Java caches Integer objects in the range -128 to 127.

Values within this range may point to the same object.

Outside this range, new objects are created.

9. NullPointerException Risk
   Unboxing a null wrapper causes runtime exception.

java
Copy code
Integer a = null;
int b = a; // NullPointerException
10. Performance Considerations
    Primitive types → faster, less memory

Wrapper classes → slower, more memory overhead

Use primitives unless:

Working with collections

Null values are required

API/framework demands objects

11. Key Points to Remember
    Wrapper classes convert primitives into objects

Required for collections and frameworks

Support autoboxing and unboxing

Are immutable

Use equals() for value comparison

Beware of null during unboxing

12. One-Line Summary
    Wrapper classes allow primitive data types to be used as objects in Java.

markdown
Copy code

---

If you want, I can also generate:
- **Short revision notes**
- **Interview Q&A**
- **MCQs**
- **Real-world examples**
- **Comparison chart (primitive vs wrapper)**

Say the word.