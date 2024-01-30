public class Employee {

    private String name;
    private String email;
    private int age;
    private double salary;
    public Employee(String name, String email, int age, double salary){
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


}
