import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Robert Anthony De Niro Jr", "American", "August 17, 1943", 17);

        Person person2 = new Person(person);
        person2.setName("Jason De Niro");
        person2.setSeatNumber(3);

        // person.name = "Robert Anthony De Niro Jr"; // a String
        // person.nationality = "American"; // a String
        // person.dateOfBirth = "August 17, 1943"; // a String
        // person.passport = new String[]{person.name, person.nationality, person.dateOfBirth}; // Array that stores: {person.name, person.nationality, person.dateOfBirth}
        // person.seatNumber = 17;// an Integer
        
        // Updating the seat number
        person.setSeatNumber(10);

        System.out.println("Object with constructor, getters and setters:");
        System.out.println(person.getName());
        System.out.println(person.getNationality());
        System.out.println(person.getDateOfBirth());
        System.out.println(Arrays.toString(person.getPassport()));
        System.out.println(person.getSeatNumber());

        System.out.println("Person 2");
        System.out.println(person2.getName());
        System.out.println(person2.getNationality());
        System.out.println(person2.getDateOfBirth());
        System.out.println(Arrays.toString(person2.getPassport()));
        System.out.println(person2.getSeatNumber());
    }
}
