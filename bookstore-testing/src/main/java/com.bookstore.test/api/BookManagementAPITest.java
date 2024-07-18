package com.bookstore.test.api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * This class contains API tests for book management operations.
 * It includes tests for adding, retrieving, updating, and deleting books.
 */
public class BookManagementAPITest {

    private BookManagementAPI api = new BookManagementAPI();

    /**
     * Data provider for valid book data.
     *
     * @return Object[][] containing valid book data payloads
     */
    @DataProvider(name = "validBookData")
    public Object[][] validBookData() {
        return new Object[][]{
            {"{ \"title\": \"New Book\", \"author\": \"Author Name\", \"isbn\": \"1234567890\" }"},
            {"{ \"title\": \"Another Book\", \"author\": \"Another Author\", \"isbn\": \"0987654321\" }"}
        };
    }

    /**
     * Data provider for invalid book data.
     *
     * @return Object[][] containing invalid book data payloads
     */
    @DataProvider(name = "invalidBookData")
    public Object[][] invalidBookData() {
        return new Object[][]{
            {"{ \"title\": \"\", \"author\": \"\", \"isbn\": \"\" }"}
        };
    }

    /**
     * Data provider for valid book IDs.
     *
     * @return Object[][] containing valid book IDs
     */
    @DataProvider(name = "validBookId")
    public Object[][] validBookId() {
        return new Object[][]{
            {"validBookId1"},
            {"validBookId2"}
        };
    }

    /**
     * Data provider for invalid book IDs.
     *
     * @return Object[][] containing invalid book IDs
     */
    @DataProvider(name = "invalidBookId")
    public Object[][] invalidBookId() {
        return new Object[][]{
            {"invalidBookId1"},
            {"invalidBookId2"}
        };
    }

    /**
     * Test for adding a book with valid data.
     *
     * @param payload the JSON payload containing book data
     */
    @Test(dataProvider = "validBookData")
    public void testAddBookWithValidData(String payload) {
        Response response = api.addBook(payload);
        Assert.assertEquals(response.getStatusCode(), 201, "Failed to add book with valid data.");
    }

    /**
     * Test for adding a book with invalid data.
     *
     * @param payload the JSON payload containing book data
     */
    @Test(dataProvider = "invalidBookData")
    public void testAddBookWithInvalidData(String payload) {
        Response response = api.addBook(payload);
        Assert.assertEquals(response.getStatusCode(), 400, "Unexpected status code when adding book with invalid data.");
    }

    /**
     * Test for retrieving a book with a valid ID.
     *
     * @param bookId the ID of the book to retrieve
     */
    @Test(dataProvider = "validBookId")
    public void testGetBookWithValidId(String bookId) {
        Response response = api.getBook(bookId);
        Assert.assertEquals(response.getStatusCode(), 200, "Failed to get book with valid ID.");
    }

    /**
     * Test for retrieving a book with an invalid ID.
     *
     * @param bookId the ID of the book to retrieve
     */
    @Test(dataProvider = "invalidBookId")
    public void testGetBookWithInvalidId(String bookId) {
        Response response = api.getBook(bookId);
        Assert.assertEquals(response.getStatusCode(), 404, "Unexpected status code when getting book with invalid ID.");
    }

    /**
     * Test for updating a book with valid data.
     *
     * @param payload the JSON payload containing updated book data
     */
    @Test(dataProvider = "validBookData")
    public void testUpdateBookWithValidData(String payload) {
        String bookId = "validBookId"; // Use a valid book ID for updating
        Response response = api.updateBook(bookId, payload);
        Assert.assertEquals(response.getStatusCode(), 200, "Failed to update book with valid data.");
    }

    /**
     * Test for updating a book with invalid data.
     *
     * @param payload the JSON payload containing updated book data
     */
    @Test(dataProvider = "invalidBookData")
    public void testUpdateBookWithInvalidData(String payload) {
        String bookId = "validBookId"; // Use a valid book ID for updating
        Response response = api.updateBook(bookId, payload);
        Assert.assertEquals(response.getStatusCode(), 400, "Unexpected status code when updating book with invalid data.");
    }

    /**
     * Test for deleting a book with a valid ID.
     *
     * @param bookId the ID of the book to delete
     */
    @Test(dataProvider = "validBookId")
    public void testDeleteBookWithValidId(String bookId) {
        Response response = api.deleteBook(bookId);
        Assert.assertEquals(response.getStatusCode(), 200, "Failed to delete book with valid ID.");
    }

    /**
     * Test for deleting a book with an invalid ID.
     *
     * @param bookId the ID of the book to delete
     */
    @Test(dataProvider = "invalidBookId")
    public void testDeleteBookWithInvalidId(String bookId) {
        Response response = api.deleteBook(bookId);
        Assert.assertEquals(response.getStatusCode(), 404, "Unexpected status code when deleting book with invalid ID.");
    }
}
