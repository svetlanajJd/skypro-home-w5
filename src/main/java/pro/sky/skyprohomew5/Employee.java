package pro.sky.skyprohomew5;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }


    public boolean equals(Object other) {
        Employee employee = (Employee) other;
        boolean result;
        result = firstName.equals(employee.firstName) &
                lastName.equals(employee.lastName);
        System.out.println(result);
        return result;
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

