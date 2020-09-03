package MentorWork;

import java.util.ArrayList;

public class EmployeeOldMain {

    public static void main(String[] args) {

        EmployeeOld employeePaul = new EmployeeOld("Paul", "Gorman", "Newbie Dev Engineer", 18.5);
//        System.out.println(employeePaul.getFirstname() + " " + employeePaul.getSecondname());
//        System.out.println(employeePaul.getJobtitle());
//        System.out.println(employeePaul.getYearsofservice() + " Years");

        EmployeeOld employeeDan = new EmployeeOld("Dan", "O'Brien", "Dev Engineer", 10);
        EmployeeOld employeeRonan = new EmployeeOld("Ronan", "O'Rafferty", "Dev Boss", 15);

        ArrayList<EmployeeOld> employeeArrayList = new ArrayList<EmployeeOld>();
        employeeArrayList.add(employeePaul);
        employeeArrayList.add(employeeDan);
        employeeArrayList.add(employeeRonan);

        for(int i = 0; i < employeeArrayList.size(); i++){
            System.out.println(employeeArrayList.get(i).getFirstname() + " " + employeeArrayList.get(i).getSecondname());
        }

        System.out.println();
    }



}
