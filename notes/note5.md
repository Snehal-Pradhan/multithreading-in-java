### Note: 5

#### Synchronization

##### Race Condition
- When multiple threads access or modify a shared mutable resource at the same time, the output depends on the unpredictable order or timing of thread execution, This is called race condition.

**Critical Section** - part of the code which modifies or accesses shared resources.
**Mutual exclusion** - principle that a single thread can execute in the critical section at a time.

##### `synchronized` keyword is used for mutual exclusion.
We can create a complete synchronized method or just a code block synchronized.
this gives memory consistency.