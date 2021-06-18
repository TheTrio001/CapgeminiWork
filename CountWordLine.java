import java.util.*;
public class CountWordLine
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int numberof_character;
		int numberof_words;
		numberof_character = text.length();
		String[] words = text.split(" ");
		numberof_words = words.length;
		System.out.println("numberof_character : "+numberof_character);
		System.out.println("numberof_words : "+numberof_words);
// 	plz write here	write logic for read number of lines
		sc.close();
	}
}