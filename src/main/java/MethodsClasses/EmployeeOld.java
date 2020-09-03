package MethodsClasses;

public class EmployeeOld {

    private String firstname;
    private String secondname;
    private String jobtitle;
    private double yearsofservice;

    public EmployeeOld(String firstname, String secondname, String jobtitle, double yearsofservice) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.jobtitle = jobtitle;
        this.yearsofservice = yearsofservice;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getYearsofservice() {
        return yearsofservice;
    }

    public void setYearsofservice(double yearsofservice) {
        this.yearsofservice = yearsofservice;
    }
}
