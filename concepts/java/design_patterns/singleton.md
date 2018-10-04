# Annotions

In general we follow below steps to create a singleton class:

+ Has a  private constructor to avoid any new object creation with new operator.
+ Declare a private static instance of the same class
+ Provide a public static method that will return the singleton class instance variable. If the variable is not initialized then initialize it or else simply return the instance variable.

Using above steps I have created a singleton class that looks like below:


## Object level lock vs Class level lock in Java

** Object Level :**  mechanism when we want to synchronize a non-static method or non-static code block such that only one thread will be able to execute the code block on given instance of the class. This should always be done to make instance level data thread safe.

Note : Check full example [here](https://howtodoinjava.com/java/multi-threading/object-vs-class-level-locking/)

```
   synchronized (this)
        {
            //other thread safe code
        }
    }
 ```

**Class level** :

```
  synchronized (DemoClass.class)
        {
            //other thread safe code
        }
```
## Refernce:
- https://howtodoinjava.com/java/multi-threading/object-vs-class-level-locking/
- https://www.journaldev.com/171/thread-safety-in-java-singleton-classes-with-example-code
