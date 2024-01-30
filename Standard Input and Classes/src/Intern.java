public class Intern extends Employee {
    private final double MAX_SALARY = 20000;

    public Intern(String name, String email, int age, double salary){
        super(name,email,age,salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY){
            throw new IllegalArgumentException("Max Salary Exceed for intern "+MAX_SALARY);
        }
        else{
            super.setSalary(salary);
        }}
}
