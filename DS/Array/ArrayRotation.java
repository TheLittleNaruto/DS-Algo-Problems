import java.util.*;
import java.lang.Math;

public class ArrayRotation {
	//B = rotation count
	public List<Integer> rotateArray(List<Integer> A, int B) {
		List<Integer> ret = new ArrayList<Integer>();
		
		//update B i.e. rotation count if it exceeds the size of array.
		if(B >= A.size()){
				B = B % A.size();
		}
		
		for (int i = 0; i < A.size(); i++) {
			if(i >= A.size() - B){
			    ret.add(A.get(Math.abs(A.size() - i - B)));
			}else{
			    ret.add(A.get(i + B));
			}
		}
		return ret;
	}
	
	public static void main(String ar[]){
		ArrayRotation sol = new ArrayRotation();
		List<Integer> arr = Arrays.asList(14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35);
		List<Integer> ret = sol.rotateArray(arr, 56);
		for(int i = 0; i<ret.size(); i++){
			System.out.print(i + "=> " + ret.get(i) + ",");
		}
		System.out.print("\n");
	}
}