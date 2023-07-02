package hafta5;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
    private String name;
    private int numberOfPages;
    private String authorName;
    private LocalDate publicationDate;

    public Book(String name, int numberOfPages, String authorName, LocalDate publicationDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.name.compareTo(otherBook.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
}
