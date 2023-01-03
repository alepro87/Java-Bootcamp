public class Airline {
    private Person[] people;

    public Airline() {
        this.people = new Person[11];
    }
    
    public Person getPerson(int index) {
        return new Person(people[index]);
    }

    /** Setter name: setPerson
     * @param person (Person)
     * 
     * Inside the setter:
     * 
     *   1. Index the array, and set that element equal to the Person object. 
     */
    public void setPerson(Person person) {
        int index = person.getSeatNumber() - 1;
        this.people[index] = new Person(person);
    }

    public void createReservation(Person person) {
        int index = person.getSeatNumber() - 1; 
        
        while (people[index] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
            index = person.getSeatNumber() - 1;
        }

        people[index] = new Person(person); 
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }
}
