package JavaExercises.EmployeeExercises;

public class Employee {

    private String name;
    private int workId;
    private int age;

    Employee(String name, int workId, int age) {
        this.name = name;
        this.workId = workId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}