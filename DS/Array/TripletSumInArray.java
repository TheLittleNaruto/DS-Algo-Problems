public class TripletSumInArray {

	public static void main(String args[]){
	
		int[] arr = {1, 3, 4, 6, 9, 12};
		
		int sum = 24;
		
		int[] triplet = new int[3];
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++){
		
			int diff = sum - arr[i];
			
			int startPtr = 0;
			int endPtr = arr.length - 1;
			
			//Now check which 2 numbers will give the sum equals "diff"
			while(startPtr < endPtr){
				
				if(startPtr != i && endPtr != i){
					if(arr[startPtr] + arr[endPtr] == diff){
						triplet[0] = arr[i];
						triplet[1] = arr[startPtr];
						triplet[2] = arr[endPtr];
					
						System.out.println(triplet[0] + " " + triplet[1] + " " + triplet[2]);
					
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