# Drools Demo with Spring Boot

This is a simple Spring Boot application that demonstrates the usage of Drools rules engine. The application includes a REST API endpoint that takes the age as input, applies Drools rules to determine eligibility for a discount and senior citizenship, and returns a response.

## Prerequisites

- Java 8 or higher
- Maven
- Git (optional)

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/xxxxxxxx/drools-demo.git
    ```

2. Navigate to the project directory:

    ```bash
    cd drools-demo
    ```

3. Build the application:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

The application will start, and you can access the REST API endpoint at http://localhost:8080/api/checkDiscount/{age}.

## API Endpoint

### Check Discount

- **Endpoint:** `/api/checkDiscount/{name}/{age}`
- **Method:** GET
- **Path Variable:**
    - `name` (string): Name of the person
    - `age` (integer): Age of the person

#### Example

```bash
curl -X GET http://localhost:8080/api/checkDiscount/Simon/25
```

## Rules
The Drools rules are defined in the src/main/resources/rules/personRules.drl file. The rules check the age of a person and print messages based on the conditions.

## License
This project is licensed under the Apache License 2.0 - see the LICENSE file for details.

## Acknowledgments
* [Drools Documentation](https://www.drools.org/learn/documentation.html)
* [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)