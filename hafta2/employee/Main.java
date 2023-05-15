import hafta1.Employee;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee employee =new Employee(" kemal",2000,45,1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        System.out.println(employee.toString());
    }
}
