# Config-Driven Access Control System (RBAC)

## 📌 Project Overview

This project implements a full-stack **Role-Based Access Control (RBAC)** system using a configuration-driven approach.
It demonstrates table-level and field-level access restrictions managed dynamically through permissions stored in the database.

Users are assigned roles, and roles determine what data can be viewed or edited.
The backend enforces permission checks before returning data and responds with appropriate HTTP status codes when access is denied.

This project was developed as part of an interview assignment.

---

## 🏗️ Tech Stack

### Backend

* Java
* Spring Boot (REST APIs)

### Frontend

* HTML
* JavaScript

### Database

* MySQL

### Tools

* Postman (API testing)
* Git & GitHub (version control)

---

## 👥 Role & Permission Model

### User Types

* **Admin**

    * Full access to system data
* **Regular User**

    * Restricted access based on assigned role

### Permission Levels

Permissions are stored in database tables and applied dynamically:

#### Table-Level

* View access
* Edit access

#### Field-Level

* View specific columns
* Edit specific columns

The backend validates permissions before serving data and returns **403 Forbidden** for unauthorized requests.
All permission logic is configuration-driven (not hardcoded).

---

## 🧪 Sample Data Tables

Used for demonstrating access control:

* Employees
* Projects

---

## 🔐 Sample Login Credentials

This implementation includes a basic login API used for frontend flow demonstration.

The backend currently accepts any username/password and returns success (no database validation).

You may use these example inputs for testing:

Example 1

* Username: admin
* Password: admin123

Example 2

* Username: user
* Password: user123

*Note: These credentials are for demonstration purposes only.*

---

## ▶️ Steps to Run the Project

### 1️⃣ Backend Setup

1. Clone the repository
2. Open the project in your IDE
3. Configure MySQL credentials in `application.properties`
4. Run the Spring Boot application
5. Server starts at
   [http://localhost:8080](http://localhost:8080)

---

### 2️⃣ Frontend Setup

1. Open the HTML frontend file in a browser
2. Ensure backend server is running
3. Login and verify permission-based UI behavior

---

## 🧪 API Testing

Tested using Postman.

Example endpoints:

* POST `/users`
* GET `/users`
* GET `/check`

---

## 📂 Project Structure

* controller → REST APIs
* service → permission logic
* repository → database access
* entity → JPA models
* frontend → HTML & JavaScript

---

## ✅ Key Highlights

* Configuration-driven RBAC implementation
* Backend permission enforcement
* Field-level UI restrictions
* Proper HTTP status handling (403)
* Clean layered architecture

---

## 👩‍💻 Author

**Suganthi M S**


