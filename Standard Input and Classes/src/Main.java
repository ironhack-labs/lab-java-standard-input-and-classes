import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        int numberOfEntries = 10;
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < numberOfEntries; i++) {
            String name = RandomUtils.generateRandomName();
            String email = RandomUtils.generateRandomEmail(name);
            int age = RandomUtils.generateRandomAge();
            double salary = RandomUtils.generateRandomSalary();

            employeeList.add(new Employee(name, email, age, salary));
        }
        try {
            writeFile(employeeList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Intern intern = new Intern("andreu","estefania@gmail.com",24,34000);

    }
    private static void writeFile(List<Employee> employee_list)  throws IOException {

        String file_path= "Employee.txt";
        FileWriter writer = new FileWriter("Employee.txt", true);
        //Header
        //writer.write("name               |email           |age           |salary \n");

        for (Employee worker : employee_list) {
            int i=1;
            writer.write(worker.getName()+" "+worker.getEmail()+" "+String.valueOf(worker.getAge())+ "years "+String.valueOf(worker.getSalary())+"€ \n");
        }
        writer.close();

    }
}