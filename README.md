## Student Management System (MVC Architecture)

This project implements a Student Management System following the MVC (Model-View-Controller) architecture in Java.

## Features

Controller Layer: Manages client requests and integrates with the Service Layer for processing and database interaction.

DAO Layer: Handles database interactions and performs efficient CRUD operations.

Factory Design Pattern: Ensures a single instance of Service and DAO objects to reduce object duplication.

## Project Structure
```
Student_Management_System/
│── .idea/
│── out/
│── src/
│   ├── com/anshul/
│   │   ├── beans/
│   │   │   ├── Student.java
│   │   ├── dao/
│   │   │   ├── StudentDao.java
│   │   │   ├── StudentDaoImpl.java
│   │   ├── factory/
│   │   │   ├── ConnectionFactory.java
│   │   │   ├── StudentDaoFactory.java
│   │   │   ├── StudentServiceFactory.java
│   │   ├── service/
│   │   │   ├── StudentService.java
│   │   │   ├── StudentServiceImpl.java
│   ├── Main.java
│── External Libraries/
│   ├── openjdk-22
│   ├── MYSQL9_LIB
```

