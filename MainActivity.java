import java.util.Scanner;

/**
 * MainActivity
 */
public class MainActivity {
    public static void main(String[] args) {
        int user_dv;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Number : ");
        user_dv = scanner.nextInt();

        ChainOFResponsibility responsibility = new ChainOFResponsibility(user_dv);
        responsibility.find(new FindArmStrong(user_dv));
        responsibility.find(new FindPrime(user_dv));

     
        scanner.close();
    }
    
}