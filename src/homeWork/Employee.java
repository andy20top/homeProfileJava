package homeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static homeWork.Holidays.*;

public class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String position;
    private String phone;
    private int salary;
    private String birthDate;

    private Gender gender;


    public Employee(String firstName, String lastName, String position, String phone, int salary, String birthDate,
                    Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }




    @Override
    public String toString() {
        return String.format("Name - %s, Last name - %s, Position - %s, " +
                "Phone - %s, Salary - %d, Birthdate - %s", firstName, lastName, position, phone, salary, birthDate);
    }

    @Override
    public int compareTo(Employee otherEmployee) {
//        try {
//            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(this.birthDate);
//            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(otherEmployee.getBirthDate());
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
        return this.birthDate.compareTo(otherEmployee.getBirthDate());
    }

    
}
