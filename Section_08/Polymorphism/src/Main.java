import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Movie theMovie = new Adventure("Start Wars");
        // theMovie.watchMovie();

        // Movie theMovie = Movie.getMovie("Science", "Star Wars");
        // theMovie.watchMovie();
        // List list = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out
                    .print("Enter Type (A for Adventure, C for Comedy), " + "S for Science Fiction, or Q for quit): ");
            String type = s.nextLine();

            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie(); 
        }

        s.close();
    }
}