package com.bookstore.test.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BookManagementAPI {

    public Response addBook(String payload) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(payload)
                .post("/books");
    }

    public Response getBook(String bookId) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .get("/books/" + bookId);
    }

    public Response updateBook(String bookId, String payload) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(payload)
                .put("/books/" + bookId);
    }

    public Response deleteBook(String bookId) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .delete("/books/" + bookId);
    }
}
