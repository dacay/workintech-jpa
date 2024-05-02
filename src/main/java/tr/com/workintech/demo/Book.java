package tr.com.workintech.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
    
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Long getId() {

        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
