import java.util.*;
public class SumNaturalNumbers {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter upto which you want to add");
		int num = scanner.nextInt();
		SumNumbers(num);
		scanner.close();
		
	}
	public static void SumNumbers(int num) {
		int sum = 0;
		for(int i=0;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				sum = sum + i;
			}
			else
				continue;
		}
		System.out.println("sum is :"+sum);
	}

}
