package homeWork;

import java.util.List;

public class Manager extends Employee {
    public Manager(String firstName, String lastName, String position, String phone, int salary, String birthDate, Gender gender) {
        super(firstName, lastName, position, phone, salary, birthDate, gender);
    }


    public static void increaser(List<Employee> emp) {
        for (int i = 0; i < emp.size(); i++) {
            if (!(emp.get(i) instanceof Manager)) {
                emp.get(i).increaseSalary(5000);
            }
        }
    }

}
