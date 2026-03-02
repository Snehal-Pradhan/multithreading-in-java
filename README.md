### Learning Multithreading in Java

#### List of topics to be learnt

1. Basics of Computing: CPU, Cores (Single vs. Multi-core), and Processing Units.
2. Fundamental Concepts: Programs vs. Processes vs. Threads.
3. Operating System Mechanisms: Multi-tasking, Time Slicing (Quanta), and Context Switching.
4. Parallelism and Concurrency: True Parallel Execution vs. Time Sharing/Rapid Switching.
5. Java Multi-threading Basics: The Main Thread and the java.lang.Thread class.
6. Thread Creation: Extending the Thread class vs. implementing the Runnable interface.
7. Thread Life Cycle: Thread States (New, Runnable, Running, Blocked, Waiting, Timed_Waiting, Terminated).
8. Essential Thread Methods: start(), run(), sleep(), join(), interrupt(), and yield().
9. Thread Configuration: Setting thread names and priorities (MAX_PRIORITY, MIN_PRIORITY, NORM_PRIORITY).
10. Thread Types: User Threads vs. Daemon Threads.
11. Concurrency Issues: Race Conditions, Critical Sections, and Data Corruption.
12. Synchronization: The synchronized keyword, Synchronized Blocks, and Mutual Exclusion.
13. Locking Mechanisms: Intrinsic Locks (Monitors) vs. Explicit Locks (Lock interface).
14. Advanced Locking: ReentrantLock, tryLock() (with and without time), lockInterruptibly(), and the unlock() method.
15. Lock Properties: Fairness (Fair vs. Unfair locks) and Starvation.
16. Specialized Locks: ReadWriteLock and ReentrantReadWriteLock.
17. Deadlock: Definition, conditions for deadlock, and resolution via consistent lock ordering.
18. Inter-thread Communication: Using wait(), notify(), and notifyAll() within synchronized contexts.
19. Thread Safety: Concept and definitions.
20. Modern Java Integration: Lambda Expressions and Functional Interfaces (like Runnable).
21. Executor Framework: Thread Pools, Executor, ExecutorService, and Executors utility class.
22. Thread Pool Management: newFixedThreadPool, newCachedThreadPool, newSingleThreadExecutor, and shutdown() methods.
23. Task Submission: submit() vs. execute(), and Callable vs. Runnable.
24. Asynchronous Results: The Future interface, get(), isDone(), isCancelled(), and cancel().
25. Batch Execution: invokeAll() and invokeAny().
26. Scheduling: ScheduledExecutorService, scheduleAtFixedRate(), and scheduleWithFixedDelay().
27. Synchronization Aids: CountDownLatch and CyclicBarrier.
28. Advanced Asynchrony: CompletableFuture and asynchronous programming pipelines.