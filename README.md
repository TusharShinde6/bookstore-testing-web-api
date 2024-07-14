# Bookstore Web Application and API Testing

## Project Description
This project involves testing a web application for a bookstore that includes user registration, login functionality, user dashboard, and interaction with a RESTful API. The web application is built using HTML, CSS, VueJS, and has a GraphQL backend for managing books.

## Requirements
### Manual Testing
- **User Registration:**
  - Test all form fields, validation rules, and error messages.
- **User Login:**
  - Test with valid/invalid credentials, error messages, and session management.
- **User Dashboard:**
  - Test data display, user interactions, and navigation.
- **Book Management API:**
  - Adding a Book: Test with valid and invalid inputs.
  - Retrieving a Book: Test with valid and invalid book IDs.
  - Updating Book Details: Test with valid and invalid data.
  - Deleting a Book: Test with valid and invalid book IDs.

### Automated Testing
- Develop automated test scripts using Java, Selenium for the web application, and tools like Postman or RestAssured for the API.
- Automate the following test cases:
  - **Web Application:**
    - User Registration with valid and invalid inputs.
    - User Login with valid and invalid credentials.
    - Basic functionality of the User Dashboard.
  - **Book Management API:**
    - Adding a Book with valid and invalid inputs.
    - Retrieving a Book with valid and invalid book IDs.
    - Updating Book Details with valid and invalid data.
    - Deleting a Book with valid and invalid book IDs.

## Files Included
- **src/test/java:** Contains automated test scripts in Java using Selenium and TestNG.
- **src/test/resources/testData.xlsx:** Excel file containing test data for automated tests.
- **README.md:** This file containing project details, setup instructions, and test case descriptions.
- **TestPlanDocument.md:** Detailed test plan document outlining manual test cases.
- **BugReportDocument.md:** Document highlighting any issues found during testing.
- **pom.xml:** Maven configuration file with dependencies.

## Setup Instructions
1. **Clone Repository:**
   ```bash
   git clone https://github.com/TusharShinde6/bookstore-testing-web-api.git

2. **Install Dependencies:**
    Ensure you have Java, Maven, and your preferred IDE installed.

3. **Run Automated Tests:**
    - Import the project into your IDE.
      - Open directory
      ```bash
      cd bookstore-testing 
    - run test classes from src/test/java.
    - To run tests from command line using Maven
        mvn clean test
4. **Manual Testing:**
    - Follow the test plan in TestPlanDocument.md.
    - Record any bugs found in BugReportDocument.md.


### Contact Information
    For any issues or questions, please contact:
    Name: Tushar Shinde
    Email: shindetc.7@gmail.com
    Phone: 7774871217

