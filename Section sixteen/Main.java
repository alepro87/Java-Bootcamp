/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"});

        Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] {"Tires", "Keys"});

        //Creating a car using copy constructor and updating some fields.
        Car nissan2 = new Car(nissan);
        nissan2.setColor("Yellow");
        nissan2.setPrice(9000);
        nissan2.setYear(2019);

        nissan2.drive();
    }
}