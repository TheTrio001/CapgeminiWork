	
import java.util.Scanner;
 
public class PrimeUptoNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    	
 
        System.out.println("Enter max number: ");
 
        int maxNumber = scanner.nextInt();
 
        System.out.println("List of the prime number between 1 - " + maxNumber);
 
        for (int num = 2; num <= maxNumber; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(num);
        }
        scanner.close();
    }
}