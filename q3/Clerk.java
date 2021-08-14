package src.p6.q3;

public class Clerk extends Employee{
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate;
    public Clerk(String name, int yearJoined, double basicSalary,
                 double allowance, int overtimeHours, double overtimeRate) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public static double getOvertimeRate() {
        return overtimeRate;
    }

    public static void setOvertimeRate(double overtimeRate) {
        Clerk.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary() + this.allowance + (this.overtimeHours*Clerk.overtimeRate);
    }
    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee)obj;
        return emp.getName() == this.getName();
    }
}
