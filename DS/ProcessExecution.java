import java.util.*;

public class ProcessExecution {

	HashMap<Integer, List<Integer>> inputMap = new HashMap<Integer, List<Integer>>();
	ArrayList<Integer> outputList = new ArrayList<Integer>();
	
	/* Input:
	   P1, P2, P3
	   P1 -> P2 , P3
	   P2 -> P3
	   
	   Output:
	   P3 -> P2 -> P1
	*/
	
	public ProcessExecution(HashMap<Integer, List<Integer>> in){
		inputMap = in;
	}
	
	public void findOrderOfExecution(){
		for(Map.Entry<Integer, List<Integer>> entry: inputMap.entrySet()){
			
		}
	}

}