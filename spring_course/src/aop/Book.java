package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Преступление и наказание")
    private String name;

    @Value("Достоевский Ф.М.")
    private String author;

    @Value("1866")
    private int yearsOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }

    public void setName(String name) {
        this.name = name;
    }
}
