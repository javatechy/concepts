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




## Refernce:

- https://www.youtube.com/watch?v=L95658yXRgI&list=PLsyeobzWxl7rmuFYRpkqLanwoG4pQQ7oW
