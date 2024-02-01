import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.IntStream;

public class Main {

    static FileWriter writer;

    public static void main(String[] args) throws IOException {
        // Open file to be written in
        writer = new FileWriter("employees.txt", true);

        // Creating employees
        IntStream employees = IntStream.range(1, 8);
        employees.forEach(e -> {
            saveToFile(new Employee("Employee" + e, "employee" + e + "@hotmail.com", (int) getRandomNumericValueInARange(16, 65), getRandomNumericValueInARange(18000, 80000)));
        });

        IntStream interns = IntStream.range(1, 4);
        interns.forEach(i -> {
            saveToFile(new Intern("Intern" + i, "intern" + i + "@hotmail.com", (int) getRandomNumericValueInARange(16, 25), getRandomNumericValueInARange(12000, 30000)));
        });

        // Close buffers
        writer.close();
    }

    private static void saveToFile(Employee employee) {
        try {
            writer.write(employee.toString() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double getRandomNumericValueInARange(int min, int max) {
        return Math.round(((Math.random() * (max - min)) + min) * 100.0) / 100.0;
    }
}
