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
    }

    public Person(String name, String nationality, String dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        chooseSeat();
    }

    public Person(Person source) {
        this.name = source.name;
        this.dateOfBirth = source.dateOfBirth;
        this.nationality = source.nationality;
        chooseSeat();
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
        passport = new String[]{this.name, this.nationality, this.dateOfBirth}; // Array that stores: {person.name, person.nationality, person.dateOfBirth}
        return this.passport;
    }

    // public void setPassport(String[] passport) {
    //     this.passport = passport;
    // }

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
    public boolean applyPassort() {
        int number = (int)(Math.random() * 2);  //random int that can be 0 or 1.
        
        if (number == 1) {
            return true;
        } 

        return false;
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
}
