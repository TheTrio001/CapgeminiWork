import java.util.*;
public class IsIncreasing {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
		boolean check = CheckIsIncreasing(num);
		if(check)
			System.out.println("Yes the given number is increasing");
		else
			System.out.println("No the number is not increasing");
        scanner.close();
	}
	
	public static boolean CheckIsIncreasing(int input)
	{

	    int lastSeen = 10; 
	    int current;

	    while (input > 0) {
	        current = input % 10;
	        if (lastSeen < current)
	            return false;
	        lastSeen = current;
	        input /= 10;
	    }
	    return true;
	}

}
