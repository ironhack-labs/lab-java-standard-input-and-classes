class Intern extends Employee{
    private static final double MAX_SALARY = 20000;
    public Intern(String name, String email, int age, double salary){
        super(name, email, age, salary);
        validateSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
        validateSalary();
    }
    private void validateSalary(){
        if(getSalary() > MAX_SALARY){
            setSalary(MAX_SALARY);
        }
    }
}