public class BubbleSort{
	
	public void bubbleSort(int[] arr, int n){
		for(int i = 1; i<n; i++){
			int flag = 0;
			for(int j = 0; j<=n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) break;
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
		
		BubbleSort bs = new BubbleSort();
		bs.printArray(arr);
		
		bs.bubbleSort(arr, arr.length);
		System.out.println("Printing sorted array");
		bs.printArray(arr);
		
	}
	
}