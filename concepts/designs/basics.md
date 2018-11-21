

**Abstraction:**
 We usually think of classes as being complete definitions. However,
there are situations where incomplete definitions are useful. For example, in
everyday conversation, we might talk about such items as bank accounts,
insurance policies, and houses. In object-oriented programming, we call this
concept with special name, abstraction. For example, consider the concept of an
automobile which is not a complete definition for any vehicle.


**Encapsulation:** Encapsulation is the mechanism of binding the data and
operations together and hiding them from outside world. It is the process of
binding the data and code to access that data (operations). Encapsulation refers to
a container which has a data and its related functions in it. When an objects state
and behavior are kept together they are encapsulated.

**specializations and inhertience**
In an object-oriented context, we speak of specializations as inheriting
characteristics from their corresponding generalizations. Inheritance can be
defined as the process whereby one object acquires (gets, receives)
characteristics from one or more other objects


**Polymorphism:** It defines the mechanism to exist in different forms. There are
basically two types of polymorphism. Compile time (also known as Early
binding) and Run time (also known as Late binding) Polymorphism.


In **compile time polymorphism** object knows about itself at compile time.
Overloading is a compile time polymorphism.In overloading method should
have same name with different arguments. Simple example of overloading is if
you have scenarios in which you want do sum of two or three number whatever
user will pass. So you can create two methods with same name sum and assign 2
and 3 arguments into it.


In **run time polymorphism**, object does not know about itself at compile time it
assigns all the properties and methods at runtime. Overriding or inheritancebased
polymorphism are kind of polymorphism. Simple and very common
example is if you have a class Shape which is inherited to Triangle, Square and
Circle classes. Shape class has a method name as Draw which will definitely
inherit to all inherited classes. Now, if we declare a variable of Shape class and
initialize it with any of the inherited class it will call the method of inherited
class
