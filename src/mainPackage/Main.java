package mainPackage;
import classes.Intern;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        FileWriter writer = new FileWriter("demo.txt", true);
        String[] listadoNombres = {"Xavi","Jose","Lucia","Marta","Thais","Carlos","Alejandro","Neus","Antonio"," Lidia","Daniel","Carolina","Victor","Monica","Ricardo","Laura","Amanda","Aitor","Belen","Francisco"};
        String[] listadoDominios = {"@email.com","@gmail.com","@outlook.es","@hotmail.com","@yopmail.com"};
        Intern[] empleado = new Intern[10];
        String name;
        String email;
        int age;
        int salary;

        for (int i=0; i<=9;i++) {
            name = listadoNombres[rand.nextInt(listadoNombres.length)];
            email = name+listadoDominios[rand.nextInt(listadoDominios.length)];
            age = rand.nextInt(100);
            salary = rand.nextInt(30000);

            empleado[i] = new Intern(name,email,age,salary);

            if(empleado[i].getName()==null){
                i--;
            }else{
                writer.write("Empleado número "+(i+1)+": "+empleado[i].getName()+" "+empleado[i].getEmail()+" "+empleado[i].getAge()+" "+empleado[i].getSalary()+" \n");
            }
        }
        writer.close();
    }
}
