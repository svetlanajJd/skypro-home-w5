package pro.sky.skyprohomew5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    private static final int index = 10;
    private final List<Employee> contacts = new ArrayList<>();
    private int i;


    public Employee addEmployee(String firstName, String lastName) {

        Employee employee = new Employee(firstName, lastName);

        if (contacts.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        if (contacts.size() < index) {
            contacts.add(employee);
            return employee;
        }
        throw new EmployeeStoragelsFullException();
    }

    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (contacts.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException();
    }


    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (contacts.contains(employee)) {
            contacts.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    public List printTotal() {
        return new ArrayList<>(contacts);
    }

}