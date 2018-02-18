import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {

/*
2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
*/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		int lastAnswer = 0;
		
		ArrayList<QueryData> queryData = new ArrayList<QueryData>();
		
		Integer[][] seqList = new Integer[N][N];
		
		for(int i = 0; i < Q; i++){
			QueryData qData = new QueryData();
			qData.qType = in.nextInt();
			qData.x = in.nextInt();
			qData.y = in.nextInt();
			queryData.add(qData);
		}

		for(int k = 0; k < Q; k++){
			QueryData qData = queryData.get(k);
			if(qData.qType == 1){
				int seq = (qData.x ^ lastAnswer) % N;
				for(int j = 0; j < N; j++){
					if(seqList[seq][j] == null){
						seqList[seq][j] = qData.y;
						break;
					}
				}
			}else if(qData.qType == 2){
				int seq = (qData.x ^ lastAnswer) % N;
				int index = qData.y % N;
				lastAnswer = seqList[seq][index];
				System.out.println(lastAnswer);
			}
		}
	
    }
	
	public static class QueryData{
		int qType;
		int x;
		int y;
	}
}