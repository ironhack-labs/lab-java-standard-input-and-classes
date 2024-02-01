import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        // PART 1 - INTERN OBJECTS

        // Testing case of intern with specified salary over the limit
        double exceededSalary = 50000.00;
        Intern internExceededSalary = new Intern("Marc", "marc56789@example.com", 18, exceededSalary);
        System.out.println("Case 1) The salary for the intern with exceeded salary (" + exceededSalary + ") was set to: " + internExceededSalary.getSalary());

        // Testing case of intern with specified salary between the limits
        double correctSalary = 15000.00;
        Intern internCorrectSalary = new Intern("Marc", "marc56789@example.com", 18, correctSalary);
        System.out.println("Case 2) The salary for the intern with correct salary (" + correctSalary + ") was set to: " + internCorrectSalary.getSalary());

        // Testing case of trying to update an intern's salary exceeding the limit
        Intern internUpdatingSalary = new Intern("Marc", "marc56789@gmail.com", 18, correctSalary);
        internUpdatingSalary.setSalary(exceededSalary);
        System.out.println("Case 3) The salary for the intern with an update on its salary that exceeds the limits (" + exceededSalary + ") was set to: " + internUpdatingSalary.getSalary());






        // PART 2 - EMPLOYEE OBJECTS
        try{
            // Create .txt file to fill in
            FileWriter writer = new FileWriter("employees.txt"); //append<>true so that the file content will be replaced each time the program is executed

            // Create employees array to be filled with employees objects
            Employee[] employeesArray = new Employee[10];

            // Create random object to generate random numbers
            Random ran = new Random();
            for (int i=0; i<10; i++) {
                String randomId = UUID.randomUUID().toString();
                String randomEmail = randomId + "@example.com";
                int randomAge = ran.nextInt(18, 50);
                double randomSalary = ran.nextInt(10000,50000);
                employeesArray[i] = new Employee(randomId, randomEmail, randomAge, randomSalary);
                writer.write("Employee #" + (i+1) + "\n Name: " + employeesArray[i].getName() + "\n Email: " + employeesArray[i].getEmail() + "\n Age: " + employeesArray[i].getAge() + "\n Salary: " + employeesArray[i].getSalary() + "\n\n");
            }

            writer.close();
        }catch (IOException e){
            System.out.println("General IO Exception - error encountered when trying to write on file employees.txt: " + e.getMessage());
        }
    }
}