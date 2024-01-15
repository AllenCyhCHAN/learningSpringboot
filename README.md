Student Management System
This is a simple student management system project built with Spring Boot. It provides a RESTful API for managing student records.

Features
Retrieve a list of all students
Retrieve a specific student by ID
Add a new student
Update an existing student
Delete a student
Technologies Used
Java
Spring Boot
Spring Data JPA
MySQL (or your preferred database)
Maven (for dependency management)
RESTful API
Prerequisites
Before running the project, make sure you have the following installed:

Java Development Kit (JDK)
Maven
MySQL (or another database of your choice)
Configuration
Clone the repository to your local machine.
bash
複製
git clone https://github.com/your_username/student-management-system.git
Open the project in your preferred IDE.

Configure the database connection in the application.properties file.

properties
複製
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password
Build the project using Maven.
bash
複製
mvn clean install
Run the application.
bash
複製
mvn spring-boot:run
The application will start running on http://localhost:8080.

API Endpoints
GET /api/v1/student - Retrieve a list of all students
GET /api/v1/student/{id} - Retrieve a specific student by ID
POST /api/v1/student - Add a new student
PUT /api/v1/student/{id} - Update an existing student
DELETE /api/v1/student/{id} - Delete a student
Usage
You can use tools like Postman or curl to interact with the API endpoints.

Example Requests:

Retrieve all students:
GET /api/v1/student

Retrieve a specific student:
GET /api/v1/student/{id}

Add a new student:
POST /api/v1/student
Content-Type: application/json

{
  "firstName": "John",
  "lastName": "Doe",
  "age": 20,
  "email": "john.doe@example.com"
}

Update an existing student:
PUT /api/v1/student/{id}
Content-Type: application/json

{
  "firstName": "John",
  "lastName": "Smith",
  "age": 21,
  "email": "john.smith@example.com"
}

Delete a student:
DELETE /api/v1/student/{id}
