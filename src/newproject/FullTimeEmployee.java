package newproject;

public class FullTimeEmployee  extends Employee {
    private double salary;

    public FullTimeEmployee(String name, String employeeID, int age, String workingRole, double salary) {
        super(name, employeeID, age, workingRole);
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Full-Time Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Age: " + age);
        System.out.println("Working Role: " + workingRole);
        System.out.println("Salary: ₹" + salary);
    }
 
}

