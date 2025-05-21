import java.util.Date;

public class Account {
    private String employeeID;
    private Date dateOfBirth;
    
    public Account(String employeeID, Date dateOfBirth) {
        this.employeeID = employeeID;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getEmployeeID() {
        return employeeID;
    }
    
    public String viewEmployeeDetails() {
        return "Employee ID: " + employeeID + "\nDate Of Birth: " + dateOfBirth;
    }
}
