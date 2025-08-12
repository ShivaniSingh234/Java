package JDBC;
import java.sql.*;
import java.util.Scanner;

public class LibraryJDBC {

    // Base MySQL connection (no specific DB at first)
    static final String BASE_URL = "jdbc:mysql://localhost:3306/?useSSL=false&allowPublicKeyRetrieval=true";
    static final String DB_URL = "jdbc:mysql://localhost:3306/librarydb?useSSL=false&allowPublicKeyRetrieval=true";
    static final String USER = "root"; // change if needed
    static final String PASSWORD = "Salu234@";
     // change if needed

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Connect without DB to create it
            try (Connection conn = DriverManager.getConnection(BASE_URL, USER, PASSWORD)) {
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS librarydb");
                System.out.println("Database 'librarydb' ready.");
            }

            // Step 2: Connect to the librarydb
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                // Step 3: Creating table if not exists
                String createTableSQL = """
                        CREATE TABLE IF NOT EXISTS books (
                            id INT PRIMARY KEY AUTO_INCREMENT,
                            title VARCHAR(100) NOT NULL,
                            author VARCHAR(100) NOT NULL,
                            price DOUBLE NOT NULL
                        )
                        """;
                conn.createStatement().executeUpdate(createTableSQL);
                System.out.println("Table 'books' ready.");

                // Step 4: Menu for CRUD operations
                while (true) {
                    System.out.println("\n=== Library Management ===");
                    System.out.println("1. Add Book");
                    System.out.println("2. View Books");
                    System.out.println("3. Update Book Price");
                    System.out.println("4. Delete Book");
                    System.out.println("5. Exit");
                    System.out.print("Choose option: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1 -> addBook(conn, sc);
                        case 2 -> viewBooks(conn);
                        case 3 -> updateBookPrice(conn, sc);
                        case 4 -> deleteBook(conn, sc);
                        case 5 -> {
                            System.out.println("Exiting...");
                            sc.close();
                            return;
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    private static void addBook(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter book ID: ");
        int bookId = sc.nextInt();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, title);
            stmt.setDouble(2, bookId);
            stmt.setString(3, author);
            stmt.setDouble(4, price);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " book(s) added successfully!");
        }
    }

    // READ
    private static void viewBooks(Connection conn) throws SQLException {
        String sql = "SELECT * FROM books";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Books in Library ---");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                                   rs.getString("title") + " | " +
                                   rs.getString("author") + " | Rs. " +
                                   rs.getDouble("price"));
            }
        }
    }

    // UPDATE
    private static void updateBookPrice(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter book ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter new price: ");
        double price = sc.nextDouble();

        String sql = "UPDATE books SET price = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, price);
            stmt.setInt(2, id);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Book price updated successfully!");
            else
                System.out.println("Book not found!");
        }
    }

    // DELETE
    private static void deleteBook(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter book ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM books WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Book deleted successfully!");
            else
                System.out.println("Book not found!");
        }
    }
}
