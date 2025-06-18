# Student Management API

A Spring Boot RESTful web service for managing student records using MongoDB. Supports basic CRUD operations.

## Features

- Create, read, update, delete student records
- Simple REST API with endpoints
- MongoDB integration with Spring Data

## Technologies Used

- Java 17
- Spring Boot
- MongoDB
- Maven
- Lombok

## How to Run

1. Clone this repository  
2. Start local MongoDB on port 27017  
3. Run using `./mvnw spring-boot:run`

## API Endpoints

| Method | Endpoint         | Description          |
|--------|------------------|----------------------|
| POST   | `/students`      | Add new student      |
| GET    | `/students`      | Get all students     |
| GET    | `/students/{id}` | Get student by ID    |
| PUT    | `/students/{id}` | Update student       |
| DELETE | `/students/{id}` | Delete student       |

## Author

**Alekhya Mallina**  
🔗 [LinkedIn](https://www.linkedin.com/in/alekhya-mallina)
