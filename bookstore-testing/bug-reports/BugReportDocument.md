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

## Bug 2: API - Delete Book with Invalid ID Returns 500
- **Severity**: High
- **Description**: When attempting to delete a book with an invalid ID, the API returns a 500 status code instead of a 404.
- **Steps to Reproduce**:
  1. Send a DELETE request to `/books/invalidID`.
- **Expected Result**: A 404 status code with a message indicating the book was not found.
- **Actual Result**: A 500 status code is returned.
