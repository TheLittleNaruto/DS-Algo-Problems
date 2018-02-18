import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayManipulation {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		long[] input = new long[n];
		
		for(int i = 0; i < n; i++){
			input[i] = 0;
		}
			
		for(int j = 0; j < m; j++){
			int indexA = in.nextInt();
			int indexB = in.nextInt();
			long valueK = in.nextInt();
				
			/*
			if you look for a clear understanding of the solution, Basically, when you add value from a to b you just need to know that it goes up from k and goes down of k after.

			What this algo does is to register the slopes only, so we just need 2 entry, with O(1) complexity.

			We just need to know that we are upping from k at the beginning and decreasing at the end.

			Finally, the maximum would be the addition of all the slopes, that is why it's max(sum) of the tables, because the tables itself registers the slopes
			*/
			input[indexA-1]+=valueK;
			if(indexB<n) input[indexB]-=valueK; 
				
		}
		
		
		long max=0;
		long temp=0;

		for(int i=0;i<n;i++){
			temp += input[i];
			if(temp> max) max=temp;
		}
		System.out.println(max);
	}
	
}