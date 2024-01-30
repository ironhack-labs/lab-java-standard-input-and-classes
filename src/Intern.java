class Intern extends Employee {
    public static final double MAX_SALARY = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("El salario máximo para un becario es de " + MAX_SALARY + "€");
        } else {
            super.setSalary(salary);
        }
    }
}