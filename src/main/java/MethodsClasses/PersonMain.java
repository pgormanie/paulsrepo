package MethodsClasses;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("Paul", 46, "Newbie Dev");
        System.out.println(person.getName());
        person.setName("The Edge");
        System.out.println(person.getName());

    }
}

