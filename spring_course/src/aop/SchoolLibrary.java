package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из Школьной библиотеки");
    }
}
