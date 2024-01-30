import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Employee[] employees = {
                new Employee("John", "john@example.com", 25, 50000),
                new Employee("Jane", "jane@example.com", 28, 60000),
                new Employee("Bob", "bob@example.com", 22, 55000),
                new Employee("Alice", "alice@example.com", 30, 70000),
                new Employee("Charlie", "charlie@example.com", 24, 48000),
                new Intern("Eva", "eva@example.com", 26, 15000),
                new Intern("David", "david@example.com", 29, 22000),
                new Intern("Grace", "grace@example.com", 23, 12000),
                new Intern("Frank", "frank@example.com", 27, 16000),
                new Intern("Helen", "helen@example.com", 31, 19000)
        };
        FileWriter writer = new FileWriter("employees.txt", true);
        for (Employee employee : employees) {
            writer.write("Name: " + employee.getName() + "\n");
            writer.write("Email: " + employee.getEmail() + "\n");
            writer.write("Age: " + employee.getAge() + "\n");
            writer.write("Salary: " + employee.getSalary() + "\n");
            writer.write("\n");
        }
        writer.close();
    }
}
