import java.util.*;
public class StringChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int n = FindNumberOfWords(str);
		System.out.println("Total Word Count Is:"+n);
		ChangeString(str,n);
		scanner.close();
		
		

	}
	
	public static int FindNumberOfWords(String str) {
		int wordCount = 0;
        for(int i = 0; i < str.length()-1; i++) {  
            if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }  
        wordCount++;
		
		return wordCount;
	}
	
	public static void ChangeString(String str,int n) {
		int m = n/2;
		int i=0;
		String str2 = new String();
		StringTokenizer sr = new StringTokenizer(str);
		while(sr.hasMoreTokens() && i<=n ){
			if(i<=m) {
				String each_string = sr.nextToken();
				str2 =str2+" "+each_string.toUpperCase();
		}
			else {
				String each_string = sr.nextToken();
				str2 =str2+" "+ each_string.toLowerCase();
			}
			i++;  
		}
			System.out.println("changed string is :"+str2);
		
	}
}


