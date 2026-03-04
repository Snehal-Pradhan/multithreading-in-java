### Note: 6

Locks are a primary way of achieving thread synchronization.
They allow access to a shared resource like read or modify to a specific thread at a time to avoid race condition.

1. Intrinsic Lock - via a synchronized Keyword
- when an object enters a synchronized keyword block it automatically acquires the object's lock. 
- the issue is that other threads have to wait indefinitely to get the access.

2. Extrinsic Lock - via manual lock
-  most common one is the ReentrantLock
- .lock() method to get the lock and .unlock() method to unlock
- .tryLock() method to know whether lock is available.
- there are timeouts like .tryLock(time,unit)  - waiting for lock for a few amount of time.
- unlike synchronized explicit lock acquisition can be interrupted using methods like .lockInterruptibly()
- Fairness Policy: You can configure a ReentrantLock to be "fair" (FIFO), meaning it grants access to the thread that has been waiting the longest, which prevents starvation

**What is "Reentrancy"?**
Both synchronized and ReentrantLock support reentrancy. This means if a thread already holds a lock, it can re-acquire the same lock (e.g., calling another method that uses the same lock) without blocking itself. The lock maintains a "hold count" and is only fully released when the count returns to zero.


**Read-Write Locks**
- The ReadWriteLock interface (implemented by ReentrantReadWriteLock) is a specialised tool for systems where data is read more often than it is changed.
**Read Lock**: Multiple threads can hold a read lock simultaneously, allowing parallel reading.
**Write Lock**: This is exclusive. Only one thread can hold it, and while it is held, no other thread can read or write.
It avoids unnecessary blocking by allowing multiple readers to work at once as long as no one is writing.
