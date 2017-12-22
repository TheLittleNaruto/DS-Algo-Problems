import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArray {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] input = new String[N];
		
		in.nextLine();
		
		for(int i = 0; i < N; i++){
			input[i] = in.nextLine();
		}
		
		int Q = in.nextInt();
		
		in.nextLine();
		
		String[] queries = new String[Q];
		
		for(int j = 0; j < Q; j++){
			queries[j] = in.nextLine();
		}
		
		for(int k = 0; k < Q; k++){
			int count = 0;
			for(int y = 0; y < N; y++){
				if(input[y].equals(queries[k])){
					count = count + 1;
				}
			}
			System.out.println(count);
		}
		
	}
	
}