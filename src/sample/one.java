package sample;
import java.util.Scanner;
/**
 *
 * @author Rishabh
 */
public class one {


    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        int ch, a=0, b=0, sum=0, diff=0;
        do{
            System.out.println("1.to add");
            System.out.println("2 to subtract");
            System.out.println("3. to exit");
            System.out.print("Enter your choice: ");
            ch= n.nextInt();
            switch(ch){
                case 1: System.out.println("Enter two numbers: ");
                        a= n.nextInt();
                        b= n.nextInt();
                        sum= a+b;
                        System.out.printf("Sum= %d\n\n", sum);
                        break;
                case 2: System.out.println("Enter two numbers: ");
                        a= n.nextInt();
                        b= n.nextInt();
                        diff= a-b;
                        System.out.printf("Difference= %d\n\n", diff);
                        break;
                case 3: System.exit(0);
                    
                default: System.out.println("Enter valid choice");
            }
        }while(ch<4);
    }
}
