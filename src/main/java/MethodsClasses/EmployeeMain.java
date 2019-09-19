package MethodsClasses;

import java.util.ArrayList;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employeePaul = new Employee("Paul", "Gorman", "Newbie Dev Engineer", 18.5);
//        System.out.println(employeePaul.getFirstname() + " " + employeePaul.getSecondname());
//        System.out.println(employeePaul.getJobtitle());
//        System.out.println(employeePaul.getYearsofservice() + " Years");

        Employee employeeDan = new Employee("Dan", "O'Brien", "Dev Engineer", 10);
        Employee employeeRonan = new Employee("Ronan", "O'Rafferty", "Dev Boss", 15);

        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        employeeArrayList.add(employeePaul);
        employeeArrayList.add(employeeDan);
        employeeArrayList.add(employeeRonan);

        for(int i = 0; i < employeeArrayList.size(); i++){
            System.out.println(employeeArrayList.get(i).getFirstname() + " " + employeeArrayList.get(i).getSecondname());
        }
    }



}
