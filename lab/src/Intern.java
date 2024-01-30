public class Intern extends Employee{

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        validateMaxSalary();
    }

    private void validateMaxSalary(){
        if(getSalary()>MAX_SALARY)
            setSalary(MAX_SALARY);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
        validateMaxSalary();
    }

    private static final double MAX_SALARY = 20000;
}
