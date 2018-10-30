# 


In Java, a protected member is accessible in all classes of same package and in inherited classes of other packages. Since Test and Main are in same package, no access related problem in the above program. Also, the default constructors initialize integral variables as 0 in Java (See this GFact for more details). That is why we get output as 0 0.


In Java, it is compiler error to give more restrictive access to a derived class function which overrides a base class function. For example, if there is a function public void foo() in base class and if it is overridden in derived class, then access specifier for foo() cannot be anything other than public in derived class. 

**Default access is more restrictive than protected** 

Exception in thread “main” java.lang.IllegalThreadStateException at java.lang.Thread.start
Thread cannot be started twice


#### Constructors can hold synchronized code

(so that each thread can access constructor sequentially).
Explanation: Constructors allows a sequential access of data between threads.


#### When a constructor is marked as private, 
the only way to create a new object of that class from some external class is using a method that creates a new object, as defined above in the program. The method create() is responsible for creation of Temp object from some other external class. Once the object is created, its method can be invoked from the class in which the object is created.

 Constructors can be chained and overloaded. When Test() is called, it creates another Test object calling the constructor Test(int temp).
 

The method calc() in class superClass is final and so cannot be overridden.
Constructor cannot be final

### Inner class
Inner class defined above though, have access to the private variable data of the Outer class, but declaring a variable data inside an inner class makes it specific to the Inner class with no conflicts in term of variable declaratio


# Overriding

Final and static methods cannot be overridden.

The overriding method can not have more restrictive access modifier.

The exception thrown by the overriding method should not be new or more broader checked exception. 

Its legal to throw and handle errors and runtime exceptions. RuntimeException is a sub-subclass of Throwable. See exceptions for more details

In Java, it is not allowed to do super.super. We can only access Grandparent’s members using Parent

If one of the operands is long, double or float, the entire expression is converted to long, double or float respectively.

 If a double value is used in an expression then the output is returned in double format rather than an int.
 
 Constructors call their superclass default constructor, which execute first, and that constructors can be overloaded.
 
 Final methods cannot be overridden.
 
 Abstract classes can have constructors
 
 Final method can’t be overridden. Thus, an abstract function can’t be final.
 
 JDBC type 4 driver,works directly by connecting to the database server through socket connections and converts JDBC calls to vendor-specific database protocols.These drivers don't require any intermediate layer. 
 
 
 An abstract class is one that is not used to create objects. II. An abstract class is designed only to act as a base class to be inherited by other classes.
 
  final variables can be assigned value only once. 
  
  
**static init blocks** run before instance init blocks (in the order in which they appear, respectively). The order of initialization constructors and initializer block doesn’t matter, initializer block is always executed before constructo

## OPerator Precedence Rule

![image](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/operators.png)
Ref:

https://www.geeksforgeeks.org/output-of-java-program-set-1/
https://www.geeksforgeeks.org/output-java-programs-set-12/