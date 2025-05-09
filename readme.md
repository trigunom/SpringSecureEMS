# Spring Secure Employee Management System (SpringSecureEMS)

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Prerequisites](#prerequisites)
- [Setup and Installation](#setup-and-installation)
  - [Database Configuration](#database-configuration)
  - [Application Configuration](#application-configuration)
  - [Building the Application](#building-the-application)
  - [Running the Application](#running-the-application)
- [Usage Guide](#usage-guide)
  - [Registration](#registration)
  - [Login](#login)
  - [Managing Employees](#managing-employees)
- [Project Structure](#project-structure)
- [Security Features](#security-features)
- [Customization](#customization)
- [Troubleshooting](#troubleshooting)
- [License](#license)

## Overview
SpringSecureEMS is a comprehensive Employee Management System built with Spring Boot and secured with Spring Security. This web application allows organizations to manage employee information efficiently while ensuring secure access through user authentication and authorization.

The system provides a user-friendly interface for performing CRUD (Create, Read, Update, Delete) operations on employee records, with a responsive design that works across devices.

## Features
- **User Authentication and Authorization**: Secure registration and login system
- **Employee Management**:
  - View paginated list of employees
  - Add new employees
  - Update existing employee information
  - Delete employees
- **Data Sorting**: Sort employee data by different fields
- **Search Functionality**: Quick search through employee records
- **Responsive UI**: Modern interface that adapts to different screen sizes
- **Role-based Access Control**: Different access levels based on user roles

## Technology Stack
- **Backend**: Java 17, Spring Boot 2.7.14
- **Security**: Spring Security 5
- **Database**: MySQL
- **ORM**: Hibernate/JPA
- **Frontend**: Thymeleaf, Bootstrap 5, Font Awesome
- **Build Tool**: Maven

## Prerequisites
Before setting up the project, ensure you have the following installed:

- Java Development Kit (JDK) 17
- Maven 3.6+ (or use the included Maven wrapper)
- MySQL 5.7+ or compatible database
- Git (optional, for cloning the repository)

## Setup and Installation

### Database Configuration
1. Create a new MySQL database:
   ```sql
   CREATE DATABASE demo;
   ```

2. Update the database connection settings in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url = jdbc:mysql://localhost:3306/demo?useSSL=false
   spring.datasource.username = your_username
   spring.datasource.password = your_password
   ```

### Application Configuration
No additional configuration is required as the application is pre-configured with sensible defaults. The application will automatically create the necessary tables on first run (`spring.jpa.hibernate.ddl-auto = update`).

### Building the Application
1. Clone or download the repository to your local machine.

2. Navigate to the project root directory and build the application using Maven:
   ```bash
   # Using Maven
   mvn clean install
   
   # OR using the Maven wrapper (for systems without Maven installed)
   ./mvnw clean install   # For Unix/Linux/macOS
   mvnw.cmd clean install # For Windows
   ```

### Running the Application
After successful build, you can run the application using:

```bash
# Using Maven
mvn spring-boot:run

# OR using the Maven wrapper
./mvnw spring-boot:run   # For Unix/Linux/macOS
mvnw.cmd spring-boot:run # For Windows

# OR using the generated JAR file
java -jar target/SpringSecureEMS-0.0.1-SNAPSHOT.jar
```

The application will start and be accessible at: http://localhost:8080

## Usage Guide

### Registration
1. Access the application at http://localhost:8080
2. Click on "Create an Account!" link on the login page
3. Fill in the registration form with your details
4. Click "Register Account" to create your user account

### Login
1. Navigate to the login page at http://localhost:8080/login
2. Enter your email address and password
3. Click "Login" to access the system

### Managing Employees
Once logged in, you can:

- **View Employees**: The home page displays a paginated list of all employees
- **Add an Employee**: Click "Add Employee" button and fill in the form
- **Update an Employee**: Click the "Edit" button next to an employee record
- **Delete an Employee**: Click the "Delete" button next to an employee record
- **Search**: Use the search box to filter employees by name or email
- **Sort**: Click on column headers to sort the employee list

## Project Structure
The application follows a standard Spring Boot project structure:

```
src/main/java/net/java/springboot/
├── config/              # Security and application configuration
├── model/               # Entity classes (Employee, User, Role)
├── repository/          # Data access interfaces
├── service/             # Business logic implementations
├── web/                 # Controllers and DTOs
└── SpringSecureEMS.java # Application entry point

src/main/resources/
├── templates/           # Thymeleaf view templates
├── static/              # Static resources (CSS, JS, images)
└── application.properties # Application configuration
```

## Security Features
- **Password Encryption**: Passwords are encrypted using BCrypt
- **Form Authentication**: Secure login form with CSRF protection
- **Role-Based Authorization**: Different access levels based on user roles
- **Session Management**: Proper handling of user sessions and logout
- **URL Protection**: Secured URLs with proper authorization checks

## Customization
The application can be customized in several ways:

- **Appearance**: Modify the CSS styles in the template files
- **Database**: Change the database configuration in `application.properties`
- **Pagination**: Adjust page size in `EmployeeController.java`
- **Security Rules**: Modify access rules in `SecurityConfiguration.java`

## Troubleshooting

### Common Issues
1. **Database Connection Errors**:
   - Verify your database credentials in `application.properties`
   - Ensure MySQL service is running

2. **Build Failures**:
   - Ensure you have the correct JDK version (Java 17)
   - Try using the Maven wrapper (`./mvnw` or `mvnw.cmd`)

3. **Application Won't Start**:
   - Check if port 8080 is already in use
   - Review application logs for specific error messages

### Logging
Detailed logging is enabled for Hibernate operations, which can help diagnose issues:

```properties
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE
```

## License
This project is licensed under the Apache License 2.0 - see the license headers in the source files for details.

---

*© 2025 Employee Management System*