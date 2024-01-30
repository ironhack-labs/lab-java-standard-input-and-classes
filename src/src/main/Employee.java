package main;

import java.io.FileWriter;
import java.io.IOException;

public class Employee {
    private String name;
    private String email;
    private int age;
    private int salary;

    public Employee(String name, String email, int age, int salary){
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Intern extends Employee{
    private static final int MAX_SALARY = 20000;
    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, salary);
    }

    // limit intern salary
    public void setSalary(float salary){
        if(salary > MAX_SALARY){
            System.err.println("Salary intern cannot be superior than 20000");
        } else {
            setSalary(salary);
        }
    }
}

class ex3{
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("employee.txt",true);

        for(int i=0; i<11; i++){
            Employee x = new Employee("employee" + i, "employee"+i+"@mail.com", 20, 30000);
            writer.write("Employee " + i + "\n");
            writer.write("-------------------" + "\n");
            writer.write("Employee Name: " + x.getName() + "\n");
            writer.write("Employee Email: " +x.getEmail() + "\n");
            writer.write("Employee Age: " +x.getAge() + "\n");
            writer.write("Employee Salary: " +x.getSalary() + "\n");
            writer.write("\n");
        }

        writer.close();
    }
}