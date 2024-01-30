public class Intern extends Employee {
    private static final double SALARY_LIMIT = 20000.0;

    // Constructor
    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
    }

    // Conditions on salary limit
    public void setSalary(double salary) {
        if (salary <= SALARY_LIMIT) {
            // If salary is less than the limit, pass it
            super.setSalary(salary);
        } else {
            // If salary exceeds the limit, make it the limit
            super.setSalary(SALARY_LIMIT);
            System.out.println("Salary cannot exceed the limit of " + SALARY_LIMIT + " €.");
        }
    }
}
