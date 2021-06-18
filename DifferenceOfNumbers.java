import java.util.*;
public class DifferenceOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = scanner.nextInt();
		FindDifference(num);
		
		scanner.close();
	}
	
	public static void FindDifference(int num){
		int sum=0;
		int sum_Square = 0;
		int diff = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + i*i;
			sum_Square = sum_Square + i;
		}
		sum_Square = sum_Square * sum_Square;
		diff = sum - sum_Square;
		System.out.println("Difference is :"+diff);
	}
}
