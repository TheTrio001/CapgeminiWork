import java.util.*;
public class ReplaceConsonant
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++){
		    char a = str.charAt(i);
		    int a_v = a;
		    if(a_v==65 || a_v==69 || a_v==73 || a_v==79 || a_v==81){
		        char c=(char)a_v;  
		        System.out.print(c);
		    }
		   else{
		       a_v+=1;
		       char c=(char)a_v;  
               System.out.print(c); 
		   }
		}
		sc.close();
	}
}