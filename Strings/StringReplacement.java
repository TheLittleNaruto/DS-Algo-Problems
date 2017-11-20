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
		i = j = 0;
		for(i = 0; i < input.length; i++,j++){
			if(input[i] == 'A' && i+1 < input.length && input[i+1] == 'B'){
				input[i] = 'C';
				j++;
			}else if(j < input.length - (j - i) && j > i){
				input[i] = input[j];
				i++;
			}
		}
		
		System.out.println(String.valueOf(input));
	}
	
}