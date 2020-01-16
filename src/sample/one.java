package sample;
import java.util.Scanner;
/**
 *
 * @author Rishabh
 */
public class one {


    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        String movie = null;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a movie: ");
            movie= n.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(movie);
            
        }
    }

}
