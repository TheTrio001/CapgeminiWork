
public class SecondLargest {

	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,9,4,6,7,8};
		int n = arr.length;
		int second_Largest = secondLargest(arr,n);
		System.out.println("second largest number is :"+second_Largest);
	
	}
	
	public static int secondLargest(int [] arr,int n) {
		int num;
        int i, j,temp;
        for (i = 0; i < n-1; i++) {   
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
            	temp = arr[j];
            	arr[j]=arr[j+1];
            	arr[j+1]=temp;
            		}        
        		}
        
        	}
        num=arr[n-2];
        return num;
	}

}
