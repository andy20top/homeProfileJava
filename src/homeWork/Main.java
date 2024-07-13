package homeWork;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        List<Employee> employeeList = new ArrayList<>();



        employeeList.add(new Employee("Andy", "Famil", "developer", "8-999-999-99-99",
                50000, "2000-10-22"));
        employeeList.add(new Employee("Kesha", "Port", "developer", "8-999-999-99-99",
                60000, "1996-11-22"));
        employeeList.add(new Employee("super", "test", "admin", "8-999-999-99-99",
                45000, "1997-11-23"));
        employeeList.add(new Manager("testing", "extend", "manager", "8-999-999-99-99",
                100000, "1997-12-23"));

        Collections.sort(employeeList);

        Manager.increaser(employeeList);

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }





    }



}