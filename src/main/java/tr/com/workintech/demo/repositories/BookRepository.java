package tr.com.workintech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tr.com.workintech.demo.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
