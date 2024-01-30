import java.util.Random;

public class RandomUtils {
    public static String generateRandomName() {
        String[] names = {
                "John", "Alice", "Bob", "Eva", "David", "Sophia", "Liam", "Olivia",
                "Michael", "Emma", "William", "Ava", "James", "Mia", "Daniel", "Isabella"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static String generateRandomEmail(String name) {
            String domain = "example.com"; // Change to your desired domain
            return name.toLowerCase() + "@" + domain;
    }

    public static int generateRandomAge() {
            Random random = new Random();
            int minAge = 18; // Minimum age
            int maxAge = 80; // Maximum age
            return random.nextInt(maxAge - minAge + 1) + minAge;

    }
    public static int generateRandomSalary() {
        Random random = new Random();
        int minSalary = 15000; // Minimum age
        int maxSalary = 20000; // Maximum age
        return random.nextInt(maxSalary - minSalary + 1) + minSalary;
    }
}