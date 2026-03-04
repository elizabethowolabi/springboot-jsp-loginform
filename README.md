# 🔐 Login Portal — Student Registration & Authentication System

A Spring Boot MVC-based Login and Registration system built using Java, JSP, and MySQL.
This project demonstrates a layered backend architecture using Spring Boot, JPA (Hibernate), and server-side rendering with JSP.

---

## 🚀 Features

- User Registration
- Unique Email Validation (Database-level constraint)
- Layered Architecture (Controller → Service → Repository)
- MySQL Database Integration
- JPA / Hibernate ORM Mapping
- Server-side rendering with JSP
- Clean MVC routing structure
- Maven-based project configuration

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 4.x |
| ORM | Spring Data JPA / Hibernate |
| Database | MySQL |
| View Layer | JSP + JSTL |
| Frontend | Bootstrap 5.3 |
| Build Tool | Maven |
| Utilities | Lombok |
| Server | Embedded Tomcat |

---

## 🏗️ Architecture Overview

This application follows a standard layered architecture:

**Controller Layer** — Handles HTTP requests and routes user actions.

**Service Layer** — Contains business logic and communicates with the repository.

**Repository Layer** — Extends JpaRepository for database operations.

**Entity Layer** — Maps the Student model to the MySQL database.

---

## 📁 Project Structure

```
loginPortal/
├── src/
│   └── main/
│       ├── java/com/elizabeth/loginPortal/
│       │   ├── controller/
│       │   │   └── StudentController.java
│       │   ├── model/
│       │   │   └── Student.java
│       │   ├── repository/
│       │   │   └── StudentRepo.java
│       │   ├── service/
│       │   │   └── StudentService.java
│       │   └── LoginPortalApplication.java
│       ├── resources/
│       │   └── application.properties
│       └── webapp/
│           └── WEB-INF/
│               └── pages/
│                   ├── home.jsp
│                   ├── login.jsp
│                   ├── register.jsp
│                   ├── viewdata.jsp
│                   └── header.jsp
└── pom.xml
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.8+
- MySQL 8.x
- Git

### 1. Clone the repository

```bash
git clone https://github.com/your-username/loginPortal.git
cd loginPortal
```

### 2. Set up the database

```sql
CREATE DATABASE springbootdb1;
```

### 3. Configure application.properties

Open `src/main/resources/application.properties` and update your credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb1
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```

### 4. Run the application

```bash
mvn spring-boot:run
```

### 5. Access the app

Open your browser and go to:

```
http://localhost:8080
```

---

## 🗺️ API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/` | Home page |
| GET | `/register` | Registration form |
| POST | `/saveform` | Save student data |
| GET | `/login` | Login page |
| GET | `/viewdata` | View all students |

---

## 🔮 Planned Improvements

- [ ] Implement Spring Security for authentication
- [ ] Password hashing with BCrypt
- [ ] Login validation against database
- [ ] Session management & logout
- [ ] Input validation with Bean Validation (Jakarta)
- [ ] Pagination for student data table
- [ ] REST API layer with JSON responses
- [ ] Unit & integration tests

---

## 👩‍💻 Author

**Elizabeth Owolabi**

  Backend Developer | Java | Spring Boot

---

This project is open source and available under the [MIT License](LICENSE).
