public class Main {
    public static void main(String[] args) {
        Person person = new Person("Robert Anthony De Niro Jr", "American", "August 17, 1943");

        System.out.println(person.getName());
        System.out.println(person.getNationality());
        System.out.println(person.getDateOfBirth());
        System.out.println(person.getSeatNumber());

        if (person.applyPassort()) {
            System.out.println("\nCongratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("\nWe are sorry " + person.getName() + ". We cannot process your application.");
        }
    }
}
