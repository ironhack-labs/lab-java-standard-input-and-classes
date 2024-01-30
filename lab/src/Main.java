import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee [10];


        employees[0] = new Intern("employee1", "employee1@gmail.com", 22, 16000);
        employees[1] = new Employee("employee2", "employee2@gmail.com", 32, 30000);
        employees[2] = new Intern("employee3", "employee3@gmail.com", 25, 22000);
        employees[3] = new Intern("employee4", "employee4@gmail.com", 28, 20000);
        employees[4] = new Employee("employee5", "employee5@gmail.com", 45, 65000);
        employees[5] = new Intern("employee6", "employee6@gmail.com", 30, 30000);
        employees[6] = new Employee("employee7", "employee7@gmail.com", 64, 70000);
        employees[7] = new Employee("employee8", "employee8@gmail.com", 72, 65000);
        employees[8] = new Employee("employee9", "employee9@gmail.com", 47, 65000);
        employees[9] = new Employee("employee10", "employee10@gmail.com", 53, 45000);

        employees[2].setSalary(35000);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"))) {
            for (Employee employee : employees) {
                writer.write("Name: " + employee.getName() + "\n");
                writer.write("Email: " + employee.getEmail() + "\n");
                writer.write("Age: " + employee.getAge() + "\n");
                writer.write("Salary: " + employee.getSalary() + "\n");
                writer.write("\n");
            }
            System.out.println("file employees.txt created successfully, please verify the content :) ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}