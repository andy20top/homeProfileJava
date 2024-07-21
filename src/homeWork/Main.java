package homeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Andy", "Famil", "developer", "8-999-999-99-99",
                50000, "2000-10-22", Gender.MALE));
        employeeList.add(new Employee("Kesha", "Port", "developer", "8-999-999-99-99",
                60000, "1996-11-22", Gender.FEMALE));
        employeeList.add(new Employee("super", "test", "admin", "8-999-999-99-99",
                45000, "1997-11-23", Gender.MALE));
        employeeList.add(new Manager("testing", "extend", "manager", "8-999-999-99-99",
                100000, "1997-12-23", Gender.MALE));

        Collections.sort(employeeList);

        Manager.increaser(employeeList);

//        for (Employee emp : employeeList) {
//            System.out.println(emp.getFirstName() + " - " + emp.getGender());
//        }

        congratulation(employeeList);

    }

    public static void congratulation(List<Employee> employeeList ) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM");
        String todayDay = sdf.format(new Date(2024, 2, 8));
        for (Employee emp : employeeList) {
            if (todayDay.equals(Holidays.NEW_YEAR.getDate())) {
                System.out.println(emp.getFirstName() + " happy New Year!");
            } else if (todayDay.equals(Holidays.FEBRUARY_23.getDate()) && emp.getGender() == Gender.MALE) {
                System.out.println(emp.getFirstName() + " happy February 23rd!");
            } else if (todayDay.equals(Holidays.MARCH_8.getDate()) && emp.getGender() == Gender.FEMALE) {
                System.out.println(emp.getFirstName() + " happy March 8rd!");
            } else {
                System.out.println(emp.getFirstName() + " good job!");
            }
        }
    }

}