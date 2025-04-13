public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType,
    String staffName, String joiningDate, String qualification,
    String appointedBy, boolean joined, int workingHour,
    double wagesPerHour, String shifts) {
        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.terminated = false;

    }

    public void setShifts(String newShift) {
        if (getJoined()) {
            this.shifts = newShift;
            System.out.println("Shift updated to:" + newShift);
        } else {
            System.out.println("Error: Staff not appointed yet.");
        }
    }

    public void terminateStaff() {
        if (terminated) {
            System.out.println("Error: Staff already terminated.");
        } else {
            super.setStaffName("");
            super.setJoiningDate("");
            super.setQualification("");
            super.setAppointedBy("");
            super.setJoined(false);
            terminated = true;
            System.out.println("Staff terminated successfully.");
        }
    }

    @Override
    public void display() {
        super.display();
        if(getJoined() && !terminated) {
            System.out.println("Working Hours:" + workingHour + "hrs/day");
            System.out.println("Wages Per Hour: £" + wagesPerHour);
            System.out.println("Shift: " + shifts);
            System.out.println("Daily Income: £" + (workingHour * wagesPerHour));
        } else if (terminated) {
            System.out.println("Status: TERMINATED");
        }
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public double getWagesPerHour() {
        return wagesPerHour;
    }

    public String getShifts() {
        return shifts;
    }

    // PartTimeStaffHire.java'ya ekleyin
    public boolean isTerminated() {
        return terminated;
    }
}

