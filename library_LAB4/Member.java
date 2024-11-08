package lab4.library;

import java.util.ArrayList;

public class Member {
	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
    private String memberId;
    private String name;
    private ArrayList<Book> borrowedBooks;
    // private borrowedbBooks TODO: implement collection of borrowed books
	
 	// TODO: implement functionality of Member class

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " has borrowed " + book.getTitle());
    }
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(name + " has returned " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow " + book.getTitle());
        }
    }
}
