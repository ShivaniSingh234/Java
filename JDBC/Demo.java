package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user = "root";
        String password = "Salu234@";

        try {
            // Optional but good to have
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String query = "CREATE DATABASE my_dbdb";
            stmt.executeUpdate(query);

            System.out.println(" Database created successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
