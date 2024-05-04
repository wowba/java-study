package java_basic.construct.ex;

public class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author) {
        this(title, author, 100);
    }

    Book() {
        this("Big poop", "Yang Yang", 100);
    }

    void printInfo() {
        System.out.println(this.title + "\t" + this.author + "\t" + this.pages);
    }
}
