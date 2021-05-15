package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {
    private List<Book> list;

    {
        list = new ArrayList<>();
        list.add(new Book());
    }

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("-----------------------------------");
    }

    public String returnBook() {
        int error = 10 / 0;
        System.out.println("Return Book в UniLibrary");
        return "War and peace";
    }

    public void getMagazine() {
        System.out.println("Get Magazine из UniLibrary");
        System.out.println("-----------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Return Magazine в UniLibrary");
        System.out.println("-----------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("-----------------------------------");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в UniLibrary");
        System.out.println("-----------------------------------");
    }

}
