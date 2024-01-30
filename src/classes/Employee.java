package classes;

public class Employee {
    private String name;
    private String email;
    private int age;
    private int salary;

    protected Employee(){

    }
    /*public Employee(String name, String email, int age, int salary) {
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }*/
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return this.age;
    }
    public int getSalary(){
        return this.salary;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected void setEmail(String email){
        this.email = email;
    }
    protected void setAge(int age){
        this.age = age;
    }
    protected void setSalary(int salary){
        this.salary = salary;
    }
}

