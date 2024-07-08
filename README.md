# Microservices Architecture Project

This repository contains a microservices architecture project developed with Spring Boot and Docker. It includes separate services for user management and course management, utilizing MySQL and PostgreSQL databases respectively.

## Table of Contents
- [Overview](#overview)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Running the Project](#running-the-project)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Overview
This project demonstrates a basic microservices architecture with two main services:
- **User Management Service**: Handles user-related operations.
- **Course Management Service**: Manages course-related operations.

Both services are containerized using Docker and utilize MySQL and PostgreSQL databases.

## Architecture
The architecture consists of:
- **User Service**: Manages user data stored in a MySQL database.
- **Course Service**: Manages course data stored in a PostgreSQL database.
- **API Gateway**: (Optional) For routing requests to appropriate services.
- **Service Discovery**: (Optional) For locating services dynamically.

![Architecture Diagram](path/to/your/architecture-diagram.png)

## Technologies Used
- **Spring Boot**: For creating microservices.
- **Docker**: For containerizing applications.
- **MySQL**: As the database for the user service.
- **PostgreSQL**: As the database for the course service.
- **Spring Cloud**: (Optional) For service discovery and API gateway.
- **Docker Compose**: For managing multi-container Docker applications.

## Setup and Installation
### Prerequisites
- **Java 11+**
- **Maven**
- **Docker**
- **Docker Compose**

### Installation Steps
1. Clone the repository:
    ```sh
    git clone https://github.com/CarlosPuent/Microservices-Architecture-Project.git
    cd Microservices-Architecture-Project
    ```

2. Build the services using Maven:
    ```sh
    cd user-service
    mvn clean install
    cd ../course-service
    mvn clean install
    ```

3. Run the services using Docker Compose:
    ```sh
    cd ..
    docker-compose up --build
    ```

## Running the Project
Once the services are up and running, you can access them at the following URLs:
- **User Service**: `http://localhost:8081`
- **Course Service**: `http://localhost:8082`

## Endpoints
### User Service
- `GET /users`: Retrieve all users.
- `POST /users`: Create a new user.

### Course Service
- `GET /courses`: Retrieve all courses.
- `POST /courses`: Create a new course.

## Contributing
Contributions are welcome! Please fork this repository and submit a pull request for review.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
