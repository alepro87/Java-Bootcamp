import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Robert Anthony De Niro Jr", "American", "August 17, 1943");

        if (person.applyPassport()) {
            person.setPassport();
            System.out.println("\nCongratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("\nWe are sorry " + person.getName() + ". We cannot process your application.");
        }

        System.out.println(person);
    }
}
