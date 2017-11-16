public class InsertionSort{
	
	public void insertionSort(int[] arr, int n){
		for(int i = 1; i<n; i++){
			int value = arr[i];
			int hole = i;
			while(hole > 0 && arr[hole - 1] > value){
				arr[hole] = arr[hole - 1];
				hole = hole - 1;
			}
			arr[hole] = value;
		}
	}
	
	public void printArray(int[] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.print(i + "=> " + arr[i] + ",");
		}
		System.out.print("\n");
	}
	
	public static void main(String arg[]){
		int[] arr = new int[]{2,7,5,4,1,3};
		
		System.out.println("printing array");
		
		InsertionSort is = new InsertionSort();
		is.printArray(arr);
		
		is.insertionSort(arr, arr.length);
		System.out.println("Printing sorted array");
		is.printArray(arr);
		
	}
	
}