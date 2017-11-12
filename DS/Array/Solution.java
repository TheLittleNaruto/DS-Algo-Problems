import java.util.ArrayList;
public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		
		Integer[] input = a.toArray(new Integer[a.size()]);
		//Output should be {2,5}
	    
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
		int sum = 0;
		int maxSum = 0;
		int currentStartPointer = 0;
		int startPointer = 0;
		int endPointer = 0;
		for( int i = 0; i< input.length; i++){
			if( input[i] > 0 ){
				if(sum == 0) currentStartPointer = i;
				sum = sum + input[i];
				
			}else{
				
				if(sum > maxSum){
					maxSum = sum;
					startPointer = currentStartPointer;
					endPointer = i-1;
				}
				sum = 0;
			}
			
			if(i == input.length - 1 && input[i] > 0){
				if(sum > maxSum){
					maxSum = sum;
					startPointer = currentStartPointer;
					endPointer = i;
				}
				sum = 0;
			}
		}
		if(maxSum != 0){
			for(int k = startPointer; k <= endPointer; k++){
				result.add(input[k]);
			}
		}else{
			System.out.println("No subset found.");
		}
		
		return result;
	}
	
}

