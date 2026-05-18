class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxf = 0;
        int l=0,r=0;
        int res =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            maxf = Math.max(maxf,map.get(c));
            r++;
            while((r-l)-maxf>k){
                char ch = s.charAt(l);
                map.put(ch,map.get(ch)-1);
                l++;
            }
        res = Math.max(res,r-l);
        }
        return res;

    }
}
/*






*/