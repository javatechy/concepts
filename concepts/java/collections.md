# Collections

Collections.sort use Mergesort but Arrays.sort doesn't.

![collections](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/java-collection.jpg)


Collection : Root interface with basic methods like add(), remove(), 
             contains(), isEmpty(), addAll(), ... etc.
 
+ **Set :** Doesn't allow duplicates.  implementations : HashSet (Hashing based) and TreeSet (balanced
      BST based). Note that TreeSet implements SortedSet.

+ **List :** Can contain duplicates and elements are ordered.
       implementations: LinkedList (linked list based) and
       ArrayList (dynamic array based)

+ **Queue :** Typically order elements in FIFO order except exceptions
        like PriorityQueue.  

+ **Deque :** Elements can be inserted and removed at both ends. Allows
        both LIFO and FIFO. 

+ **Map :** Contains Key value pairs. Doesn't allow duplicates. implementation:  HashMap , TreeMap. 
      TreeMap implements SortedMap.    