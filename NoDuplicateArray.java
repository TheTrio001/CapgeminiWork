
public class NoDuplicateArray {

	public static void main(String[] args) {
		int [] arr = new int[] {1,2,2,8,1,6,9,4,7,9,5,5,3};
		int n = arr.length;
		int [] arr2 = SentForSorting(arr,n);
		System.out.println("after sorting elemnets");
		PrintElements(arr2);
		System.out.println("after removing duplicates");
		removeDuplicates(arr2,n);
	}
	
	public static int[] SentForSorting(int []arr,int n) {
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>=arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}
	
	public static void removeDuplicates(int[] arr,int n) {
		int [] arr2 = new int[n];
		int k=0;
		for(int i=0;i<n-1;i++) {
			
			int j=i+1;
			if(arr[i]==arr[j])
				continue;
			else {
				arr2[k]=arr[i];
			    k++;
		}
		}
		PrintElements(arr2);
		
		
	}
	
	public static void PrintElements(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
