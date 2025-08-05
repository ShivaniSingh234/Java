package EMPLOYEEMANAGEMENT;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private String name;
    private int id;
    private static final long serialVersionUID = 1L;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class Main {

    private static final String FILE_NAME = "employees.txt";
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        loadData();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n======================================");
                System.out.println("      Employee Management System     ");
                System.out.println("======================================");

                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Search Employee");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice;
                try {
                    choice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next();
                    continue;
                }

                switch (choice) {
                    case 1 ->
                        addEmployee(sc);

                    case 2 ->
                        viewEmployees();

                    case 3 ->
                        editEmployees(sc);

                    case 4 ->
                        deleteEmployee(sc);
                    case 5 ->
                        searchEmployee(sc);
                    case 6 -> {
                        savedata();
                        System.out.println("Exiting...");
                        return;
                    }

                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

    }

    private static void addEmployee(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, dept, salary));
        System.out.println("Employee added successfully.");

    }

    private static void editEmployees(Scanner sc) {
        System.out.print("Enter Employee ID to edit: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.print("Enter new Name: ");
                emp.setName(sc.nextLine());
                System.out.print("Enter new Department: ");
                emp.setDepartment(sc.nextLine());
                System.out.print("Enter new Salary: ");
                emp.setSalary(sc.nextDouble());
                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("-------------No employees found--------------");
        } else {
            System.out.println("\n  ╔════════════════════════════════════════════════════════════╗");
            System.out.println("  ║                      EMPLOYEE DETAILS                      ║");
            System.out.println("  ╚════════════════════════════════════════════════════════════╝");
            System.out.printf("%-10s %-20s %-20s %-10s\n", "ID", "Name", "Department", "Salary");
            System.out.println("--------------------------------------------------------------");

            for (Employee emp : employees) {
                System.out.printf("%-10d %-20s %-20s %-10.2f\n",
                        emp.getId(), emp.getName(), emp.getDepartment(), emp.getSalary());
            }

        }
    }

    private static void deleteEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Are you sure you want to delete this employee? (y/n): ");
        String confirm = sc.nextLine();
        if (!confirm.equalsIgnoreCase("y")) {
            System.out.println("Deletion cancelled.");
            return;
        }
        for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
            Employee emp = iterator.next();
            if (emp.getId() == id) {
                iterator.remove();
                System.out.println("-------------Employee deleted.--------------");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.println("Employee found: " + emp);
                return;
            }
        }
        System.out.println("----------Employee not found--------------");
    }

    private static void savedata() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private static void loadData() {

        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("---------No existing data found. Starting fresh!!---------");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            @SuppressWarnings("unchecked")
            List<Employee> loadedList = (List<Employee>) ois.readObject();
            employees = loadedList;
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

}