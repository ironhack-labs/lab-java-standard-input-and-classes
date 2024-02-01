import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John", "john@example.com", 30, 50000.0);
        employees[1] = new Employee("Alice", "alice@example.com", 28, 48000.0);
        employees[2] = new Intern("Adan", "adan@example.com", 20, 48000.0);
        employees[3] = new Intern("John", "fskdj@fklsdjf", 25, 1800 );
        employees[4] = new Employee("Carlos", "fskdjfklsdjf", 25, 566666);


        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + " Email: " + employee.getEmail() + " Age: " + employee.getAge() + " Salary: " + employee.getSalary() + "€");
            System.out.println("-----------------------------------------");
        }


        String filename = "employees.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Employee employee : employees) {
                String info = "Name: " + employee.getName() + ", Email: " + employee.getEmail() + ", Age: "
                        + employee.getAge() + ", Salary: " + employee.getSalary();
                writer.write(info + "\n");
            }
            System.out.println("Employees' information has been written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }


    }
}
