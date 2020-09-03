package JavaExercises.EmployeeExercises;

import java.util.ArrayList;
import java.util.List;

public class JavaExerciseEmployees {

//    CREATE LIST
    public static void main(String[] args) {

        List<Employee> employeeListNew = new ArrayList<Employee>();  // Each employee will have a name, a workId and an age.
        employeeListNew.add(new Employee("Bono", 1234, 30));    // create new instance of Employee class, assign values and add to the Arraylist
        employeeListNew.add(new Employee("Edge", 2345, 40));
        employeeListNew.add(new Employee("Adam", 3456, 50));
        employeeListNew.add(new Employee("Larry", 4567, 60));
        employeeListNew.add(new Employee("Paul", 4563, 70));

        cycleThroughEmployees(employeeListNew);
    }

//    CREATE METHOD
    public static void cycleThroughEmployees(List<Employee> list) {  // Cycle through the list of employees passed into the cycleThroughEmployees method

        for (int i = 0; i < list.size(); i++) {     // Iterate list, output name and age and assign to variables u2Name and u2Age
            String u2Name = list.get(i).getName();
            int u2Age = list.get(i).getAge();
            if (isRetired(u2Age)) {
                System.out.println(u2Name + "'s age is " + u2Age + " is already retired");
            } else {
                int yearsToRetirement = calcYearsToRetirement(list.get(i).getAge());
                System.out.println(u2Name + "'s age is " + u2Age + " and will retire in " + yearsToRetirement + " years.");
            }
        }

    }

//    CREATE METHOD
    public static int calcYearsToRetirement(int age) {     // Method to calculate retirement age using cycleThroughEmployees method above

        int yearsToRetirement = 65 - age;
        return yearsToRetirement;
    }

//    CREATE METHOD
    public static boolean isRetired(int age) {

        if (age >= 65) {
            return true;
        } else {
            return false;
        }
    }


    public static void isRetired(List<Employee> list) {     // Method to calculate retirement age using cycleThroughEmployees method above
        int getU2Age = cycleThroughEmployees(calcYearsToRetirement(u2Age));   // Access u2Age from above method
        int isRetiredCalc = 65 - getU2Age;     // Calculate how long until retirement age
        System.out.println(u2Name + "'s age is " + u2Age + " and will retire in " + isRetiredCalc + " years.");
    }

}

/*
Write a method named cycleThroughEmployees. This will take in a List of employees.
You will need to make a new employee class to facilitate this.
Each employee will have a name, a workId and an age.
Cycle through the list of employees passed into the cycleThroughEmployees method
Print out how many years it will take until the employee is retired.
This will be calculated in another method called isRetired
*/