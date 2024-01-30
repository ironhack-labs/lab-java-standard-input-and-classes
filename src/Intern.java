class Intern extends Employee {
    public static final double MAX_SALARY = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Intern salary cannot exceed the maximum allowed value.");
        } else {
            super.setSalary(salary);
        }
    }
}