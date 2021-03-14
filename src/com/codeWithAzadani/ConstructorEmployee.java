package com.codeWithAzadani;

public class ConstructorEmployee {	
	
	public int id; 
	public String name; String position; String employer; String Location;
    public double salary;
    
	// Constructors
	public ConstructorEmployee () {
	} 
	public ConstructorEmployee(int employeID, String employeeName, String employeePosition, 
			double employeeSalary, String employerName, String employerLocation) {
		id = employeID; 
		name = employeeName; 
		position = employeePosition;
		salary = employeeSalary;
		employer = employerName; 
		Location = employerLocation; 
	}
	// behaviors of Employee are shown in methods
	public String responsiblities () {
		return "Overseeing daily business operations.";
	} 
	public String responsiblities1 () {
		return "Developing and implementing growth strategies.";
	} 
	public String responsiblities2 () {
		return "GTraining low-level managers and staff.";
	} 
	public String responsiblities3 () {
		return "Creating and managing budgets.";
	} 
	public String responsiblities4 () {
		return "Improving revenue and Hiring employees.";
	} 
	public String responsiblities5 () {
		return "Evaluating performance and productivity and Analyzing accounting and financial data.";
	} 
	public static void main(String[] args) {
		ConstructorEmployee employee = new ConstructorEmployee (102, "M Sabour Azadani", "General Manager",
				65_098.98, "THV Inc.", "Frederiskburg VA");
		System.out.println(" Employee & Employer Information");
		System.out.println(" _______________________________");
		
		System.out.println(" Employee ID: "+ employee.id + 
							"\n Employee Name: "+ employee.name + 
							"\n Employee Position: "+ employee.position +
							"\n Employer Salary: "+ "$"+ employee.salary + " US Dollars" +
							"\n Employer Name: "+ employee.employer +
							"\n Employer Location: "+ employee.Location);
		
		System.out.println("\n\n Employee Responsiblities & Duties");
		System.out.println(" _____________________________________");
		
		System.out.println(" 1. "+ employee.responsiblities() + "\n 2. "+ employee.responsiblities1()
		+ "\n 3. "+ employee.responsiblities2() + "\n 4. "+ employee.responsiblities3()
		+ "\n 5. "+ employee.responsiblities4());
	}
}
