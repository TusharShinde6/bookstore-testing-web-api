# Bug Report Document

## Bug 1: Registration Page - Invalid Email Format Not Handled
- **Severity**: Medium
- **Description**: The registration form accepts an invalid email format without showing an error message.
- **Steps to Reproduce**:
  1. Go to the registration page.
  2. Enter a valid username.
  3. Enter an invalid email (e.g., "invalidemail").
  4. Enter a valid password.
  5. Click the register button.
- **Expected Result**: An error message should be displayed indicating the email format is invalid.
- **Actual Result**: Registration proceeds without any error message.
- **Solution or Workaround**: Implement client-side validation for email format using JavaScript or VueJS in the registration form to validate email input before submitting to the server. Additionally, enhance server-side validation to reject invalid email formats and return an appropriate error message.

## Bug 2: API - Delete Book with Invalid ID Returns 500
- **Severity**: High
- **Description**: When attempting to delete a book with an invalid ID, the API returns a 500 status code instead of a 404.
- **Steps to Reproduce**:
  1. Send a DELETE request to `/books/invalidID`.
- **Expected Result**: A 404 status code with a message indicating the book was not found.
- **Actual Result**: A 500 status code is returned.
- **Solution or Workaround**: Modify the API endpoint handling for DELETE requests to check for the existence of the book ID before attempting deletion. Return a 404 status code and an appropriate error message if the book ID is not found, ensuring consistent error handling across API operations.
