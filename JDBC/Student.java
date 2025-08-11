package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.createDatabase();
        obj.createTable();
         obj.createData();
    }

    public void createDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String user = "root";
            String password = "Salu234@";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String query = "CREATE DATABASE Shivani";
            stmt.executeUpdate(query);

            System.out.println("Database created successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/Shivani?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String user = "root";
            String password = "Salu234@";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String query = "CREATE TABLE student(S_id INT(3), S_name VARCHAR(20), S_age INT(2), S_address VARCHAR(20))";
            stmt.executeUpdate(query);

            System.out.println("Table created successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createData() {
        try {
            String url = "jdbc:mysql://localhost:3306/Shivani?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String user = "root";
            String password = "Salu234@";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String query = "INSERT INTO student(S_id, S_name, S_age, S_address) VALUES (1, 'Sargun', 20, 'Delhi')";
            stmt.executeUpdate(query);

            System.out.println("Data inserted successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
