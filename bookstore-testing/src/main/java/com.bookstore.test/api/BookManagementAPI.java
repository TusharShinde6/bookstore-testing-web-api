package com.bookstore.test.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * BookManagementAPI class provides methods to interact with the bookstore's RESTful API.
 */
public class BookManagementAPI {

    /**
     * Sends a POST request to add a new book.
     * @param payload JSON payload containing book details.
     */
    public Response addBook(String payload) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(payload)
                .post("/books");
    }

    /**
     * Sends a GET request to retrieve book details by book ID.
     * @param bookId The ID of the book to retrieve.
     */
    public Response getBook(String bookId) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .get("/books/" + bookId);
    }

    /**
     * Sends a PUT request to update book details by book ID.
     * @param bookId The ID of the book to update.
     * @param payload JSON payload containing updated book details.
     */
    public Response updateBook(String bookId, String payload) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(payload)
                .put("/books/" + bookId);
    }

    /**
     * Sends a DELETE request to delete a book by book ID.
     * @param bookId The ID of the book to delete.
     */
    public Response deleteBook(String bookId) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .delete("/books/" + bookId);
    }
}
