# Serialization and Deserialization in Java

Serialization is a mechanism of converting the state of an object into a byte stream. 

Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.



1. If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.

Only non-static data members are saved via Serialization process.

 Static data members and transient data members are not saved via Serialization process.So, if you don’t want to save value of a non-static data member then make it transient.
 
 ![](https://www.geeksforgeeks.org/wp-content/uploads/gq/2016/01/serialize-deserialize-java.png)

 ![](https://contribute.geeksforgeeks.org/wp-content/uploads/serialization-5.jpg)
 
 Constructor of object is never called when an object is deserialized.
 
 Associated objects must be implementing Serializable interface
 
Ref:

https://www.logicbig.com/tutorials/core-java-tutorial/java-collections/java-collection-cheatsheet.html
 