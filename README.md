## Student Details

**Name:** Ricardo Giacovazzi  
**Student ID:** 23118016  
**Course Name:** Data Structures & Algorithms

## Design Summary

My task was to design and implement an application that makes use of abstract data types (ADTs) that implement interfaces in Java. The application must use a NetBeans GUI and include an example of recursion. The following factors need to be considered in the design:

- 📋 List all patients with their relevant details.
- 🚫 List the last 5 "No Shows".
- ⏩ Show the next patient to be tested via a priority queue.
- 📊 Base the priority of the queue on the patient's age, priority, and whether they come from a hospital ward.

### Chosen ADTs

1. **Priority Queue** - Maintains a priority queue of patients as they arrive or leave the blood testing facility.
2. **Queue** - Tracks "No Show" patients and displays the last 5 on the GUI.

A **Priority Score** was developed to rank patients based on age, priority, and hospital ward status. This score is calculated when a patient is captured in the application.

### GUI Design

The GUI consists of two main components:

- **Patient Intake Dashboard:** Used by administrators to capture patient details and view the last 5 "No Shows".
- **Tester Dashboard:** Used by testers to view and manage patients, trigger "No Shows", and see a full list of patients at the facility.

Basic validation ensures that forms are not submitted blank and that the age field contains only numbers.

---

## ADTs

### Priority Queue

Used to store and prioritise the full patient list, ensuring first-in-first-out (FIFO) functionality. A **custom bubble sort algorithm** sorts patients based on priority score.

#### Methods:

- `enqueue()`: Add patients and sort the queue.
- `size()`: Return the queue size.
- `isEmpty()`: Check if the queue is empty.
- `dequeue()`: Remove the first patient.
- `printPQueue()`: Return a printable list.
- `getFirst()`: Return the first patient in the queue.

### Queue

Used to store "No Show" patients and display the last 5 in the Patient Intake Dashboard.

#### Methods:

- `enqueue()`: Add "No Show" patients.
- `dequeue()`: Remove patients.
- `size()`: Return the queue size.
- `isEmpty()`: Check if the queue is empty.
- `printQueue()`: Return a printable list.

---

## Classes

### `BloodSchedulerApp`

- Main entry point.
- Contains `main()` method for testing and initialises the GUI.

### `BloodSchedulerGUI`

- Manages GUI elements and handles events.
- Instantiates a new `PriorityQueue` and `Queue`.
- Includes pre-captured patients for demonstration.

### `Patient`

- Defines patient attributes: Name, Priority, Age, Hospital Ward Status, GP Name, and GP Phone Number.
- Calculates **Priority Score** based on:
  - **Priority:** Low (1 point), Medium (2 points), Urgent (3 points).
  - **Age:** 65+ or <8 years old (3 points), others (1 point).
  - **Hospital Ward Status:** True (3 points), False (1 point).
  - **Total Score = Priority + Age + Hospital Ward Status.**

### `PriorityQueueInterface`

- Defines methods for managing the priority queue:
  - `enqueue()`, `size()`, `isEmpty()`, `dequeue()`, `printPQueue()`, `getFirst()`.

### `PriorityQueue`

- Stores patients in an `ArrayList`.
- Uses **Bubble Sort** for sorting by priority score.
- Implements methods for queue operations.

### `QueueInterface`

- Defines methods for managing the "No Show" queue:
  - `enqueue()`, `dequeue()`, `size()`, `isEmpty()`, `printQueue()`.

### `Queue`

- Stores "No Show" patients in an `ArrayList`.
- Implements methods for queue operations.

### `BubbleSort`

- Recursively sorts an `ArrayList` of patients by priority score using **Bubble Sort**.
- Includes a `swap()` method for swapping elements during sorting.
