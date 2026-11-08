# Java Learning Journal

## Day 1 (07-07-2026)

### Project
Arjun Management 

### Concepts Learned
- Java Project Structure
- IntelliJ IDEA
- Scanner
- while Loop
- switch
- Methods
- Method Calling

### What I Built
- Displayed a menu
- Took user input
- Used switch to process options
- Created displayMenu()
- Created addStudent()
- Created viewStudent()

### Problems I Faced
- Understanding how methods work
- Confusion about where projects are saved

### Solution
- Understood that methods divide work into smaller tasks.
- Learned that IntelliJ automatically saves projects.

### Next Goal
- Store student details
- Learn Arrays
- Learn Parameters

# Java Learning Journal

## Day 5 (21-07-2026)

### Project
Arjun Management

### Concepts Learned
- Classes
- Objects
- Constructors
- Creating Objects using `new`
- Arrays of Objects (`Student[]`)
- Object Methods
- Accessing Object Variables

### What I Built
- Created a separate `Student` class
- Replaced parallel arrays with `Student[]`
- Used constructors to initialize Student objects
- Implemented `display()` method
- Implemented `isPass()` method
- Updated `addStudent()` to create Student objects
- Updated `viewStudent()` using `display()`
- Updated `search()` using Student objects
- Updated `resultCheck()` using Student objects

### Problems I Faced
- Confusion about how `Main.java` and `Student.java` connect
- Created the object before taking input
- Confusion about storing objects inside an array

### Solution
- Learned that classes in the same package automatically work together.
- Understood that input must be taken before creating an object.
- Learned that arrays can store objects instead of only primitive data types.

### Major Improvement
Before:
- `rollno[]`
- `names[]`
- `age[]`
- `marks[]`

After:
- `Student[] students`

Each Student object now stores:
- Roll Number
- Name
- Age
- Marks

### Next Goal
- Learn Encapsulation
- Learn `private`
- Learn Getters and Setters
- Add validation to Student data

# Java Learning Journal

## Day 6 (21-07-2026)

### Project

Arjun Management

### Concepts Learned

* Encapsulation
* `private` fields
* Getters
* Setters
* Data Validation
* Object Data Protection
* Reusing Methods
* Passing Values as Method Parameters

### What I Built

* Made all `Student` data members `private`
* Implemented getters to safely access student data
* Implemented setters to safely modify student data
* Added validation for:

    * Roll Number
    * Name
    * Age
    * Marks
* Updated the constructor to initialize data using setters
* Updated `Main.java` to use getters and setters instead of directly accessing variables
* Added **Update Student** feature

    * Update Name
    * Update Age
    * Update Marks
* Added **Delete Student** feature
* Added **Student Statistics** feature
* Created a separate `displayStatistics()` method to print statistics
* Reused existing methods like `search()`, `display()`, and `isPass()` instead of duplicating logic

### Problems I Faced

* Confusion about when to use getters instead of calling `display()`
* Difficulty understanding variable scope when creating `displayStatistics()`
* Confusion about deleting an object from an array
* Confusion about shifting remaining elements to the left after deletion
* Difficulty passing local variables (`pass`, `fail`, `sum`, etc.) to another method

### Solution

* Learned that getters are used when a value is needed for calculations or conditions, while `display()` is used for printing complete student details.
* Understood that local variables are only accessible inside the method where they are declared.
* Learned to pass values as parameters to another method instead of accessing local variables directly.
* Understood that arrays have a fixed size, so deleting an element requires shifting the remaining objects one position to the left.
* Learned to decrease `Studentcount` and set the last array position to `null` after deletion.

### Major Improvements

#### Student Class

Before:

* Public/directly accessible data
* No protection for student data

After:

* Private fields
* Getters
* Setters
* Validation for all student details

#### Main Project

Added:

* Update Student
* Delete Student
* Student Statistics Dashboard

Statistics Display:

* Total Passed Students
* Total Failed Students
* Total Marks
* Average Marks
* Highest Marks

### Project Features Completed

* Add Student
* View Students
* Search Student
* Result Check
* Update Student
* Delete Student
* Student Statistics

### Next Goal

* Learn Inheritance
* Understand `extends`
* Create Parent and Child classes
* Reuse code using inheritance
* Continue improving Arjun Management using inheritance


Java Learning Journal
Day 7 (24-07-2026)

Project
Arjun Management

Concepts Learned
Inheritance
extends
super()
Parent & Child Classes
Code Reusability
What I Built
Created Person parent class.
Made Student and Teacher extend Person.
Moved common fields (name, age) to Person.
Created complete Teacher Management:
Add Teacher
View Teacher
Search Teacher
Update Teacher
Delete Teacher
Teacher Statistics
Added Main Menu to switch between Student and Teacher Management.
Problems I Faced
Confusion about super().
Deciding which fields belong to the parent class.
Duplicate Teacher IDs.
Accidentally using Student methods/array for Teacher.
Solution
Used super() to initialize parent fields.
Moved only common data to Person.
Added unique Teacher ID.
Created separate Teacher methods and arrays.
Major Improvements
Reduced code duplication using inheritance.
Added a complete Teacher Management module.
Improved project structure with Parent–Child relationships.
Project Features Completed
Student Management System
Teacher Management System
Inheritance using Person
Separate menus for Students and Teachers
Next Goal
Learn Runtime Polymorphism
Method Overriding
Dynamic Method Dispatch
Improve Arjun Management using Polymorphism



//pushing into git hub//

/No.	Command	Simple explanation
1	git --version	Checks whether Git is installed.
2	git status	Checks the current Git status of the project.
3	git init	Initializes Git in the project folder.
4	git status	Checks untracked files and changes.
5	Get-Content .gitignore	Displays the contents of .gitignore.
6	Add-Content .gitignore "n.idea/n*.iml"	Adds IntelliJ files to the ignore list.
7	git add .	Stages all eligible project files.
8	git status	Checks which files are staged.
9	git commit -m "Initial commit: Student Management System"	Saves the first snapshot of the project.
10	git branch -M main	Renames the current branch to main.
11	git remote add origin https://github.com/upender222/Arjun-Management-System.git	Connects the local project to GitHub.
12	git remote -v	Verifies the GitHub repository connection.
13	git push -u origin main	Uploads the project to GitHub.
//