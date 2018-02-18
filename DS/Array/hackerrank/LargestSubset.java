public class LargestSubset{

	public static void main(String [] args){
		
		int[] input = new int[]{1967513926, 1540383426, -1303455736, -521595368};
	
		long sum = -1;
		long maxSum = 0;
		int currentStartPointer = 0;
		int startPointer = 0;
		int endPointer = 0;
		for( int i = 0; i< input.length; i++){
			if( input[i] >= 0 ){
				if(sum == -1){
					currentStartPointer = i;
					sum = 0;
				} 
				sum = sum + input[i];
				
			}else{
				
				if(sum > maxSum || (sum == 0 && maxSum == 0 && (i - 1 - currentStartPointer) > (endPointer - startPointer))){
					maxSum = sum;
					startPointer = currentStartPointer;
					endPointer = i-1;
				}
				sum = -1;
			}
			
			if(i == input.length - 1 && input[i] >= 0){
				if(sum > maxSum){
					maxSum = sum;
					startPointer = currentStartPointer;
					endPointer = i;
				}
				sum = -1;
			}
		}
		if(maxSum >= 0){
			for(int k = startPointer; k <= endPointer; k++){
				System.out.println(input[k]);
			}
		}else{
			System.out.println("No subset found.");
		}
		
	}
	
}