package JDBC;

import java.sql.*;
import java.util.Scanner;

public class HospitalManagement {
    static final String BASE_URL = "jdbc:mysql://localhost:3306/?useSSL=false&allowPublicKeyRetrieval=true";
    static final String DB_URL = "jdbc:mysql://localhost:3306/hospital_db?useSSL=false&allowPublicKeyRetrieval=true";
    static final String USER = "root"; 
    static final String PASSWORD = "Salu234@"; 

    static Scanner sc = new Scanner(System.in);

    static {
        // Step 1: Create DB if not exists
        try (Connection conn = DriverManager.getConnection(BASE_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS hospital_db");
            System.out.println("Database checked/created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Step 2: Create tables if not exists
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            String createDoctors = "CREATE TABLE IF NOT EXISTS doctors (" +
                    "doctor_id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(100) NOT NULL," +
                    "specialization VARCHAR(100) NOT NULL" +
                    ")";
            stmt.executeUpdate(createDoctors);

            String createPatients = "CREATE TABLE IF NOT EXISTS patients (" +
                    "patient_id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(100) NOT NULL," +
                    "age INT NOT NULL," +
                    "appointment_no VARCHAR(20) UNIQUE NOT NULL" +
                    ")";
            stmt.executeUpdate(createPatients);

            String createAppointments = "CREATE TABLE IF NOT EXISTS appointments (" +
                    "appointment_id INT PRIMARY KEY AUTO_INCREMENT," +
                    "patient_id INT," +
                    "doctor_id INT," +
                    "appointment_date DATE," +
                    "FOREIGN KEY (patient_id) REFERENCES patients(patient_id)," +
                    "FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id)" +
                    ")";
            stmt.executeUpdate(createAppointments);

            System.out.println("Tables checked/created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Hospital Appointment Management ---");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Exit");
            System.out.println("6. View Patients");
            System.out.println("7. View Doctors");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    addPatient();
                    break;
                case 3:
                    bookAppointment();
                    break;
                case 4:
                    viewAppointments();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                case 6:
                    viewPatients();
                    break;
                case 7:
                    viewDoctors();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Add Doctor
    private static void addDoctor() {
        System.out.print("Enter doctor name: ");
        String name = sc.nextLine();
        System.out.print("Enter specialization: ");
        String specialization = sc.nextLine();

        String sql = "INSERT INTO doctors (name, specialization) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, specialization);
            pstmt.executeUpdate();
            System.out.println("Doctor added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add Patient
    private static void addPatient() {
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        String appointmentNo = "APT" + System.currentTimeMillis(); // unique number

        String sql = "INSERT INTO patients (name, age, appointment_no) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, appointmentNo);
            pstmt.executeUpdate();
            System.out.println("Patient added successfully. Appointment No: " + appointmentNo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Book Appointment
    private static void bookAppointment() {
        System.out.print("Enter appointment number: ");
        String appointmentNo = sc.nextLine();
        System.out.print("Enter doctor ID: ");
        int doctorId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        String findPatient = "SELECT patient_id FROM patients WHERE appointment_no = ?";
        String sql = "INSERT INTO appointments (patient_id, doctor_id, appointment_date) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement findPstmt = conn.prepareStatement(findPatient)) {

            findPstmt.setString(1, appointmentNo);
            ResultSet rs = findPstmt.executeQuery();

            if (rs.next()) {
                int patientId = rs.getInt("patient_id");

                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setInt(1, patientId);
                    pstmt.setInt(2, doctorId);
                    pstmt.setDate(3, Date.valueOf(date));
                    pstmt.executeUpdate();
                    System.out.println("Appointment booked successfully.");
                }

            } else {
                System.out.println("Patient with given appointment number not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View Appointments
    private static void viewAppointments() {
        String sql = "SELECT a.appointment_id, p.name AS patient_name, d.name AS doctor_name, " +
                     "a.appointment_date FROM appointments a " +
                     "JOIN patients p ON a.patient_id = p.patient_id " +
                     "JOIN doctors d ON a.doctor_id = d.doctor_id";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Appointments ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("appointment_id") +
                        ", Patient: " + rs.getString("patient_name") +
                        ", Doctor: " + rs.getString("doctor_name") +
                        ", Date: " + rs.getDate("appointment_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View Patients
    private static void viewPatients() {
        String sql = "SELECT patient_id, name, age, appointment_no FROM patients";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Patients ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("patient_id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Appointment No: " + rs.getString("appointment_no"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View Doctors
    private static void viewDoctors() {
        String sql = "SELECT doctor_id, name, specialization FROM doctors";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Doctors ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("doctor_id") +
                        ", Name: " + rs.getString("name") +
                        ", Specialization: " + rs.getString("specialization"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
