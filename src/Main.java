
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] names = {"Carlos", "Pepe", "Luis", "Andrea" , "Julia", "Anselmo","Pedro", "Iria", "Jose Manuel", "Lidia" };
        String[] domainNameServers = {"@yahoo.es", "@proton.me", "@corporate.es"};
        Integer[] ages = {18, 19, 23, 43, 50};
        Integer[] mockSalaries = {22000, 19000, 30000, 150000, 40000};
        Boolean[] isIntern = {true, false};

        FileWriter writer = new FileWriter("result/employees.txt", false);

        Random random = new Random();
        for(String name : names){
            String email = name + generateRandomValues(domainNameServers);
            int age = generateRandomValues(ages);
            int salary = generateRandomValues(mockSalaries);
            boolean isEmployeeIntern = generateRandomValues(isIntern);

            if(isEmployeeIntern){
                Intern internEmployee = new Intern(name, email, age, salary);
                writer.write(internEmployee.getName() + " " + internEmployee.getEmail() + " " + internEmployee.getAge() + " " + internEmployee.getSalary() + "\n") ;

            }else{
                Employee employee = new Employee(name, email, age, salary);
                writer.write(employee.getName() + " " + employee.getEmail() + " " + employee.getAge() + " " + employee.getSalary() + "\n" );
            }

        }
        writer.close();
    }

    public static <T> T generateRandomValues(T[] data){
        Random random = new Random();
        int index = random.nextInt(data.length);
        return data[index];
    }
}
