# TodoApp

A simple web-based Todo application built with Spring Boot, Thymeleaf, Bootstrap, and MySQL.

## Overview

TodoApp is a Java-based web application designed to help users manage their daily tasks efficiently. The backend is powered by Spring Boot, the frontend utilizes Thymeleaf templating and Bootstrap for styling, and MySQL is used as the database.

## Features

- Add and delete todo tasks
- Mark tasks as completed or pending (toggle)
- Update the title of existing tasks
- View all tasks in a clean, web-based interface
- Responsive and modern UI powered by Bootstrap
- Simple and intuitive user experience

## Technology Stack

- Java
- Spring Boot
- Thymeleaf
- Bootstrap (for styling)
- MySQL (database)
- Maven

## API Endpoints

| HTTP Method | Endpoint                  | Description                                | Parameters                | Return View           |
|-------------|---------------------------|--------------------------------------------|---------------------------|-----------------------|
| GET         | /tasks                    | Retrieves all tasks and displays them      | None                      | tasks (view)          |
| POST        | /tasks                    | Creates a new task with a given title      | title (String, in request param) | Redirect to /tasks   |
| GET         | /tasks/{id}/delete        | Deletes a specific task by ID              | id (Path)                 | Redirect to /tasks    |
| GET         | /tasks/{id}/toggle        | Toggles the completed status of a task     | id (Path)                 | Redirect to /tasks    |

## Project Structure

```
.
├── .gitattributes
├── .gitignore
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src/
    ├── main/
    └── test/
```

- **src/main/**: Contains the main application code (Java, resources, templates)
- **src/test/**: Contains test cases for the application
- **pom.xml**: Maven build configuration

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- MySQL

### Running the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/harshalmandliya/TodoApp.git
    cd TodoApp
    ```

2. Configure your MySQL database in `src/main/resources/application.properties`:
    ```
    spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Build the project:
    ```bash
    ./mvnw clean install
    ```

4. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

5. Open your browser and navigate to `http://localhost:8080`

## Customization

- **Thymeleaf templates** can be found in `src/main/resources/templates`.
- **Application properties** can be configured in `src/main/resources/application.properties.example`.