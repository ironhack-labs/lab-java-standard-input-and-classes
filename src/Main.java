import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        createEmployees();
    }
    public static void createEmployees(){
        //create 10 Employee objects:
        Employee[] employees = new Employee[10];

        for(int i = 0; i< employees.length;i++){
            //random salary between 15.000 and 30.000
            Random random = new Random();
            double randomSalary = random.nextDouble(15000, 30000);
            double roundedSalary= Math.round(randomSalary*100.0)/100.0;
            employees[i] = new Employee("Name" + (i+1), 20+i, roundedSalary);
        }

        try {
            FileWriter writer = new FileWriter("employees.txt");
            for(Employee empl : employees){
                writer.write("Name: " + empl.getName()+ "\n");
                writer.write("Email: " + empl.getEmail()+ "\n");
                writer.write("Age: " + empl.getAge()+ "\n");
                writer.write("Salary: " + empl.getSalary() + "€\n");
                writer.write("================" + "\n");

            }
            writer.close();
        }

        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
