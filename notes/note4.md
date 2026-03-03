### Note: 4

##### Choosing between `extends Threads` and `implements Runnable`

`extends Threads` works only when the class is not inheriting something else also, cuz java doesn't support multiple inheritance. 
use `implements Runnable`.


#### Setting Priority

**Thread Priorities**: Java allows you to set a priority for a thread ranging from 1 `(MIN_PRIORITY)` to 10 `(MAX_PRIORITY)`, with the default being 5 `(NORM_PRIORITY)`.
- **Priority as a Hint**: setting a priority is just a hint to the OS scheduler. It doesn't guarantee a specific order of execution, but tells the system which threads are more **"important"** and should ideally receive more CPU time.

#### Advanced Control Methods
- `interrupt()`: This method is used to wake up a thread that is currently sleeping or waiting. If a thread is interrupted while in a state like sleep(), it will immediately throw an InterruptedException, allowing you to handle the stop gracefully in a catch block.

- `yield()`: This provides a hint to the scheduler that the current thread is willing to give up its current turn to allow other threads of the same priority to run. It promotes better sharing of CPU resources.


#### User Threads vs. Daemon Threads
There are two types of threads based on how they affect program shutdown:
1. **User Threads**: These are standard threads that perform the main "business logic" of your application. The JVM will wait for all user threads to finish before it shuts down the program.

2. **Daemon Threads**: These are background threads (like Java's Garbage Collector). The JVM does not wait for daemon threads to finish; if all user threads are done, the JVM will shut down immediately, even if daemon threads are still running.
