# API_Automation_task

This project is a RestAssured and Cucumber based automation framework for API testing. It utilizes Maven for dependency management and build automation tool, generates multiple reports to provide comprehensive test results.

## Overview

The purpose of this project is to perform API testing using RestAssured and Cucumber frameworks. It utilizes the BDD (Behavior-Driven Development) approach to write human-readable test scenarios in Gherkin syntax.

## Features

TestNG XML Configuration: The project includes an XML file for configuring the TestNG framework to execute the tests. The XML file runs the TestRunner class, which orchestrates the test execution.

Emailable Report: An emailable report is generated using TestNG-HTML-Report and is stored in the TestNg-html-report folder. This report provides detailed information about the test execution, including test results, pass/fail status.

Maven Integration: The project is integrated with Maven for build automation and dependency management. Running mvn clean install triggers the test execution and generates various reports.

Surefire Reports: After executing the Maven build command, additional reports are generated and stored in the surefire-reports folder.

These reports offer insights into test execution, including test duration, failure details, and stack traces.

## Javadoc

The Javadoc for this project is included in the "javadoc" folder. To access the Javadoc, open the "index.html" file located in the "javadoc" folder in a web browser.

## Prerequisites

Java 11 Development Kit (JDK) installed
Apache Maven installed
IDE (IntelliJ IDEA, Eclipse, etc.) for code editing and execution.
Ensure you have Maven installed on your system.

## Setup and Execution
Clone the project repository:
git clone https://github.com/shahid252/API_Automation_task.git

Open the project in your preferred IDE.

Install project dependencies using Maven:

"mvn clean install"

Execute the test scenarios using the TestNG XML file:

"mvn test"

View TestNG HTML report:
The emailable report can be found in the TestNG-html-report directory after executing the test suite.

View Surefire Reports:
The Surefire Reports, generated during the Maven build process, can be found in the target/surefire-reports directory.

## Project Structure

src/test/java: 
Contains the test code, including step definitions, test runners, services and models.

src/main/resources: Contains feature files written in Gherkin syntax.
pom.xml: The Maven project configuration file.

## Dependencies

RestAssured: Used for making API requests and assertions.
Cucumber: Enables BDD-style test scenarios using Gherkin syntax.
TestNG: Test framework for executing tests and generating reports.

## Contributions

Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.








