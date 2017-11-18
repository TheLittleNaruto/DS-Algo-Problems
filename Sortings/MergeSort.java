public class MergeSort{
	
	public void mergeSort(int[] arr, int n){
		if(n < 2){
			return;
		}
		int mid = (int)n/2;
		int[] L = new int[mid];
		int[] R = new int[n-mid];
		
		//copy content
		for(int i = 0; i < mid; i++){
			L[i] = arr[i];
		}
		
		for(int j = mid; j < n; j++){
			R[j - mid] = arr[j];
		}
		
		mergeSort(L, L.length);
		mergeSort(R, R.length);
		merge(L, R, arr);
	}
	
	public void merge(int[] L, int [] R, int[] arr){
		int nL = L.length;
		int nR = R.length;
		
		int i,j,k;
		i = j = k = 0;
		
		while(i < nL && j < nR){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				k++;
				i++;
			}else{
				arr[k] = R[j];
				k++;
				j++;
			}
		}
		
		//copy left content
		while(i < nL){
			arr[k] = L[i];
			k++;
			i++;
		}
		while(j < nR){
			arr[k] = R[j];
			k++;
			j++;
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
		
		MergeSort ms = new MergeSort();
		ms.printArray(arr);
		
		ms.mergeSort(arr, arr.length);
		System.out.println("Printing sorted array");
		ms.printArray(arr);
		
	}
	
}