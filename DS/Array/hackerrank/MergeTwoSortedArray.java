public class MergeTwoSortedArray{
	
	public static void main(String arg[]){
		int ar1[] = new int[]{1,3,5,7,9};
		int ar2[] = new int[]{2,4,6,8,10};
		
		int n1 = ar1.length;
		int n2 = ar2.length;
		
		int result[] = new int[n1+n2];
		int i,j,k;
		i = j = k = 0;
		while(i < n1 && j < n2){
			if(ar1[i] <= ar2[j]){
				result[k] = ar1[i];
				k++; i++;
			}else{
				result[k] = ar2[j];
				k++; j++;
			}
		}
		
		while(i < n1){
			result[k] = ar1[i];
			k++; i++;
		}
		
		while(j < n2){
			result[k] = ar2[j];
			k++; j++;
		}
		
		for(int a : result){
			System.out.print(a + ", ");
		}
	}
	
}