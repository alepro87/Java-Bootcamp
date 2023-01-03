import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] spareParts;

    public Car(String make, double price, int year, String color, String[] spareParts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }

    //Standart Constructor
    public Car(String make, double price, int year, String color){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    //Copy constructor
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.spareParts = Arrays.copyOf(source.spareParts, source.spareParts.length);
    }
    
    /*
     * Getters and Setters for all the variables in the class.
     */
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getSpareParts() {
        return Arrays.copyOf(this.spareParts, this.spareParts.length);
    }

    public void setSpareParts(String[] spareParts) {
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }

    public void drive() {
        System.out.println("\nYou bought the bautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.");
    }

    public String toString() {
        return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(spareParts) + ".\n";
    }
}
