import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

0 -4 -6 0 -7 -6
-1 -2 -6 -8 -3 -1
-8 -4 -2 -8 -8 -6
-3 -1 -2 -5 -7 -4
-3 -5 -3 -6 -6 -6
-3 -6 0 -8 -6 -7

-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5
*/
public class HourGlass2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < 4; i++){
			
			for(int j = 0; j < 4; j++){
				int sum = 0;
				for(int k = j; k <= j+2; k++){
					sum = sum + arr[i][k];
					sum = sum + arr[i+2][k];
					if(k == j+1){
						sum = sum + arr[i+1][k];
					}
				}
				if(sum > maxSum){
					maxSum = sum;
				}
			}
		}
		
		System.out.println("Max Sum is: " + maxSum);
    }
}
