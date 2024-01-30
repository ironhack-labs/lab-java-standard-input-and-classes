public class Employee {

    private String name;
    private String email;
    private int age;
    private double salary;

    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary < 0 ? 0 : salary;
    }

    public Employee(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
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
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
