class Employee {
    String name;
    String department;
    int employeeId;
    String designation;
    double salary;

    // Method to calculate bonus (non-static)
    public void calculateBonus(double salary, double percentage) {
        double bonus = (salary * percentage) / 100;
        System.out.println("Calculated Bonus: " + bonus);
    }

    // Method to display employee details (non-static)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary:" + salary);
    }

    public static void main(String[] args) {
        // Creating three Employee objects
        Employee E1 = new Employee();
        
        // Initializing the details for Employee E1
        E1.name = "Ankush Verma";
        E1.department = "Sales";
        E1.employeeId = 1567;  // Corrected Employee ID (without leading zero)
        E1.designation = "Salesman";
        E1.salary = 90000.00;

        // Displaying the details of E1
        E1.displayDetails();
        
        // Calculating bonus for E1 (10% bonus)
        E1.calculateBonus(E1.salary, 10.0);

		System.out.println();

        // Repeat the same for more employees (E2, E3, etc.)
        Employee E2 = new Employee();
        E2.name = "ekant";
        E2.department = "HR";
        E2.employeeId = 1568;
        E2.designation = "HR Manager";
        E2.salary = 45000.00;
        
        E2.displayDetails();
        E2.calculateBonus(E2.salary, 15.0);

		System.out.println();
        
        Employee E3 = new Employee();
        E3.name = "krishna";
        E3.department = "IT";
        E3.employeeId = 1569;
        E3.designation = "Software Engineer";
        E3.salary = 60000.00;
        
        E3.displayDetails();
        E3.calculateBonus(E3.salary, 20.0);
    }
}
