import java.util.*;
public class FindSumOfCube {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum=0;
		while(number>0) {
			int j= number%10;
			sum=sum+j*j*j;
			number = number/10;
		}
		System.out.println(sum);
		scanner.close();
	}

}
