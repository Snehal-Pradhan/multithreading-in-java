### Note: 3


#### Thread LifeCycles

thread has multiple states in a process:


1. **New**: This is the state when a thread object (e.g., MyThread t1 = new MyThread()) has been created but the .start() method has not yet been called.
2. **Runnable**: Once you call .start(), the thread becomes "Runnable." This means it is ready to run and is waiting in line for the OS Scheduler to grant it CPU time.
3. **Running**: This is the state when the thread is actually being executed by the CPU.
     - Note on Java Specifics: The source points out that in the actual Java Thread.State enum, there is no "Running" state. Instead, Java uses RUNNABLE to represent both a thread that is currently executing and one that is ready to execute.
4. **Blocked / Waiting**: A thread enters this state if it is alive but cannot proceed because it is waiting for a resource (like a lock) or waiting for another thread to perform an action.
5. **Timed Waiting**: A specific type of waiting where the thread waits for a predetermined amount of time, such as when Thread.sleep(100) is called.
6. **Terminated**: The final state once the thread has finished executing its run() method.

