package com.bookstore.test.api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookManagementAPITest {

    private BookManagementAPI api = new BookManagementAPI();

    @Test
    public void testAddBookWithValidData() {
        String payload = "{ \"title\": \"New Book\", \"author\": \"Author Name\", \"isbn\": \"1234567890\" }";
        Response response = api.addBook(payload);
        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Test
    public void testAddBookWithInvalidData() {
        String payload = "{ \"title\": \"\", \"author\": \"\", \"isbn\": \"\" }";
        Response response = api.addBook(payload);
        Assert.assertEquals(response.getStatusCode(), 400);
    }

    @Test
    public void testGetBookWithValidId() {
        Response response = api.getBook("validBookId");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void testGetBookWithInvalidId() {
        Response response = api.getBook("invalidBookId");
        Assert.assertEquals(response.getStatusCode(), 404);
    }

    @Test
    public void testUpdateBookWithValidData() {
        String payload = "{ \"title\": \"Updated Book\", \"author\": \"Updated Author\", \"isbn\": \"0987654321\" }";
        Response response = api.updateBook("validBookId", payload);
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void testUpdateBookWithInvalidData() {
        String payload = "{ \"title\": \"\", \"author\": \"\", \"isbn\": \"\" }";
        Response response = api.updateBook("validBookId", payload);
        Assert.assertEquals(response.getStatusCode(), 400);
    }

    @Test
    public void testDeleteBookWithValidId() {
        Response response = api.deleteBook("validBookId");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void testDeleteBookWithInvalidId() {
        Response response = api.deleteBook("invalidBookId");
        Assert.assertEquals(response.getStatusCode(), 404);
    }
}
