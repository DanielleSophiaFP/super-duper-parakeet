import java.util.Date;
import java.text.SimpleDateFormat;

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Placeholder login method, as called by Employee
    public void login() {
        System.out.println("Employee " + employeeID + " logged in.");
    }

    public String viewEmployeeDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dobStr = (dateOfBirth != null) ? sdf.format(dateOfBirth) : "N/A";
        return "Employee ID: " + employeeID + "\nDate Of Birth: " + dobStr;
    }
}
