# 100 OOP MCQs (Java-Focused)

## Level 1: Basics (1–20)

1. Which of the following best defines OOP?
    - A. Programming around functions
    - B. Programming organized around objects and data
    - C. Programming only using classes without methods
    - D. Programming without encapsulation  
      **Answer: B**

2. Which is NOT an OOP principle?
    - A. Encapsulation
    - B. Polymorphism
    - C. Inheritance
    - D. Compilation  
      **Answer: D**

3. In Java, everything is an object except:
    - A. Strings
    - B. Arrays
    - C. Primitive types
    - D. Wrapper classes  
      **Answer: C**

4. What is encapsulation?
    - A. Hiding internal data
    - B. Method overriding
    - C. Using abstract classes
    - D. Writing static methods  
      **Answer: A**

5. The concept of using a parent reference to refer to a child object is:
    - A. Overloading
    - B. Polymorphism
    - C. Abstraction
    - D. Composition  
      **Answer: B**

6. Which keyword restricts inheritance?
    - A. this
    - B. final
    - C. static
    - D. private  
      **Answer: B**

7. Which is TRUE about constructors?
    - A. They must return void
    - B. They can be inherited
    - C. They initialize objects
    - D. They run after garbage collection  
      **Answer: C**

8. Overloading occurs when:
    - A. Two methods have the same name and different parameters
    - B. Two classes extend the same parent
    - C. A subclass modifies parent behavior
    - D. Interfaces extend multiple interfaces  
      **Answer: A**

9. Overriding requires:
    - A. Different method signatures
    - B. Same method signature in subclass
    - C. Same return type but different parameter types
    - D. Method marked as static  
      **Answer: B**

10. Which access modifier makes a member visible within package only?
    - A. public
    - B. private
    - C. protected
    - D. default  
      **Answer: D**

11. Composition is preferred over inheritance because:
    - A. It avoids tight coupling
    - B. It reduces object creation
    - C. It improves GC
    - D. It disables overriding  
      **Answer: A**

12. Which allows multiple inheritance in Java?
    - A. classes
    - B. abstract classes
    - C. interfaces
    - D. enums  
      **Answer: C**

13. A class declared as abstract:
    - A. Cannot have constructors
    - B. Must have only abstract methods
    - C. Cannot be instantiated
    - D. Must extend another class  
      **Answer: C**

14. Which is a runtime polymorphism example?
    - A. method overloading
    - B. generic type erasure
    - C. method overriding
    - D. static binding  
      **Answer: C**

15. What is an object?
    - A. A file
    - B. An instance of a class
    - C. A package
    - D. A primitive type  
      **Answer: B**

16. Which of these can be static?
    - A. classes
    - B. methods
    - C. variables
    - D. All of the above  
      **Answer: D**

17. What is the default superclass of every class in Java?
    - A. Object
    - B. Class
    - C. Root
    - D. Base  
      **Answer: A**

18. Which principle hides internal implementation?
    - A. Abstraction
    - B. Polymorphism
    - C. Overloading
    - D. Delegation  
      **Answer: A**

19. A constructor that takes no arguments is called:
    - A. Dummy constructor
    - B. Zero constructor
    - C. Default constructor
    - D. Static constructor  
      **Answer: C**

20. What does the `this` keyword refer to?
    - A. Parent class
    - B. Current object
    - C. JVM instance
    - D. New instance  
      **Answer: B**

---

## Level 2: Intermediate (21–50)

21. Which method is defined in `Object`?
    - A. notifyAll
    - B. finalize
    - C. wait
    - D. All of the above  
      **Answer: D**

22. Which of these cannot be overridden?
    - A. public instance method
    - B. protected instance method
    - C. private method
    - D. abstract method  
      **Answer: C**

23. What is upcasting?
    - A. Converting child reference to parent reference
    - B. Converting parent reference to child reference
    - C. Converting primitive to object
    - D. None  
      **Answer: A**

24. Which keyword is used for calling parent class constructor?
    - A. this
    - B. super
    - C. base
    - D. parent  
      **Answer: B**

