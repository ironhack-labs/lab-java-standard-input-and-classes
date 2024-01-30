public class Intern extends Employee{
    private static final double salaryLimit = 20000;

    public Intern(String name, String email, int age, int salary){
        super(name, email, age, salary);
        validateSalary();
    }

    private void validateSalary(){
        if(getSalary() > salaryLimit){
            setSalary(salaryLimit);
            System.out.println("Intern salary cannot exceed 20000, Setting salary to 20000");
        }
    }
}
