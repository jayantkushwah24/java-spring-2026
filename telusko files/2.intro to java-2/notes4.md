# Java Program Structure and Core Concepts (In-Depth)

---

# 1. Basic Structure of a Java Program

A typical Java program has the following structure:

```java
// Package Declaration (optional)
package com.example;

// Import Statements (optional)
import java.util.Scanner;

// Class Declaration
public class MyFirstProgram {

    // Main Method - Entry Point
    public static void main(String[] args) {
        // Variable Declaration and Initialization
        int number = 10;

        // Method Call
        printNumber(number);
    }

    // Method Declaration
    public static void printNumber(int num) {
        System.out.println("Number is: " + num);
    }
}

Explanation:

Package Declaration – organizes classes into namespaces.

Import Statements – import external classes or packages.

Class Declaration – defines the blueprint of objects.

Main Method – program execution starts here.

Methods – blocks of code performing specific tasks.

Variables – store data.

Statements – individual executable instructions.

2. Class
Definition

A class is a blueprint or template for creating objects.
It contains:

Fields/Variables – store data

Methods – perform actions

Constructors – initialize objects

Example:

public class Student {
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

3. Object
Definition

An object is an instance of a class.
It has:

State (variables/fields)

Behavior (methods)

Identity (unique reference)

Example:

Student s1 = new Student("Jayant", 25);
s1.display(); // Output: Jayant is 25 years old.

4. Method
Definition

A method is a block of code that performs a specific task.

Components:

Access modifier (public, private, protected)

Return type (void, int, String)

Method name

Parameters (optional)

Body { ... }

Example:

public int add(int a, int b) {
    return a + b;
}

5. Variable
Definition

A variable is a container that stores data during program execution.

Types of Variables:

Local Variables – declared inside a method

Instance Variables – declared inside a class but outside methods

Static Variables (Class Variables) – shared among all objects

Example:

class Demo {
    int instanceVar;
    static int staticVar;

    void method() {
        int localVar = 10;
    }
}

6. Data Types

Java is a statically typed language, so every variable must have a type.

Primitive Data Types:
Type	Size	Example	Description
byte	1 byte	100	Small integer
short	2 bytes	10000	Medium integer
int	4 bytes	100000	Default integer
long	8 bytes	100000L	Large integer
float	4 bytes	3.14f	Decimal
double	8 bytes	3.14159	Double precision decimal
char	2 bytes	'A'	Single character
boolean	1 bit	true/false	Logical value
Non-Primitive Data Types:

String, Arrays, Classes, Interfaces, etc.

7. Identifier
Definition

An identifier is a name given to classes, variables, methods, and packages.

Rules:

Must start with a letter, $, or _

Can contain letters, digits, $, _

Cannot be a keyword (like class, int, public)

Case-sensitive

Example:

int studentAge;  // Valid
int 2ndStudent;  // Invalid

8. Type Casting
Definition

Type casting is converting one data type into another.

1. Implicit Casting (Widening)

Smaller → larger type

Automatic by Java

int a = 10;
double b = a; // int → double

2. Explicit Casting (Narrowing)

Larger → smaller type

Must be explicitly cast

double d = 9.78;
int i = (int) d; // double → int

9. public static void main(String[] args)
Explanation of Each Keyword:

public

Access modifier

JVM can access this method from anywhere

static

Belongs to the class, not object

JVM does not need to create an object to call main

void

Return type of method

main does not return any value

main

Name of the method where execution starts

String[] args

Array of String objects

Used to pass command-line arguments

Example:

java MyProgram Hello World


args[0] = "Hello"

args[1] = "World"

10. Full Example Putting Everything Together
package com.example;

public class DemoProgram {

    int instanceVar = 5;       // Instance variable
    static int staticVar = 10; // Static variable

    // Method
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        DemoProgram obj = new DemoProgram(); // Object creation
        obj.printMessage("Hello Java");

        System.out.println("Static Var: " + DemoProgram.staticVar);

        // Using command-line arguments
        if (args.length > 0) {
            System.out.println("First Argument: " + args[0]);
        }
    }
}

Summary

Class: Blueprint

Object: Instance of class

Method: Block of code to perform task

Variable: Stores data

Data Types: Primitive & Non-Primitive

Identifier: Name of program elements

Type Casting: Convert one type to another

public static void main(String[] args): Program entry point

This forms the foundation of any Java program.

End of File

---

If you want, I can now **combine all previous topics** into **one single master `JavaNotes.md`** covering:

- History of Java
- Static vs Dynamic
- Bytecode vs Machine Code
- Compiled or Interpreted
- JVM, JRE, JDK
- Java Program Structure & Core Concepts
```
