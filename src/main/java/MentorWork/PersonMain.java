package MentorWork;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("Paul", 47, "Struggling Artist");
        System.out.println(person.getName());
        person.setName("The Edge");
        System.out.println(person.getName());

    }
}

