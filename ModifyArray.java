
public class ModifyArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1,25,56,42,23,3,9,6};
		int n = arr.length;
		int [] arr2 = getModifyArray(arr,n);
		System.out.println("after sorting the array");
		for(int i=0;i<n;i++) {
			System.out.println(arr2[i]);
		}
		

	}
	public static int[] getModifyArray(int [] arr, int n) {
		int [] arr2 = new int[n];
		int k=0;
		for(int i=n-1;i>=0;i--) {
			
			arr2[k]=arr[i];
			k++;
		}
		System.out.println("after revresing the array");
		for(int i=0;i<n;i++) {
			System.out.println(arr2[i]);
		}
		
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
        return arr;
	}

}
