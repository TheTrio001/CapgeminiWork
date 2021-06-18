
public class PlayString {

	public static void main(String[] args) {
		char [] check  = new char[] {'h','e','l','l','o'};
		String str = new String("hello");
		String str2 = "hello";

		if(str==str2)
			System.out.println("both strings are equal");
		if(check.equals(str))
			System.out.println("charr and string both are equal");
		if(str.equals(str2))
			System.out.println("both strings are same");

	}

}
