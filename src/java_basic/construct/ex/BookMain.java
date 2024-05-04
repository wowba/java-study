package java_basic.construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.printInfo();

        Book book2 = new Book("java", "Kim");
        book2.printInfo();

        Book book3 = new Book("javaScript", "Lee", 300);
        book3.printInfo();
    }
}
