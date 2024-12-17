public class Main {
    public static void main(String[] args) {
        HumanResources hrDesigner = new HumanResources("hr designer"); //composite node
        Employee designer1 = new Designer(1, "designer1");
        Employee designer2 = new Designer(2, "designer2");
        hrDesigner.addEmployee(designer1);
        hrDesigner.addEmployee(designer2);

        HumanResources hrDeveloper = new HumanResources("hr developer"); // composite node
        Employee developer1 = new Developer(3, "developer1");
        Employee developer2 = new Developer(4, "developer2");

        hrDeveloper.addEmployee(developer1);
        hrDeveloper.addEmployee(developer2);

        Employee manager = new Manager(5, "manager"); // leaf node

        HumanResources humanResources = new HumanResources("hr main"); // composite
        humanResources.addEmployee(hrDeveloper);
        humanResources.addEmployee(hrDesigner);
        humanResources.addEmployee(manager);

        humanResources.showInfo();


    }
}