package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTestSuite {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    void shouldFetchBooks() throws Exception {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books")                // [1]
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200))               // [2]
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    /*
    @Test
    void shouldAddBook() throws Exception{
        //given
        Gson gson = new Gson();
        BookDto exampleBook = new BookDto("Title 1", "Author 1");
        String json = gson.toJson(exampleBook);
        Mockito.doNothing().when(bookService).addBook(Mockito.any(BookDto.class));

        //when & then
        mockMvc.perform(post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().is(200));
    }

     */


}







