import hafta1.Employee;
import hafta5.Book;

import javax.sound.midi.Soundbank;
import java.awt.image.ImageProducer;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Book1", 200, "Author1", LocalDate.of(2023, 1, 1)));
        bookSetByName.add(new Book("Book2", 150, "Author2", LocalDate.of(2023, 2, 2)));
        bookSetByName.add(new Book("Book3", 180, "Author3", LocalDate.of(2013, 3, 3)));
        bookSetByName.add(new Book("Book4", 300, "Author4", LocalDate.of(2023, 4, 4)));
        bookSetByName.add(new Book("Book5", 250, "Author5", LocalDate.of(2022, 5, 5)));

        Set<Book> bookSetByPageCount = new TreeSet<>((book1, book2) -> book1.getNumberOfPages() - book2.getNumberOfPages());
        bookSetByPageCount.addAll(bookSetByName);


    }
}
