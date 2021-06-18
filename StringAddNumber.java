import java.util.*;

public class StringAddNumber
{
	public static void main(String[] args) {
	    int n;
	    int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter interger values with a space");
		String str = scanner.nextLine();
		StringTokenizer sr = new StringTokenizer(str," ");
		while(sr.hasMoreTokens()){
		    String each_integer = sr.nextToken();
		    n = Integer.parseInt(each_integer);
		    System.out.println(n);
		    sum = sum+n;
		}
		System.out.println(sum);
		scanner.close();
	}
}