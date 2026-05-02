class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0)
            return 0;
        for(int i:nums){
            set.add(i);
        }
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i]+1))
        //         list.add(nums[i])
        // }
        int max = 1;
        int count = 1;
        for(int i:set){
            int j = i;
            while(set.contains(j+1)){
                count++;
                max = Math.max(max,count);
                j += 1;
            }
            count = 1;
        }   
        return max;    
    }
}
