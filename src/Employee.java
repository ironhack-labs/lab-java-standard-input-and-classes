public class Employee {
    private String name;
    private String email;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        setName(name);
        setEmail();
        setAge(age);
        setSalary(salary);
    }
    //setters:
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(){
        this.email = this.name.toLowerCase() + "@company.com";
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    //getters:
    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
}
