class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     HashSet<Character> seen = new HashSet<>();
    //     
    //     for(int i=0;i<s.length();i++){
    //         char c = s.charAt(i);
    //         if(!seen.contains(c)){
    //             seen.add(c);
    //             maxCount = Math.max(maxCount,seen.size());
    //         }else{
    //             seen.clear();
    //             seen.add(c);
                
    //         }
    //     }
    // return maxCount;
    HashMap<Character,Integer> map = new HashMap<>();
    int maxCount = 0;
    for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
                maxCount = Math.max(maxCount,map.size());
            }else{
                i = map.get(c);
                map.clear();
            }
        }
        return maxCount;
    
    }
}
