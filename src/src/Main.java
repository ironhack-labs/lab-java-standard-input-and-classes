import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Open writer
        FileWriter writer = new FileWriter("employees.txt", true);

        // Create Employees and write data to the file
        for(int i = 0; i < 10; i++) {
            Employee employee = new Employee("Test " + i, "test" + i + "@test.com", 25, 50000);
            writer.write(employee.getName() + ", " + employee.getEmail() + ", " + employee.getAge() + ", " + employee.getSalary() + "\n");
        }

        // Adding intern with a salary above the limit to check exception handling
        try {
            Intern intern = new Intern("Test Intern", "testintern@test.com", 25, 50000);
            writer.write(intern.getName() + ", " + intern.getEmail() + ", " + intern.getAge() + ", " + intern.getSalary() + "\n");
        } catch (IllegalArgumentException e) {
            System.err.println("The intern salary cannot exceed the limit");
        }

        // Close writer
        writer.close();
    }
}