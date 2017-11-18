public class QuickSort{
	
	public void quickSort(int[] arr, int start, int end){
		if(start < end){
			int pIndex = partition(arr, start, end);	
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}
	}
	
	public int partition(int[] arr, int start, int end){
		int pivot = arr[end];
		int pIndex = start;
		
		for(int i = start; i < end; i++){
			if(arr[i] <= pivot){
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		
		int tem = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = tem;
		
		return pIndex;
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
		
		QuickSort qs = new QuickSort();
		qs.printArray(arr);
		
		qs.quickSort(arr, 0, arr.length - 1);
		System.out.println("Printing sorted array");
		qs.printArray(arr);
		
	}
	
}