public class SelectionSort{
	
	public static void selectionSort(int[] arr, int n){
		for(int i = 0; i<n-1; i++){
			int iMin = i;
			for(int j = i+1; j<n; j++){
				if(arr[j] < arr[iMin]){
					iMin = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = temp;
		}
	}
	
	public void printArray(int[] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.println("Array at index " + i + ": " + arr[i]);
		}
	}
	
	public static void main(String arg[]){
		int[] arr = new int[]{2,7,5,4,1,3};
		
		System.out.println("printing array");
		
		SelectionSort ss = new SelectionSort();
		ss.printArray(arr);
		
		ss.selectionSort(arr, arr.length);
		System.out.println("Printing sorted array");
		ss.printArray(arr);
		
	}
	
}