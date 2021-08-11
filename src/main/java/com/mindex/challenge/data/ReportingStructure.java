package com.mindex.challenge.data;

public class ReportingStructure {

    /*
     * Here are the new properties for the employee and the number of reports that employee has
     */
    private String employee;
    private int NumberOfReports;

    public ReportingStructure(){

    }
    /*
     * below are the getters and setters for the two properties of employee
     * and NumberOfReports
     */
    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getNumberOfReports() {
        return NumberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
        NumberOfReports = numberOfReports;
    }
}
