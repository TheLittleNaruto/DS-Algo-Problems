class DominantIndex {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int dominantIndex = -1;
        
        int i = 0;
        
        while(i < nums.length){
            if(max < nums[i]){
                max = nums[i];
                dominantIndex = i;
            }
            i++;
        }
        
        i = 0;
        boolean flag = true;
        
        while(i < nums.length){
            if(i != dominantIndex){
                if((2 * nums[i]) > max){
                    flag = false;
                }
            }  
            i++;
        }
        
        if(!flag){
            dominantIndex = -1;
        }
        return dominantIndex;
    }
}