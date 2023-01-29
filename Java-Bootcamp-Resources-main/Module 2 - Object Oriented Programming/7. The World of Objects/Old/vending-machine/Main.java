public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Movie[] movie = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA IMDB!              ");
        System.out.println("\t************************************************");

        for (int i = 0; i < movie.length; i++) {
            System.out.println(movie[i]);
        }
    }
}
