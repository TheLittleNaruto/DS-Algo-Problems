import java.util.HashMap;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output = new int[2];
    
        HashMap<Integer, Integer> copyMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            
            if(copyMap.containsKey(diff)){
                output[0] = i;
                output[1] = copyMap.get(diff);
                break;
            }else{
                copyMap.put(nums[i], i);
            }
        } 
        
        return output;
    }
}