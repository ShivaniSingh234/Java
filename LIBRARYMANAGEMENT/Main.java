package LIBRARYMANAGEMENT;

import java.util.*;

// Interface for abstraction
interface LibraryOperations {
    void addBook(Book book);
    void removeBook(String title);
    void displayBooks();
}

// Encapsulated Book class
class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return isIssued; }

    public void issueBook() { isIssued = true; }
    public void returnBook() { isIssued = false; }

    public String toString() {
        return title + " by " + author + (isIssued ? " (Issued)" : "");
    }
}

// User class
class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void viewBooks(Library lib) {
        lib.displayBooks();
    }
}

// Admin class using inheritance + interface implementation
class Admin extends User implements LibraryOperations {
    public Admin(String name) {
        super(name);
    }

    public void addBook(Book book) {
        Library.books.add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(String title) {
        for (Book book : Library.books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                Library.books.remove(book);
                System.out.println("Book removed.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        for (Book book : Library.books) {
            System.out.println(book);
        }
    }
}

//Library class for issuing/returning
class Library {
    public static ArrayList<Book> books = new ArrayList<>();

    public void issueBook(String title) throws CustomException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued.");
                    return;
                } else {
                    throw new CustomException("Book is already issued.");
                }
            }
        }
        throw new CustomException("Book not found.");
    }

    public void returnBook(String title) throws CustomException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned.");
                    return;
                } else {
                    throw new CustomException("Book wasn't issued.");
                }
            }
        }
        throw new CustomException("Book not found.");
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Custom exception for library errors
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main driver class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        Admin admin = new Admin("Admin");
        User user = new User("Student");

        while (true) {
            System.out.println("\n--- LIBRARY MENU ---");
            System.out.println("1. Add Book\n2. Remove Book\n3. View Books\n4. Issue Book\n5. Return Book\n6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter book title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter author: ");
                        String author = sc.nextLine();
                        admin.addBook(new Book(title, author));
                        break;

                    case 2:
                        System.out.print("Enter title to remove: ");
                        admin.removeBook(sc.nextLine());
                        break;

                    case 3:
                        user.viewBooks(lib);
                        break;

                    case 4:
                        System.out.print("Enter book title to issue: ");
                        lib.issueBook(sc.nextLine());
                        break;

                    case 5:
                        System.out.print("Enter book title to return: ");
                        lib.returnBook(sc.nextLine());
                        break;

                    case 6:
                        System.out.println("Thank you for using Library!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (CustomException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e);
            }
        }
    }
}
