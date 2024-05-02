package tr.com.workintech.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tr.com.workintech.demo.services.BookService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private BookService bookService;

	@Test
	void bookServiceWorks() {

		List<Book> books = bookService.list();

		assertEquals(books.size(), 3);
	}
}
