class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = m;
        
        for(int x = m; x< m+n; x++){
            nums1[x] = Integer.MIN_VALUE;
        }
        
        while(i<m+n && j<n){
            if(nums1[k] == Integer.MIN_VALUE){
                nums1[k] = nums2[j];
                 if(j<n-1) j++;
            }else if(nums1[k] < nums1[i]){
                int temp = nums1[k];
                nums1[k] = nums1[i];
                nums1[i] = temp;
            }else if(i >= k-1 && k < m+n - 1){
                k++;
                i = 0;
            }else{
                i++;
            }
        }
    }
}