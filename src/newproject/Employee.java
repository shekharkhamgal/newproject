package newproject;

public abstract class Employee {
	
	 protected String name;
	    protected String employeeID;
	    protected int age;
	    protected String workingRole;

	    public Employee(String name, String employeeID, int age, String workingRole) {
	        this.name = name;
	        this.employeeID = employeeID;
	        this.age = age;
	        this.workingRole = workingRole;
	    }

   
	    public abstract void displayDetails();
	}
	