25. What is true about interfaces?
    - A. All methods must be default
    - B. All variables are implicitly public static final
    - C. They cannot have static methods
    - D. They cannot have private methods  
      **Answer: B**

26. Which principle aims to reduce coupling?
    - A. Inheritance
    - B. Encapsulation
    - C. Polymorphism
    - D. Overloading  
      **Answer: B**

27. Which binding is used for overridden methods?
    - A. static binding
    - B. early binding
    - C. dynamic binding
    - D. compile-time binding  
      **Answer: C**

28. What breaks Liskov Substitution Principle?
    - A. Using interfaces
    - B. Subclass changing parent’s contract
    - C. Final classes
    - D. Composition  
      **Answer: B**

29. Composition means:
    - A. “has-a” relationship
    - B. “is-a” relationship
    - C. “uses-a” relationship
    - D. “extends” relationship  
      **Answer: A**

30. Which is stronger?
    - A. Composition
    - B. Aggregation
    - C. Both same
    - D. None  
      **Answer: A**

31. JVM decides method to call at runtime using:
    - A. Reference type
    - B. Object type
    - C. Return type
    - D. Package  
      **Answer: B**

32. Method overloading resolution happens at:
    - A. compile-time
    - B. runtime
    - C. JVM optimization
    - D. JIT only  
      **Answer: A**

33. Which of these allows partial abstraction?
    - A. Interface
    - B. Abstract class
    - C. Enum
    - D. Final class  
      **Answer: B**

34. Which is NOT a benefit of polymorphism?
    - A. Cleaner code
    - B. Dynamic behavior
    - C. Memory reduction
    - D. Extensibility  
      **Answer: C**

35. Which relationship violates encapsulation?
    - A. Exposing internal mutable list
    - B. Private fields
    - C. Public getters only
    - D. Using final fields  
      **Answer: A**

36. Downcasting requires:
    - A. implicit conversion
    - B. explicit casting
    - C. no casting
    - D. JVM settings  
      **Answer: B**

37. Can an abstract class have constructors?
    - A. Yes
    - B. No  
      **Answer: A**

38. Which is true about static methods?
    - A. They can access instance fields
    - B. They can override instance methods
    - C. They belong to class
    - D. They support dynamic binding  
      **Answer: C**

39. What method is used for object comparison?
    - A. ==
    - B. equals
    - C. compareTo only
    - D. hashCode only  
      **Answer: B**

40. What does `hashCode()` return?
    - A. Memory address
    - B. Integer used in hashing
    - C. Pointer
    - D. Random value  
      **Answer: B**

41. Which principle supports “program to an interface”?
    - A. Polymorphism
    - B. Overloading
    - C. Encapsulation
    - D. Delegation  
      **Answer: A**

42. Which is true about final classes?
    - A. They can be extended
    - B. They cannot be instantiated
    - C. They cannot be inherited
    - D. They must be abstract  
      **Answer: C**

43. What is method hiding?
    - A. static methods with same signature
    - B. instance method overriding
    - C. private method overriding
    - D. default method overriding  
      **Answer: A**

44. `instanceof` checks:
    - A. type at compile-time
    - B. type at runtime
    - C. package only
    - D. hash value  
      **Answer: B**

45. Which principle means “open for extension, closed for modification”?
    - A. LSP
    - B. DIP
    - C. SRP
    - D. OCP  
      **Answer: D**

46. Which violates SRP?
    - A. Class with multiple responsibilities
    - B. Class with one public method
    - C. Class extending interface
    - D. Class using composition  
      **Answer: A**

47. A constructor can be:
    - A. abstract
    - B. overridden
    - C. private
    - D. synchronized  
      **Answer: C** (private constructors are valid)

48. Static variables are stored in:
    - A. Heap
    - B. Stack
    - C. Method area / MetaSpace
    - D. Register  
      **Answer: C**

49. What is deep copy?
    - A. Copying references
    - B. Copying values + referenced objects
    - C. Immutable copy
    - D. Copying stack  
      **Answer: B**

