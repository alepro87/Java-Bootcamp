import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(String name, String nationality, String dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        chooseSeat();
        this.passport = new String[3];
    }

    public Person(Person source) {
        this.name = source.name;
        this.dateOfBirth = source.dateOfBirth;
        this.nationality = source.nationality;
        chooseSeat();
        this.passport = new String[3];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport() {
        //passport = new String[]{this.name, this.nationality, this.dateOfBirth}; // Array that stores: {person.name, person.nationality, person.dateOfBirth}
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public void setPassport() {
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     *  Function name: applyPassport
     *  @return (boolean)
     *
     *  Inside the function:
     *     1. Returns a random boolean of true or false.
     */
    public boolean applyPassport() {
        int number = (int)(Math.random() * 2);  //random int that can be 0 or 1.

        return number == 1;
    }

    /**
     *  Function name: chooseSeat
     *
     *  Inside the function:
     *    1. Sets this.seat to a random number between 1 -- 11.
     */
    public void chooseSeat() {
        this.seatNumber = (int)(Math.random() * 11 + 1);
    }

    public String toString() {
        return ("\nName: " + this.name + "\n" + 
        "Nationality: " + this.nationality + "\n" + 
        "Date of Birth: " + this.dateOfBirth + "\n" +
        "Seat Number: " + this.seatNumber + "\n" + "Passport: " +
        Arrays.toString(this.passport) + "\n");     
    }
}
