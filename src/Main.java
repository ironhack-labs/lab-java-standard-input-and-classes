import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main{
    public static void main(String[] args){
        Employee[] employees = new Employee[10];
        for(int i = 0; i<10; i++){
            employees[i] = new Employee("Employee" + (i + 1), "employee" + (i + 1) + "@company.com", 25 + i, 50000 + i * 1000);
        }
        try(PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"))){
            for(Employee employee : employees){
                writer.println("Name"+ employee.getName());
                writer.println("Email"+ employee.getEmail());
                writer.println("Age"+ employee.getAge());
                writer.println("Salary"+ employee.getSalary());
                writer.println();
            }
            System.out.println("Employee properties written to employees.txt");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}