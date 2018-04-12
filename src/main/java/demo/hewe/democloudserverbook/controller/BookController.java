package demo.hewe.democloudserverbook.controller;

import demo.hewe.democloudserverbook.entity.BookEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/book")
public class BookController {
    private static final Random rand = new Random();

    @GetMapping("/getname")
    public String getName(@RequestParam("id") int id) {
        return id + "百科大全";
    }

    @PostMapping("/add")
    public String add(@RequestParam("name") String name, @RequestParam("price") Float price) {
        BookEntity book = new BookEntity();
        book.setId(24);
        book.setName(name);
        book.setPrice(price);
        return "OK";
    }

    @GetMapping("/info")
    public BookEntity info(@RequestParam("id") int id) {
        BookEntity book = new BookEntity();
        book.setId(24);
        book.setName("百科大全");
        book.setPrice(199.9f);

        return book;
    }

    @GetMapping("/list")
    public List<BookEntity> list() {
        List<BookEntity> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            BookEntity book = new BookEntity();
            book.setId(24 + i);
            book.setName("百科大全:" + i);
            book.setPrice(199.9f + i);
            list.add(book);
        }
        return list;
    }
}
