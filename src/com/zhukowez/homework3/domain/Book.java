package homework3.domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Book {
    private String bookName;
    private String authorLastName;
    private String authorFirstName;
    private String authorPatronymic;

    public Book() {
    }

    public Book(String bookName, String authorLastName, String authorFirstName, String authorPatronymic) {
        this.bookName = bookName;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.authorPatronymic = authorPatronymic;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(authorLastName, book.authorLastName) && Objects.equals(authorFirstName, book.authorFirstName) && Objects.equals(authorPatronymic, book.authorPatronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorLastName, authorFirstName, authorPatronymic);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorPatronymic='" + authorPatronymic + '\'' +
                '}';
    }

    public static void printBookList(List<Book> books) {
        for (Book bookPrint : books) {
            System.out.print(
                    bookPrint.getBookName() + " " +
                            bookPrint.getAuthorLastName() + " " +
                            bookPrint.getAuthorFirstName() + " " +
                            bookPrint.getAuthorPatronymic() + "\n");
        }
    }

    public static void printBookHashSetVowel(HashSet<Book> booksHashSet) {
        Iterator<Book> books = booksHashSet.iterator();
        while (books.hasNext()) {
            Book book = books.next();
            if (vowelSounds(book.getBookName()) == true) {
                System.out.print(
                        book.getBookName() + " " +
                                book.getAuthorLastName() + " " +
                                book.getAuthorFirstName() + " " +
                                book.getAuthorPatronymic() + "\n");
            }
        }
    }

    private static boolean vowelSounds(String bookName) {
        String letter = String.valueOf(bookName.charAt(0));
        if (letter.equals("А") || letter.equals("Я") ||
                letter.equals("О") || letter.equals("Е") ||
                letter.equals("У") || letter.equals("Ю") ||
                letter.equals("Ы") || letter.equals("И") ||
                letter.equals("Э") || letter.equals("Ё")) {
            return true;
        } else return false;
    }
}
