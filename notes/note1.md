### Note: 1

#### What is a CPU ?
A CPU is the brain of the computer, it handles all the major computation and arithmetic logic

CPU and cores are often heard together.

#### What is core?
Core is an individual processing unit in a CPU.
Older CPUs had a Single core and the modern CPUs are mostly Quad or Octa core,basically multicore.


#### What is a Program?
A set of instructions written in a programming language.

#### What is a Process?
A process is an instance of the Program in execution.
When a program is started,OS creates a new process of this program.

#### What is a Thread?
A thread is a smallest unit of execution in the process, Often referred as a `lightweight process`.
A process can have multiple threads running independently sharing common resources.


#### What is MultiTasking?
The ability of OS to run multiple process simultaneously is called multi-tasking

#### What is multi-threading?
Multi-tasking being a bigger more high level understanding, multi-threading is more granular is more about the multiple threads working concurrently on a single process.
This is seen on a single process.

#### If multicore CPUs have more core where each core handles one task how single core CPUs tend to show multi-tasking

There is no true parallelism in case of single core like it in multi core.

**Single-core systems**: Multitasking is achieved via time-sharing. The operating system uses time slicing, dividing CPU time into small intervals (quanta) and performing context switches between tasks to create the illusion of parallelism.

**Multi-core systems**: These enable parallel execution by distributing independent tasks or threads across multiple CPU cores using the OS scheduler.


#### What is Context Switching?
It is the process of saving the state of currently running thread and loading the state of the next thread.

