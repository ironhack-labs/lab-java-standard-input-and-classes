import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // Array for 10 employees
        Employee[] employees = new Employee[10];
        Random random = new Random();

        // Loop creating each employee and populating each employee info
        for (int i = 0; i < 10; i++) {
            int randomAge = 20 + random.nextInt(40);
            double randomSalary = 19000.0 + random.nextInt(40000);

            employees[i] = new Employee("Employee" + (i + 1), "employee" + (i + 1) + "@example.com", randomAge, randomSalary);
        }

        // Write to file
        try (PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"))) {
            for (Employee employee : employees) {
                // Write in each line info for each employee
                writer.println("Name: " + employee.getName());
                writer.println("Email: " + employee.getEmail());
                writer.println("Age: " + employee.getAge());
                writer.println("Salary: " + employee.getSalary());
                writer.println();
            }
            System.out.println("Employee information written to employees.txt successfully.");
        } catch (IOException e) {
            // In case of error
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
