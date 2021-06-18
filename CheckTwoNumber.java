import java.util.Scanner;

public class CheckTwoNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
		boolean check = CheckNumber(num);
		if(check)
			System.out.println("Yes the given number is Power of two");
		else
			System.out.println("No the number is not Power of two");
        scanner.close();
	}
	
	public static boolean CheckNumber(int num) 
		{
		   
		return num!=0 && ((num&(num-1)) == 0);
		}

}
