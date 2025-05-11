package com.example.bookshelf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookshelf.services.client.BookClient;
@RestController
public class BookController {

    private final BookClient bookClient;

    public BookController(BookClient bookClient) {
        this.bookClient = bookClient;
    }


	@GetMapping("/test")
	public String getBook() {
		return bookClient.getBook();
	}
}