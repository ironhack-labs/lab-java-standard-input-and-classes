public class Employee {
    private String name;
    private String email;
    private int age;
    protected double salary;

    // Constructors

    public Employee() {

    }

    public Employee(String name, String email, int age, double salary) {
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            this.email = "The email must be valid";
        }
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Getters
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public int getAge() {
        return this.age;
    }
    public double getSalary() {
        return this.salary;
    }

}
