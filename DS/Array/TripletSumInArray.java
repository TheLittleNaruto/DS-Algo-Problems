public class TripletSumInArray {

	public static void main(String args[]){
	
		int[] arr = {1, 3, 4, 6, 9, 12};
		
		int sum = 24;
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++){
		
			int diff = sum - arr[i];
			
			int startPtr = i;
			int endPtr = arr.length - 1;
			
			//Now check which 2 numbers will give the sum equals "diff"
			while(startPtr < endPtr){
				
				if(startPtr != i && endPtr != i){
					if(arr[startPtr] + arr[endPtr] == diff){
						//print the output
						System.out.println(arr[i] + " " + arr[startPtr] + " " + arr[endPtr]);
					
						flag = true;
						break;
					}
				}
				
				if(!flag)
				{
					if(arr[startPtr] + arr[endPtr] < diff){
						startPtr++;
					}else{
						endPtr--;
					}
				}
				
			}
			
			if(flag){
				break;
			}
		
		}
	
	}

}