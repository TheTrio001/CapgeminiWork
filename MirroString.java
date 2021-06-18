import java.util.*;

public class MirroString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String result;
		result = getImage(string);
		System.out.println(result);
	}
	private static String getImage(String string){
	    StringBuffer s=new StringBuffer(string);
	    String temp = string;
	    s.reverse();
	    return(temp+"|"+s);
	}
}