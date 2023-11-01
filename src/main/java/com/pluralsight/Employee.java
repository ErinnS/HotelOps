package com.pluralsight;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchIn;
    private double punchOut;

    public double getTotalPay() {
        double totalPay = hoursWorked * payRate;
        return totalPay;
    }
    public double getRegularHours() {
        return this.hoursWorked;
    }
    public double getOvertimeHours() {
        double overtimeHours = hoursWorked - 40;
        return overtimeHours;
    }
    public double punchTimeCard(){
      double timeCard = punchIn + punchOut;
      return timeCard;
    }
    public double getPunchIn(double time) {
        return this.punchIn;

    }
    public double getPunchOut(double time) {
        return this.punchOut;
    }


}
