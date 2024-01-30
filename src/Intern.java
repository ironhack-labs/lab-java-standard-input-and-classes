public class Intern extends Employee {
    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, salary);
    }

    @Override
    public void setSalary(int salary) {
        final int MAX_SALARY_INTERN = 20000;

        if(salary > MAX_SALARY_INTERN) {
            System.out.println("Warning: Intern '" + this.getName() + "' salary exceeds the maximum allowed value. Salary set to 'MAX_SALARY_INTERN' = " + MAX_SALARY_INTERN);
            super.setSalary(MAX_SALARY_INTERN);
        } else {
            super.setSalary(salary);
        }
    }
}
