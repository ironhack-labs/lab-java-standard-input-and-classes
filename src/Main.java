import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee[] employeesArr = new Employee[10];

        FileWriter writer = new FileWriter("data/employees.txt", false);

        for (int i = 0; i < employeesArr.length; i++) {
            final String name = generateRandomName();

            if (i < 5) {
                employeesArr[i] = new Employee(name, generateRandomEmail(name), generateRandomAge(), generateRandomSalary());
            } else {
                employeesArr[i] = new Intern(name, generateRandomEmail(name), generateRandomAge(), generateRandomSalary());
            }

            writer.write("Name: " + employeesArr[i].getName() + "\n");
            writer.write("Email: " + employeesArr[i].getEmail() + "\n");
            writer.write("Age: " + employeesArr[i].getAge() + "\n");
            writer.write("Salay: " + employeesArr[i].getSalary() + "\n");
            writer.write("____________________ \n");
        }

        writer.close();
    }

    private static String generateRandomName() {
        final String[] names = {
            "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace",
            "Hank", "Ivy", "Jack", "Katherine", "Leo", "Mia", "Nathan",
            "Olivia", "Peter", "Quincy", "Rachel", "Samuel", "Tracy"
        };

        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    private static String generateRandomEmail(String name) {
        return name.toLowerCase() + "@company.com";
    }

    private static int generateRandomAge() {
        final int minValue = 18;
        final int maxValue = 67;

        Random random = new Random();
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }

    private static int generateRandomSalary() {
        final int minValue = 15000;
        final int maxValue = 25000;

        Random random = new Random();
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }

}
