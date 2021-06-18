
public class ArrayDemo {
public static void main(String []  args) {
	int[][] arr = null;
	arr = new int[2][3];
	System.out.println(arr);
	System.out.println("hash code is :"+arr.hashCode());
	System.out.println("length is "+arr.length);
	

	
	System.out.println("jagged array implementation");
	
	int [] [] numbers = new int[2][];
	numbers[0] = new int[3];
	numbers[1] = new int[5];//Jagged array initialization;
	
	for(int i=0;i<numbers.length;i++) {
		for(int j=0;j<numbers[1].length;j++) {
			System.out.println(numbers[i][j]);
		}
	}
	
	System.out.println("changing size of array this way know as plugability");
	
	int [] temp = new int[] {1,2,3,4,5,6,7};
	numbers[1] = temp;
	
	for(int i=0;i<numbers.length;i++) {
		for(int j=0;j<numbers[1].length;j++) {
			System.out.println(numbers[i][j]);
		}
	}
	
	
}

}
