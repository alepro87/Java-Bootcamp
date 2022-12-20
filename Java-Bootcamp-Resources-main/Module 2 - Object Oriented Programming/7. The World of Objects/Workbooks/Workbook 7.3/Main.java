import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Robert Anthony De Niro Jr", "American", "August 17, 1943", 17);

        // person.name = "Robert Anthony De Niro Jr"; // a String
        // person.nationality = "American"; // a String
        // person.dateOfBirth = "August 17, 1943"; // a String
        // person.passport = new String[]{person.name, person.nationality, person.dateOfBirth}; // Array that stores: {person.name, person.nationality, person.dateOfBirth}
        // person.seatNumber = 17;// an Integer
        
        // Updating the seat number
        person.setSeatNumber(10);

        System.err.println("Object with constructor, getters and setters:");
        System.out.println(person.getName());
        System.out.println(person.getNationality());
        System.out.println(person.getDateOfBirth());
        // System.out.println(Arrays.toString(person.passport));
        System.out.println(person.getSeatNumber());
    }
}