50. What is constructor chaining?
    - A. Passing reference to next constructor
    - B. Calling one constructor from another using this()/super()
    - C. Overloading constructors only
    - D. Static constructor  
      **Answer: B**

---

## Level 3: Advanced (51–100)

51. Which supports dynamic dispatch?
    - A. static methods
    - B. private methods
    - C. instance methods
    - D. final methods  
      **Answer: C**

52. Dynamic dispatch happens based on:
    - A. Reference type
    - B. Object’s runtime type
    - C. Method return type
    - D. JVM flags  
      **Answer: B**

53. Which pattern encourages composition over inheritance?
    - A. Singleton
    - B. Decorator
    - C. Prototype
    - D. Builder  
      **Answer: B**

54. Interfaces can have:
    - A. constructors
    - B. instance fields
    - C. default & private methods
    - D. final methods  
      **Answer: C**

55. Which is NOT allowed in Java?
    - A. multiple interface inheritance
    - B. hybrid inheritance using interfaces
    - C. cyclic inheritance
    - D. method overloading  
      **Answer: C**

56. Which pattern uses “family of algorithms”?
    - A. Strategy
    - B. Observer
    - C. Adapter
    - D. Composite  
      **Answer: A**

57. Which ensures proper resource cleanup?
    - A. finalize
    - B. try-with-resources
    - C. explicit GC
    - D. static blocks  
      **Answer: B**

58. Which is immutable in Java?
    - A. String
    - B. StringBuilder
    - C. Array
    - D. HashMap  
      **Answer: A**

59. Which breaks encapsulation?
    - A. returning internal mutable list
    - B. using private fields
    - C. using final
    - D. using getters  
      **Answer: A**

60. Which cannot be abstract?
    - A. class
    - B. method
    - C. constructor
    - D. interface  
      **Answer: C**

61. Why prefer interfaces over abstract classes?
    - A. They allow multiple inheritance
    - B. They run faster
    - C. They require no implementation
    - D. JVM compiles them differently  
      **Answer: A**

62. What must be true for two objects in a set?
    - A. equals and hashCode must be consistent
    - B. toString must be overridden
    - C. must be final
    - D. must implement Comparable  
      **Answer: A**

63. What happens when overriding equals but not hashCode?
    - A. Nothing
    - B. Hash-based collections break
    - C. Compile error
    - D. Runtime exception  
      **Answer: B**

64. Which cannot be used to achieve abstraction?
    - A. interface
    - B. abstract class
    - C. final class
    - D. both A and B  
      **Answer: C**

65. What is true about enums?
    - A. They are classes
    - B. They cannot have methods
    - C. They cannot implement interfaces
    - D. They are primitive types  
      **Answer: A**

66. Which cannot be generic?
    - A. class
    - B. static method
    - C. constructor
    - D. instances  
      **Answer: D**

67. Polymorphism allows:
    - A. late binding
    - B. compile-time call resolution
    - C. explicit casting only
    - D. data hiding  
      **Answer: A**

68. "Favor immutability" helps:
    - A. thread safety
    - B. slower performance
    - C. more GC pressure
    - D. poor design  
      **Answer: A**

69. DIP (Dependency Inversion Principle) states:
    - A. high-level modules depend on abstractions
    - B. abstractions depend on details
    - C. details depend on concrete classes
    - D. objects must use inheritance only  
      **Answer: A**

70. Which pattern wraps an incompatible API?
    - A. Adapter
    - B. Builder
    - C. Factory
    - D. Prototype  
      **Answer: A**

71. Which is an is-a relationship?
    - A. Dog extends Animal
    - B. Car has Engine
    - C. User uses Service
    - D. House contains Rooms  
      **Answer: A**

72. Garbage collection is:
    - A. deterministic
    - B. non-deterministic
    - C. call-based
    - D. developer controlled  
      **Answer: B**

73. Which method is called before object destruction?
    - A. close
    - B. finalize
    - C. destroy
    - D. cleanup  
      **Answer: B**

74. A private constructor is used for:
    - A. subclassing
    - B. Singleton
    - C. interface implementation
    - D. thread-local storage  
      **Answer: B**

