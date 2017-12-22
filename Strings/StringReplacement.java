public class StringReplacement{
	
	//replace each occurance of consecutive AB with C in a given String.
	//for example if String is "I am ABIndia."
	//Output should be "I am CIndia."
	//following solution is with complexity O(n)
	//Asked in Amazon interview
	
	public static void main(String ar[]){
		String str = "I am ABIndia Ab ButAB is in MYAB Blood.";
		char[] input = str.toCharArray();
		int i, j;
		for(i = 0, j=0; j < input.length; i++,j++){
			if(input[j] == 'A' && j+1 < input.length && input[j+1] == 'B'){
				input[i] = 'C';
				j++;
			}else {
				input[i] = input[j];
			}
		}
		
		System.out.println(String.valueOf(input).substring(0, i));
	}
	
}