# Restaurant Localization Backend

This is the README file for the Restaurant Localization Backend project, which is developed using Spring Boot. This backend application serves as the server-side component for a restaurant localization system, providing APIs and services to manage and retrieve restaurant information.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To get started with the Restaurant Localization Backend, follow the instructions below.

### Prerequisites

Make sure you have the following software installed on your system:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL or any other supported database system

### Installation

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/Chaima31/BackGeoloRestau.git
   ```

2. Change to the project directory:

   ```bash
   cd restaurant-localization-backend
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

### Configuration

Before running the application, you need to configure the database connection settings. Open the `application.properties` file located in the `src/main/resources` directory and modify the following properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/restaurant_localization
spring.datasource.username=db_username
spring.datasource.password=db_password
```

Replace `db_username` and `db_password` with the appropriate credentials for your database.

You can also configure other properties such as the server port and logging levels in the same file.

## Usage

To start the Restaurant Localization Backend, run the following command from the project directory:

```bash
mvn spring-boot:run
```

Once the application is up and running, you can access it at `http://localhost:8080`.

## API Documentation

The Restaurant Localization Backend provides a set of APIs to manage and retrieve restaurant information. The API documentation is available at `http://localhost:8080/swagger-ui.html`. This page allows you to explore the available endpoints, view their request and response structures, and test the APIs directly.

## Contributing

Contributions to the Restaurant Localization Backend project are welcome! If you find any issues or have suggestions for improvements, please open an issue on the project repository. If you would like to contribute code, please follow the standard fork and pull request workflow.

## License

The Restaurant Localization Backend is open-source software released under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code as per the terms of the license.
