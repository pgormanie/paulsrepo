package MentorWork;

public class FullNameClass {

    public static String fullNameMethod(String firstname, String secondname) {
        return (firstname + secondname);
    }

    public static void main(String[] args) {

        String firstname = "Paul";
        String secondname = "Gorman";

        FullNameClass whatsMyName = new FullNameClass();
        String result = whatsMyName.fullNameMethod(firstname, secondname);
        System.out.println(result);
        System.out.println("My full name is " + firstname + " " + secondname);

    }

}