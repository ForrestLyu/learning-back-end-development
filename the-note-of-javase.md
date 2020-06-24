# The note of JavaSE

## Intro. to some concepts in Java

Java (the programming language):  
Java is a general-purpose programming language that is class-based,
object-oriented, and designed to have as few implementaion dependencies as
possible.

Java (software platform):  
* Multi-paradigm: generic, object-oriented(class-based), imperative, reflective
* Typing discipline: static, strong, safe, nominative, manifest

Java platform, standard edition:  
* JavaSE is a computing platform for development and deployment of portable code
for desktop & server environments.
* The platform uses Java programming language and is part of the Java
  software-platform family. JavaSE defines a range of general-purpose APIs-such
as Java APIs for the Java Class Library - and also includes the Java Language
Specification and the Java Virtual Machine Specification.
* One of the most well-known implementations of JavaSE is Oracle Corporation's
  Java Development Kit (JDK).

JDK. (Java Development Kit):  
The JDK. is an implementation of either one of the Java Platform, Standard
Edition, Java Platform, Enterprise Edition, or Java Platform Micro Edition
released by Oracle Corporation in the form of a binary product aimed at Java
developer on Solaris, Linux, macOS or Windows.

JRE. (Java Runtime Environment):  

JVM. (Java Virtual Machine):  
* A java virtual machine is a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java bytecode. The JVM is detailed by a specification that formally describes what is required in a JVM implementation.
* The JVM reference implementation is developed by the OpenJDK project as open
  source and includes a JIT compiler called HotSpot. The commercially supported
Java releases available from Oracel Corporation are based on the OpenJDK
runtime. Eclipse OpenJ9 is another open souece JVM for OpenJDK.

Java License:  
* Purchase the subscription
	* early access to bug fixes
	* licensing and support for cloud, server and desktop deployments.
	* some performance, stability, and security updates.
	* around the clock support.



Identity name rules:  
* number + letter + underscore + $
* DON'T use number at the first letter.

Examples:  
* 小驼峰命名法 (for method & variables): name, setName()
* 大驼峰命名法 (for class): Scanner


## 1) Basics

The anatomy of Java
```java
package javass.lang;

import java.lang;	// Don't need to import java.lang.
import java.util;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

class MyOtherClass {}

}
```

Variables, data type, type casting, operators:  
* data type: primitive data type, reference data type
* type casting: Widening Casting (automatically) & Narrowing Casting (manually)
	* Widening Casting: convert a smaller type to a large type size.
	* Narrowing Casting: convert a larger type to a smaller type size.

Operators (used to perform operations on variables and values):  
* Arithmetic operators (used to perform common mathmetical operations.)
	* `+`, addition
	* `-` subtraction
	* `*` multiplication
	* `/` division
	* `%` modulus: returns the division remainder
	* `++` increment: increases the value of a variable by 1
	* `--` decrement: decreases the value of a variable by 1
	* `logical statement ? statement : statement` 三元运算符
* Assignment operators
* Comparison operators
	* `==` Equal to 
	* `!=` Not equal
	* `>` Greater than
	* `<` Less than
	* `>=` Greater than or equal to
	* `<=` Less than or equal to
* Logical operators
	* `&&` Logical and
	* `||` Logical or
	* `!` Logical not
* Bitwise operators
	* `<<` left shift
	* `<<<` unsigned left shift
	* `>>` right shift
	* `>>>` unsigned right shift
	* `&` AND
	* `^` XOR
	* `|` OR


What are literals in Java?  
Literals in Java are a sequence of characters (digitals, letters, and other
characters) that represent values to be stored in variables. Java language
specification specifies five major type of literals:  
* Integer literals
* Floating-point literals
* Character literals (String literals)
* Escape character (is a character that invokes an alternative interpretation on
  subsequent characters in a character sequence.)
  	* non-printable characters
		* \\n: new line
		* \\t: tab
		* \\b: backspace
		* \\r: carriage return (CR LF: Windows; LF: Unix, macOS; CR: OS 9)
	* printable characters: 
		* `\u0041`: A, `\u0030`: 0: 
* Boolean literals
* Null literals


NOTICE:  
* floating-point number 无法准确表示实数. 不符合数学中的分配律和结合律

## ) Basic syntax of Java programming language

`break` VS. `continue`  

```java
// break used in switch statement and loop statement.
// continue used in loop statement.

while (i < 10) {
	// do some stuff.
	if (i < 0) {
		break; // jump out the loop.
	}
}

while (i < 10) {
	// do some stuff.

	continue;	// break the current iteration, and continue with the
			// next iteration in the loop.	
}
```
