package classes;
public class Intern extends Employee{
    private static int salaryLimit = 20000;

    public Intern(String name, String email, int age, int salary){
        if(setSalaryWithLimit(salary)){
            setName(name);
            setEmail(email);
            setAge(age);
        }
    }

   public boolean setSalaryWithLimit(int salary){
        if (salary<this.salaryLimit){
            this.setSalary(salary);
            return true;
        }else {
            return false;
        }
    }
}