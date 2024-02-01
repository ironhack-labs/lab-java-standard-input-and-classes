class Intern extends Employee {
    private static final double MAX_SALARY = 20000;

    //Constructor
    public Intern(String name, String email, int age, double salary) {
        super.setName(name);
        super.setEmail(email);
        super.setAge(age);
        if (salary <= MAX_SALARY) {
            super.setSalary(salary);
        } else {
            double newSalary = Math.min(salary, MAX_SALARY);
            setSalary(newSalary);
        }
    }






}
