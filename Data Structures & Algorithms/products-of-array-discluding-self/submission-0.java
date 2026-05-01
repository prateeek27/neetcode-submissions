class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];
    
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        
        for(int i=1;i<n;i++){
            left[i] = nums[i] * left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i] = nums[i] * right[i+1];
        }
        res[0] = right[1];
        res[n-1] = left[n-2];
        for(int i=1;i<=n-2;i++){
            res[i] = left[i-1] * right[i+1];
        }
        return res;
    }
}  
