public class Employee {

    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        Salary = salary;
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

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    private String name;
    private String email;
    private int age;
    private double Salary;
}
