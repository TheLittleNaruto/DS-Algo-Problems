import java.util.HashSet;
import java.lang.Math;

public class TripletSumInArrayUsingHashSet {

	public static void main(String args[]){
	
		int[] arr = {12, 3, 1, 4, 9, 6}; //{1, 3, 4, 6, 9, 12};
		
		int sum = 17;
		
		int[] triplet = new int[3];
		
		boolean flag = false;
		
		//copy array items into a hashset
		HashSet<Integer> copy = new HashSet<Integer>();
		
		for(int value: arr){
			copy.add(value);
		}
		
		for(int i = 0; i < arr.length; i++){
		
			int diff1 = sum - arr[i];
			
			for(int j = 0; j < arr.length; j++){
				int diff2 = Math.abs(arr[j] - diff1);
				
				if(copy.contains(diff2) && i != j){
					System.out.println(arr[i] + " " + arr[j] + " " + diff2);
					flag = true;
					break;
				}
				
			}
			
			if(flag) break;
			
		}
	
	}

}