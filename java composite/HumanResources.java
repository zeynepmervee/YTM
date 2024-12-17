import java.util.ArrayList;
import java.util.List;


// Composite
public class HumanResources implements Employee {
    private List<Employee> employeeList;
    private String deneme; //test

    public HumanResources(String deneme){
        this.deneme = deneme;
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    @Override
    public void showInfo() {
        System.out.println(deneme);
        for (Employee employee : employeeList) {
            employee.showInfo();
        }
    }
    
}
