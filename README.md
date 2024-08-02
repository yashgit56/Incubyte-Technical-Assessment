# Calculator

This project implements a simple string calculator in Java that can parse a string of numbers separated by custom delimiters and return their sum. It includes support for default delimiters, custom delimiters, and handles special cases such as negative numbers and large numbers.

## Features

- **Default Delimiter:** Commas (`,`) and newlines (`\n`) can be used to separate numbers.
- **Negative Numbers:** Throws an exception for negative numbers, listing all negative values in the exception message.
- **Empty Strings:** Returns 0 for an empty string.

## Requirements

- Java Development Kit (JDK) 8 or higher
- JUnit 4 for running tests

## Setup

1. **Clone the repository:**

   ```bash
   git clone <repository-url>
   cd calculator

2. Compile the code: 
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar Calculator.java CalculatorTest.java

3. Run tests 

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest


