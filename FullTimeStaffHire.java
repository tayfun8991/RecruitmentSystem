public class FullTimeStaffHire extends StaffHire {
    private double salary;
    private int weeklyFractionalHours;

    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined, double salary, int weeklyFractionalHours) {

        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);

        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;
    }

    public double getSalary() { return salary; }

    public int getWeeklyFractionalHours() { return weeklyFractionalHours; }

    public void setSalary(double salary) {
        if (getJoined()) {
            this.salary = salary;
            System.out.println("Salary updated successfuly!");
        } else {
            System.out.println("Error: Staff not appointed yet. Cannot set salary.");
        }
    }

    public void setWeeklyFractionalHours(int hours){
        this.weeklyFractionalHours = hours;
    }

    @Override
    public void display() {
        super.display();
        if (getJoined()){
            System.out.println("Salary: £" + salary);
            System.out.println("Weekly Hours:" + weeklyFractionalHours);
        }

    }
}