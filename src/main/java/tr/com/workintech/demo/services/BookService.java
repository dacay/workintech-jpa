package tr.com.workintech.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.workintech.demo.Book;
import tr.com.workintech.demo.repositories.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        
        return bookRepository.findAll();
    }
}
