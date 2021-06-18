import java.util.Scanner;

public class ArrayBrainStorm {
	private static int CAPACITY=10;

	public static void main(String[] args) {
		int [] numbers = new int[CAPACITY];
		Scanner scanner = new Scanner(System.in);
		int choice;
		String continueChoice;
		
		do {
			showMenu();
			System.out.println("Enter your choice : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				int n = numbers.length;
				if(numbers.length<=CAPACITY) {
				for(int i=0;i<numbers.length;i++) {
					numbers[i] = scanner.nextInt();
				}
				}
				else {
					CAPACITY+=10;
					numbers = new int[CAPACITY];
					for(int i=n;i<CAPACITY;i++) {
						numbers[i] = scanner.nextInt();
					}
					
				}
				
				//TODO :  Work for Add
				// in case adding more value than capacity, will throw the ArrayIndexOutOfBoundsException
				// Manage your program in such a way so that it should never throw ArrayIndexOutOfBoundsException, and it should allow you to add as many numbers as you want
				break;
			case 2:
				ShowData(numbers);
				//TODO :  Work for Show
				//Output must be in values = [200,150] format
				break;
			case 3:
				System.out.println("enter the location");
				int loc = scanner.nextInt();
				System.out.println("enter value");
				int dat = scanner.nextInt();
				
				Replace(numbers,loc,dat);
				//TODO :  Work for Replace
				break;
			case 4:
				SortData(numbers);
				//TODO :  Work for Sorting
				break;
			case 5:
				System.out.println("Enter the data you want to search");
				int search_data = scanner.nextInt();
				boolean found = SearchData(search_data,numbers);
				if(found)
					System.out.println("Found :"+search_data);
				//TODO :  Work for Searching
				break;

			default:
				//TODO: Show default error message
				break;
			}
			System.out.println("Do You want to continue : (yes/no) : ");
			continueChoice=scanner.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
		
    scanner.close();
	}

	private static void showMenu() {
		System.out.println("-------Array Operations--------");
		System.out.println("1. Add");
		System.out.println("2. Show");
		System.out.println("3. Replace");
		System.out.println("4. Sort");
		System.out.println("5. Search");	
	}
	
	
	private static void ShowData(int [] numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.println("["+numbers[i]+"]");
		}
		
	}
	
	private static void Replace(int [] numbers, int loc, int dat) {
		for(int i=0;i<numbers.length;i++) {
			if(i==loc) {
				numbers[i]=dat;
			}
		}
		System.out.println("Done");
		
	}
	
    private static void SortData(int[] numbers) {
        int i, j,temp;
        for (i = 0; i < numbers.length-1; i++) {   
        for (j = 0; j < numbers.length-i-1; j++) {
            if (numbers[j] > numbers[j+1]) {
            	temp = numbers[j];
            	numbers[j]=numbers[j+1];
            	numbers[j+1]=temp;
            }
                
    }
        }
    }
    
    private static boolean SearchData(int search_data,int[] numbers) {
    	for(int i=0;i<numbers.length;i++) {
    		if(numbers[i]==search_data) {
    			return true;
    			}
    	}
    	return false;
		
	}
   

}