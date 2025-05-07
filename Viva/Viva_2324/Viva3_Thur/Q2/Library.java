package Viva3_Thur.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by author '" + author + "':");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                displayBook(book);
            }
        }
    }

    public void findBooksByTitle(String title) {
        System.out.println("Books by title '" + title + "':");
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                displayBook(book);
            }
        }
    }

    public void displayBook(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
    }

    public boolean borrowBook(String isbn) {
        boolean flag2 = false;
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                flag2 = isPrimeDigit(isbn);
                break;
            }
        }
        return flag2;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN().equals(isbn)) {
                iterator.remove();
                return;
            }
        }
    }

    public void sortBooks() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        displayLibrary();
    }

    public void displayLibrary() {
        System.out.println("Books in the library, sorted by title:");
        for (Book book : books) {
            displayBook(book);
            System.out.println("");
        }
    }

    public boolean isPrimeDigit(String isbn) {
        boolean flag = true;
        int lastTwoDigits = Integer.parseInt(isbn.substring(isbn.length() - 2));
        for (int i = 2; i < lastTwoDigits; i++) {
            if (lastTwoDigits % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
