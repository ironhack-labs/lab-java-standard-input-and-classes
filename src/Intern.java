public class Intern extends Employee {

    private static final double SALARY_LIMIT = 20000.00;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > SALARY_LIMIT) {
            super.setSalary(SALARY_LIMIT);
            // this.salary = SALARY_LIMIT;
            System.out.println("The salary limit for the intern " + super.getName() + " exceeds the limit, so that salary has been set to " + SALARY_LIMIT);
        } else {
            super.setSalary(salary);
            // this.salary = salary;
        }
        System.out.println("The salary set from the INTERN class was: " + super.getSalary());
    }
}