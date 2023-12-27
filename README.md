# Mini Bank Management System

A simple Java and Maven-based Mini Bank Management System that retrieves customer and account information from a MySQL database.

## Features

- Display customer details
- Display account details
- Retrieve customer information
- Retrieve account information

## Technologies Used

- Java
- Maven
- MySQL

## Prerequisites

- Java Development Kit (JDK) installed
- Maven installed
- MySQL Database Server installed and running

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/Dancan254/BankManagementSystem.git
cd BankManagementSystem
```

2. Configure Database:

   - Create a MySQL database.
   - Update the database configuration in `src/main/resources/application.properties` with your database connection details.

3. Build the project:

```bash
mvn clean install
```

4. Run the application:

```bash
java -jar target/BankManagementSystem.jar
```

## Usage

1. **Display customer details:**

   Choose the option to display customer details.

2. **Display account details:**

   Choose the option to display account details.

3. **Retrieve customer information:**

   Enter the customer ID when prompted.

4. **Retrieve account information:**

   Enter the account number when prompted.

## Contributing

If you would like to contribute to the project, follow these steps:

1. Fork the repository.
2. Create a new branch for your feature: `git checkout -b feature/your-feature`.
3. Commit your changes: `git commit -am 'Add some feature'`.
4. Push to the branch: `git push origin feature/your-feature`.
5. Submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- LinkedLn learning hands-on
