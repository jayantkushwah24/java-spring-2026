# Introduction to java

## Era before java

- c/c++ existed before java
- they were popular because of their syntax close to english , simpler than other lang , fast and they were low level (close to hardware)
- c++ is platform dependent
- when we compile hello.cpp file compiler will convert hello.cpp file into machine level code(0 & 1).
- In file compilation we have to interact with os like printing to console , file read & write , memory allocation . In backend os will give its system libraries in compiled form and include in our machine code
- that is why compiling same hello.cpp file will generate different machine code if we use different platform . os will include different compiled system libraries.
- if we talk about how using different processor will generate different machine code for same hello.cpp file
- processor contains transister in billion/trillions. transister . transister means either its on or off (1,0) .
  -Intel , mac m5 , ryzen has their own different architecture and design
- instruction set architecture (isa) situated between program and processor
- c/c++ were complex because of pointer , memory allocation deallocation , multiple inheritance.

## why java?

- portability / platfrom independent (processor + os = platform )
- security
- simplicity / less complex lang

## how java is platform independent?

- java compiler will compile the hello.java file and covert it into java.class file which is a intermediate file .
- java.class file is bytecode which is platform independent which means bytecode can run on any os and processor
- jvm will convert this bytecode into machine code .
- jvm is platform dependent . there is different jvm available for every platfrom and we have install it . jvm is just piece of software and java has developed jvm for every platform
- write java code once and compile it you can run on any platform (WORA = write once , run anywhere).

## why java is secure language?

- there were so many use cases of java for example we can use java in backend of web app via servelet and running java on client side/web browser and develop frontend of web app via applet.
- java was getting popular and getting adopted everywhere and half of internet using java so it was important to make java secure because anyone can misuse it
