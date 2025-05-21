import java.util.List;

public class Employee {
    //Attributes
    private String employeeID;
    private String name;
    private String department;
    private String phoneNumber;
    private String shift;
    private String address;
    
    //References to other classes
    private Account account;
    private Salary salary;
    private List<Attendance> attendance;
    
    public Employee(String employeeID, String name, String department, String phoneNumber, String shift, String address, Account account, Salary salary, List<Attendance> attendance) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.shift = shift;
        this.address = address;
        this.account = account;
        this.salary = salary;
        this.attendance = attendance;
    }
    
    //Getters and Setters
    public Account getAccount() {
        return account;
    }
    
    public void setAccount(Account account) {
            this.account = account;
    }
    
    public Salary getSalary() {
        return Salary;
    }
    
    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    
    public void setAttendanceRecords(List<Attendance> attendance) {
        this.attendance = attendance;
    }
    
    public String getEmployeeID() {
        return employeeID;
    } 
    
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getShift() {
        return shift;
    }
    
    public void setShift(String shift) {
        this.shift = shift;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    //Methods    
    public void login() {
        if (account != null) {
            account.login();
        } else {
            System.out.println("No account linked to employee.");
        }
    }
    
    public String viewSalary() {
        if (salary != null) {
            return salary.getSalary();
        } else {
            return "No salary information available.";
        }
    }
    
    public String viewAttendance() {
        if (attendance != null && !attendance.isEmpty()) {
            StringBuilder sb = new StringBuilder("Attendance Records:\n");
            for (Attendance record : attendance) {
                sb.append(record.keepRecords()).append("\n");
            }
            return sb.toString();
        } else {
            return "No attendance records available.";
    } 
}
    
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Shift: " + shift);
        System.out.println("Address: " + address);
    }
}    