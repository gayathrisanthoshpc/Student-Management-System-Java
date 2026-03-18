# 🎓 Student Management System (Java + JDBC)

A **console-based Student Management System** built using **Java, JDBC, and MySQL**, following a clean **DAO architecture**.
This project demonstrates how to perform real-world **CRUD operations** with proper structure and database integration.

---

## 🚀 Features

* ➕ Add new student
* 📋 View all students
* ✏️ Update student details
* ❌ Delete student records
* 🧭 Menu-driven console interface
* 🔗 MySQL database integration using JDBC

---

## 🛠️ Technologies Used

* Java (JDK 17+)
* MySQL
* JDBC
* IntelliJ IDEA

---

## 🏗️ Project Architecture

```
src/
 └── student/
      ├── Main.java          # Entry point (menu-driven UI)
      ├── Student.java      # Model class
      ├── StudentDAO.java   # Database operations (CRUD)
      └── DBConnection.java # Database connection setup
```

---

## 💡 Concepts Used

* Object-Oriented Programming (OOP)
* JDBC (Java Database Connectivity)
* DAO (Data Access Object) Pattern
* Exception Handling
* Database Design

---

## 🗄️ Database Setup

### Database: `studentdb`

### Table: `students`

| Column | Type                              |
| ------ | --------------------------------- |
| id     | INT (Primary Key, Auto Increment) |
| name   | VARCHAR                           |
| email  | VARCHAR                           |
| age    | INT                               |

---

## ⚙️ How to Run

1. Start MySQL (XAMPP or local server)
2. Create the database and table
3. Open the project in IntelliJ IDEA
4. Configure database credentials in `DBConnection.java`
5. Run `Main.java`

---

## 🖥️ Sample Output

```
--- Student Management System ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

Enter choice: 2

ID   Name        Email              Age
1    John Doe    john@email.com     20
```

---

## ⚠️ Error Handling

* Handles invalid user input
* Prevents application crashes
* Displays meaningful error messages

---

## 🚀 Future Improvements

* Add search and filtering options
* Implement student attendance system
* Add marks/grade management
* Convert to GUI using JavaFX or Swing
* Build REST API using Spring Boot
* Export data to CSV/Excel
* Add authentication system

---

## 📚 What I Learned

* Connecting Java applications to MySQL using JDBC
* Implementing DAO architecture for clean code
* Handling user input in console applications
* Designing and managing relational databases

---

## ❓ Why This Project?

This project was built to understand how real-world applications interact with databases using Java.
It showcases structured coding practices and backend fundamentals essential for software development.

---

## 👩‍💻 Author

**Gayathri Santhosh**

---

⭐ If you like this project, consider giving it a star!
