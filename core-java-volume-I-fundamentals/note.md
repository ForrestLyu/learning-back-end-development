# Core Java Volume I - fundamentals 11th

> Cay S. Horstmann

The 11th edition has been updated to reflect the features of Java Standard Edition (SE) 9, 10 and 11.

We assume you are willing, even eager, to learn about all the advanced features that Java puts at disposal.  
- Object-oriented programming
- Reflction and proxies
- Interfaces and inner classes
- Exception handling
- Generic programming
- The collections framework
- The event listener model
- Graphcial user interface design
- Concurrency

In volume II:  
- The steam API
- File processing and regular expressions
- Databases
- XML processing
- Annatations
- Internationalization
- Network programming
- Advanced GUI components
- Advaned graphcis
- Native methods

## 1 An introduction to Java
### 1.1 Java as a programming platform

Java is a whole platform, with a huge library, containing lots of reusable code, and an execution environment that provides services such as security, portability across operating systems, and automatic garbage collection.

### 1.2 The Java 'White Paper' buzzwords

* Simple
* Obejct-oriented
* Distributed
* Robust
* Secure

Java is intented to be used in network/ditributed environments. Toward that end, a lot of emphasis has been placed on security. Java enables the construction of virus-free, tamper-free systems.

From the beginning, Java was designed to make certain kinds of attacks impossible, among them:  
- Overrunning the runtime stack - a common attack of worms and viruses
- Corrupting memory outside its own process space
- Reading or writing files without permission

* Architecture-neutral
* Portable
* High-performance
* Multithreaded
* Dynamic


### 1.3 Java applets and the Internet
### 1.4 A short history of Java

- 1998, Introduce J2SE, J2ME, J2EE
- 2004, Java SE 5.0
    - generic types, foreach loop, autobox, annotation
- 2006, Java SE 6
- 2014, Java 8 by Oracle
    - 'functional' style of programming
- 2017, Java 9
    - modules
- Starting in 2018, Java versions are released every six months, to enable faster introcution of features.
- Java 11, is long-term support version.

- 1.0, 1996, the language itself, 211 (number of classes and interfaces)
- 1.1, 1997, inner classes, 477
- 1.2, 1998, the strictfp modifier, 1524
- 1.3, 2000, none, 1840
- 1.4, 2002, Assertions, 2723
- 5.0, 2004, generic classes, foreach loop, varargs, autoboxing, metadata, enumerations, static import, 3279
- 6, 2006, none, 3793
- 7, 2011, switch with strings, diamond operator, binary literals, exception handling enhancements, 4024
- 8, 2014, lambda expressions, interfaces with default methods, stream and date/time libraries
- 9, 2017, modules, miscellaneous language and library enhancements, 6005


### 1.5 Common misconceptions about Java

## 2 The java programming environment
### 2.1 Installing the Java development kit
### 2.2 Using the command-line tools
### 2.3 Using an IDE. (integrated development environment)
### 2.4 JShell

## 3 Fundamental programming structures in Java

```java
package javass.lang;

import java.lang;   // default import.
import java.util.Math;  // Math util class

public class Demo { // Class name must start with uppercase letter
    
    public static void main(String[] args) {

    /*
    1. Comemnts
    2. Data types: 
        - Primitive type: Integer (byte, short, int, long), Floating-point (float, double), char, boolean
        - Reference type: Object, String, etc.

    3. Variables and constants:
        - Definite variables = declare variables + initialize variables
        - Constants: literals
        - Enumerated types
    4. Operators
        - Arithmetic operators
        - Assignment operators
        - Comparasiong operators
        - Logical operators
        - Bitwise operators
    ATTENTION:
        - Conversions between numeric types
        - Casts
        - Operator hierarchy
    5. Strings
        - Substrings, concatenation, immutable
        - equality 
        - empty and null strings
        - code points and code units
        - String APIs
        - Building Strings
    6. Input and output
    7. Control flow
    8. Big numebr
    9. Arrays
    */
    }
}
```
### 3.1 A simple Java program
### 3.2 Comments
### 3.3 Data types
### 3.4 Variables and constants
### 3.5 Operators
### 3.6 Strings
### 3.7 Input and output
### 3.8 Control flow
### 3.9 Big numbers
### 3.10 Arrays

## 4 Objects and classes
### 4.1 Intro. to object-oritened programming

Classes
Objects
Identifying classes
Relationships between classes


### 4.2 Using predefined classes
### 4.3 Defining your own classes
### 4.4 Static fields and methods
### 4.5 Method parameters
### 4.6 Object construction
### 4.7 Packages
### 4.8 Jar files
### 4.9 Documentation comments
### 4.10 Class design hints

## 5 Inheritance
### 5.1 Classes, superclass, and subclasses
### 5.2 Object: the cosmic superclass
### 5.3 Generic array lists
### 5.4 Object wrappers and autoboxing
### 5.5 Mehtods with a variable number of parameters
### 5.6 Enumeration classes
### 5.7 Reflection
### 5.8 Design hits for inheritance

## 6 Interfaces, Lambda expressions, and innner classes
### 6.1 Interfaces
### 6.2 Lambda expressions
### 6.3 Inner classes
### 6.4 Service loaders
### 6.5 Proxies

## 7 Exceptions, assertions, and logging
### 7.1 Dealing with errors
### 7.2 Catching exceptions
### 7.3 Tips for Using exceptions
### 7.4 Using assertions
### 7.5 Logging
### 7.6 Debugging tips

## 8 Generic programming
### 8.1 Why generic programming?
### 8.2 Defining a simple generic class
### 8.3 Generic methods
### 8.4 Bounds for type variables
### 8.5 Generic code and the virtual machine
### 8.6 Restrictions and limitations
### 8.7 Inheritance rules for generic types
### 8.8 Wildcard types
### 8.9 Reflection and generics

## 9 Collections
### 9.1 The Java collections framework
### 9.2 Interfaces in the collections framework
### 9.3 Concrete collections
### 9.4 Maps
### 9.5 Views and wrapper
### 9.6 Algorithms
### 9.7 Legacy Collections

## 10 Graphical user interface programming
### 10.1 A history of Java user interface toolkits
### 10.2 Displaying frames
### 10.3 Displaying information in a component
### 10.4 Event handling
### 10.5 The preferences API

## 11 User interface components with Swing
### 11.1 Swing and the MVC design pattern
### 11.2 Intro. to layout management
### 11.3 Text input
### 11.4 Choice components
### 11.5 Menus
### 11.6 Sophisticated layout mangement
### 11.7 Dialog boxes

## 12 Concurrency
### 12.1 What are threads?
### 12.2 Thread states
### 12.3 Thread properties
### 12.4 Synchronization
### 12.5 Thread-safe collections
### 12.6 Tasks and thread pools
### 12.7 Asynchronous computations
### 12.8 Processes
