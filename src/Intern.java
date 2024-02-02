public class Intern extends Employee {

    private static final double SALARY_LIMIT = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > SALARY_LIMIT) {
            System.out.printf("The maximum salary for an intern is %f%n", SALARY_LIMIT);
            super.setSalary(SALARY_LIMIT);
        } else {
            super.setSalary(salary);
        }
    }

}
