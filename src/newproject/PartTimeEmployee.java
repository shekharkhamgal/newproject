package newproject;

public class PartTimeEmployee  extends Employee {
    private String workingHours;
    private String inTime;
    private String outTime;

    public PartTimeEmployee(String name, String employeeID, int age, String workingRole, String workingHours, String inTime, String outTime) {
        super(name, employeeID, age, workingRole);
        this.workingHours = workingHours;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Part-Time Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Age: " + age);
        System.out.println("Working Role: " + workingRole);
        System.out.println("Working Hours per Day: " + workingHours);
        System.out.println("In Time: " + inTime);
        System.out.println("Out Time: " + outTime);
    }
}


