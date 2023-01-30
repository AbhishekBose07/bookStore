package com.test.bookStorePoc.controller;

import com.test.bookStorePoc.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBookList() {
        BookDto book = BookDto.builder()
                .title("POC")
                .build();

        List<BookDto> books = new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok(books);
    }
}
