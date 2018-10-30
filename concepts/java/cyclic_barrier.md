# Java.util.concurrent.CyclicBarrier in Java

CyclicBarrier is used to make threads wait for each other.

It is used when different threads process a part of computation and when all threads have completed the execution, the result needs to be combined in the parent thread. 

In other words, a CyclicBarrier is used when multiple thread carry out different sub tasks and the output of these sub tasks need to be combined to form the final output.

After completing its execution, threads call await() method and wait for other threads to reach the barrier. Once all the threads have reached, the barriers then give the way for threads to proceed.

### Working of CyclicBarrier

CyclicBarriers are defined in java.util.concurrent package. First a new instance of a CyclicBarriers is created specifying the number of threads that the barriers should wait upon.


```
CyclicBarrier newBarrier = new CyclicBarrier(numberOfThreads);
```

Each and every thread does some computation and after completing it’s execution, calls await() methods as shown:

```
public void run()
{
    // thread does the computation
    newBarrier.await();
}

```

### Working of CyclicBarrier:

![image](https://contribute.geeksforgeeks.org/wp-content/uploads/cyclicbarrier.png)


Once the number of threads that called await() equals numberOfThreads, the barrier then gives a way for the waiting threads. The CyclicBarrier can also be initialized with some action that is performed once all the threads have reached the barrier. This action can combine/utilize the result of computation of individual thread waiting in the barrier.

```
Runnable action = ... 
//action to be performed when all threads reach the barrier;
CyclicBarrier newBarrier = new CyclicBarrier(numberOfThreads, action);
```
