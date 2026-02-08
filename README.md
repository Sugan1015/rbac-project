# Config Driven RBAC System

This project demonstrates a simple Role-Based Access Control (RBAC) system using:

- Backend: Java Spring Boot
- Database: MySQL
- Frontend: HTML, JavaScript

## Features

- User login API
- Role and permission based access control
- Permissions checked at backend (403 for unauthorized access)
- Frontend UI dynamically updates based on permissions:
    - Hides sensitive columns (e.g., Salary)
    - Disables actions (e.g., Edit button)

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- HTML + JavaScript

## How RBAC Works

1. User logs in
2. Backend determines user role and permissions
3. Permissions are returned to frontend
4. Frontend adjusts UI based on permissions

## How to Run

1. Start MySQL and create database `rbac_db`
2. Update `application.properties`
3. Run Spring Boot application
4. Open `http://localhost:8080/login.html`

## Notes

This project was developed as part of an interview assignment.

