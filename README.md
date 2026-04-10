# Train Consist Management App

This project is a Java-based application that demonstrates the management of a train consist (the formation of bogies of a train) using different Java Collections.

## Use Cases Implemented

1. **UseCase 1: Basic Train Initialization**
   - Utilizes `ArrayList` to manage the basic sequence of a train consist.
   - Shows how to create and display the initial bogie count.

2. **UseCase 2: Bogie Additions & Removals**
   - Demonstrates specific additions and removals of train bogies in the consist.

3. **UseCase 3: Intermediate Position Management**
   - Focuses on inserting and manipulating train bogies at specific positions or under certain constraints.

4. **UseCase 4: Unique Consist Enforcement**
   - Shows how to maintain constraints, such as ensuring no duplicate critical bogies.

5. **UseCase 5: Preserve Insertion Order of Bogies**
   - Utilizes `LinkedHashSet` to manage the train formation.
   - Prevents duplicate bogies where not allowed, while strictly preserving the insertion order (e.g., Engine -> Sleeper -> Cargo -> Guard).

## Compilation and Execution

To run any of the use cases, compile the Java file and run the generated class. For example, for UseCase 5:

```bash
cd Train_Consist_Management_App/Train_Consist_Management_App
javac UseCase5TrainConsistMgmt.java
java UseCase5TrainConsistMgmt
```