75. Can enum extend a class?
    - A. Yes
    - B. No  
      **Answer: B**

76. Method overriding requires:
    - A. static methods
    - B. instance methods
    - C. both
    - D. neither  
      **Answer: B**

77. Which is faster?
    - A. static binding
    - B. dynamic binding
    - C. both equal
    - D. depends on object size  
      **Answer: A**

78. OOP allows:
    - A. modularity
    - B. tight coupling
    - C. poor reuse
    - D. no abstraction  
      **Answer: A**

79. Using protected fields:
    - A. still exposes internals to subclasses
    - B. is always safe
    - C. avoids encapsulation
    - D. is required in inheritance  
      **Answer: A**

80. What is a POJO?
    - A. Plain Old Java Object
    - B. Protected Object Java Operation
    - C. Primitive Object Java
    - D. Parent Object Joint Operation  
      **Answer: A**

81. Immutable objects should:
    - A. expose setters
    - B. have final fields
    - C. allow subclassing
    - D. be thread local  
      **Answer: B**

82. Which is NOT an advantage of inheritance?
    - A. reusability
    - B. code cleanliness
    - C. stronger coupling
    - D. polymorphism  
      **Answer: C**

83. A class diagram belongs to:
    - A. object modeling
    - B. functional testing
    - C. threading
    - D. packaging  
      **Answer: A**

84. Which pattern provides “one instance only”?
    - A. Singleton
    - B. Prototype
    - C. Flyweight
    - D. Decorator  
      **Answer: A**

85. What is shadowing?
    - A. local variable hides field
    - B. static method hides instance
    - C. subclass hides parent
    - D. value is lost  
      **Answer: A**

86. The super keyword calls:
    - A. topmost parent only
    - B. immediate parent
    - C. child class
    - D. interface default method always  
      **Answer: B**

87. A class with a private constructor and static factory:
    - A. cannot be instantiated externally
    - B. must be final
    - C. cannot have fields
    - D. must be abstract  
      **Answer: A**

88. Which principle relates to "one reason to change"?
    - A. SRP
    - B. OCP
    - C. LSP
    - D. DIP  
      **Answer: A**

89. Which is necessary for polymorphism?
    - A. inheritance or interface
    - B. enums
    - C. primitive types
    - D. static methods  
      **Answer: A**

90. Which pattern lets an object alter its behavior when state changes?
    - A. State
    - B. Observer
    - C. Adapter
    - D. Factory  
      **Answer: A**

91. When equals is overridden, you must override:
    - A. toString
    - B. clone
    - C. hashCode
    - D. finalize  
      **Answer: C**

92. What does composition favor?
    - A. loose coupling
    - B. tight coupling
    - C. no coupling
    - D. cyclic dependencies  
      **Answer: A**

93. Java method overriding requires:
    - A. same name + params + return type (covariant allowed)
    - B. same name only
    - C. different params
    - D. static method  
      **Answer: A**

94. A final variable:
    - A. cannot change reference
    - B. cannot change value if primitive
    - C. Both A and B
    - D. None  
      **Answer: C**

95. Which creates the tightest binding?
    - A. inheritance
    - B. composition
    - C. interface implementation
    - D. static imports  
      **Answer: A**

96. What is polymorphic dispatch?
    - A. compile-time resolution
    - B. runtime method resolution
    - C. manual casting
    - D. data overriding  
      **Answer: B**

97. Which helps avoid brittle base classes?
    - A. final classes
    - B. composition
    - C. inheritance
    - D. private constructors  
      **Answer: B**

98. Which is required for cloning?
    - A. Cloneable interface
    - B. toString
    - C. equals
    - D. hashCode  
      **Answer: A**

99. What is a marker interface?
    - A. interface with no methods
    - B. interface with static methods only
    - C. annotation
    - D. abstract class  
      **Answer: A**

100. A class can implement:
     - A. one interface  
     - B. two interfaces  
     - C. any number of interfaces  
     - D. no interfaces  
     **Answer: C**
