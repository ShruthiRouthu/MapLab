package maplab;
import java.util.Comparator;

/**
 *
 * @author Shruthi Routhu
 */
public class EmployeeByLastName  implements Comparator<Employee> {
    
     public int compare(Employee e1, Employee e2) {
        return e1.getLastName().compareTo(e2.getLastName());
    }
    
}

