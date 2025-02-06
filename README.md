# BMI Calculator

## Overview
This project calculates the **Body Mass Index (BMI)** to help determine a person's weight category. It requires input values for **weight** (kg) and **height** (m) and applies the standard formula:

```
BMI = weight / height²
```

The program then classifies the BMI result into categories: **underweight, normal weight, overweight, or obesity**.

### BMI Categories
The BMI is classified according to the following table:

| BMI Range        | Classification       |
|------------------|----------------------|
| < 16             | Severe thinness      |
| [16-17)          | Moderate thinness    |
| [17-18.5)        | Mild thinness        |
| [18.5-25)        | Normal weight        |
| [25-30)          | Overweight           |
| [30-35)          | Obesity class I      |
| [35-40)          | Obesity class II     |
| >= 40            | Obesity class III    |

## Features
- Simple BMI calculation based on user input.
- Classification of BMI into different health categories.
- Test-driven development (**TDD**) approach with at least **70% test coverage**.

## Getting Started
### Prerequisites
- Java Development Kit (**JDK 8+**)
- An IDE such as VS Code, IntelliJ, or Eclipse
- Git for version control
- **Maven** or **Gradle** for dependency management (optional)

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/Carlotaml21/Java_IMC.git
   cd Java_IMC
   ```
2. Open the project in your IDE.
3. Compile and run the program:
   ```sh
   javac Main.java
   java Main
   ```

### Running Tests
To ensure the correctness of the implementation, run the unit tests:
```sh
mvn test  # If using Maven
```
or
```sh
gradle test  # If using Gradle
```

