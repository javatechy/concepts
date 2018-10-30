# Annotions

## Multitasking : When doing two task like listening music and woking on excel sheets.

Multithreading  :  Msword - typing and spell checking  same time is a clasic example of Multithreading. 

Thread : a unit of a proccess

By default we have just one thread


Uses :

- Multiple core of proccess (octacore CPUs has 8 cores in it)
- Main() in java is also a thread
- 500 elements multiply each elements by 2  may take 8 sec. it will occupy only one core of the cpu. and if you want to use all 8 core , u have to create 7 more threads. then same task can be done in 1 sec. 
- Suppose sending a request from a mobile app. Now for a backend API main thread will not be disturbed (else app will freeze).  It will create another thread and then send the request.( asynk task)
- If 5 users are coming on a servlet. It will create 5 different threads to proccess the requests.
- Gaming  : many partcipants using same game at the same time.

Create a new thread:

Methods: 

join() : Thread is dead after join() check using isAlive()
getName() :  get the name of thread
setName() :  set the name of thread
setPriority() : Thread.MIN_PRIORITY for min priority

Synchronized :

Check SynchronisedDemo.java  for refernece.  t1 and t2 are accesing the same resource and but count is never 2000 after looping 2000 times.  becazuse counter is being changed after retriving the values.

Solution : Just make the increment() Synchronized. 


### Synchronised Block vs Synchronised Method

The difference is in which lock is being acquired:

**synchronized method** acquires a lock on the whole object. This means no other thread can use any synchronized method in the whole object while the method is being run by one thread.

**synchronized blocks** acquires a lock in the object between parentheses after the synchronized keyword. Meaning no other thread can acquire a lock on the locked object until the synchronized block exits.


1. synchronized block can throw NullPointerException but synchronized method doesn't throw.
2. synchronized block reduce scope of lock, but synchronized method's scope of lock is whole method.
3. synchronized block has better performance as only the critical section is locked but synchronized method has poor performance than block.
4. synchronized block provide granular control over lock but synchronized method lock either on current object represented by this or class level lock.


# Volatile

- Volatile used mainly for flags. You cannot update volatile counters because of read and write concurrency issue.
- AtomicInteger and AtomicLong are used for counter.
- AtomciReference : - Caches(Building new cache in background and replacing atomically)
					- Used by internal classes
					- non - blocking algorithm.

# countdownlatch vs cyclicbarrier 

Difference between CountDownLatch and CyclicBarrier in Java which separates them apart and that is, you can not reuse same CountDownLatch instance once count reaches to zero and latch is open, on the other hand CyclicBarrier can be reused by resetting Barrier, Once barrier is broken.

A useful property of a CountDownLatch is that it doesn't require that threads calling countDown wait for the count to reach zero before proceeding, it simply prevents any thread from proceeding past an await until all threads could pass.


A CyclicBarrier supports an optional Runnable command that is run once per barrier point, after the last thread in the party arrives, but before any threads are released. This barrier action is useful for updating shared-state before any of the parties continue.

The CyclicBarrier uses a fast-fail all-or-none breakage model for failed synchronization attempts: If a thread leaves a barrier point prematurely because of interruption, failure, or timeout, all other threads, even those that have not yet resumed from a previous await(), will also leave abnormally via BrokenBarrierException (or InterruptedException if they too were interrupted at about the same time).


# reentrantlock in java

Reentrant Locks also offer a fairness parameter, by which the lock would abide by the order of the lock request i.e. after a thread unlocks the resource, the lock would go to the thread which has been waiting for the longest time. This fairness mode is set up by passing true to the constructor of the lock.



## Refernce:

- http://www.java67.com/2012/08/difference-between-countdownlatch-and-cyclicbarrier-java.html

- https://www.youtube.com/watch?v=L95658yXRgI&list=PLsyeobzWxl7rmuFYRpkqLanwoG4pQQ7oW
- https://stackoverflow.com/questions/20906548/why-is-synchronized-block-better-than-synchronized-method