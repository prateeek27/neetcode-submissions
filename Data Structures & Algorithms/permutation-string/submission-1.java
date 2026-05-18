class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
         HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c:s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s1.length();i++){
            char c = s2.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(map1.equals(map2))
            return true;
        int l=0,r=s1.length();
        while(r<s2.length()){
            char lc = s2.charAt(l);
            char rc = s2.charAt(r);
            map2.put(rc,map2.getOrDefault(rc,0)+1);
            map2.put(lc,map2.get(lc)-1);
            if(map2.get(lc) == 0){
                map2.remove(lc);
            }
            if(map1.equals(map2))
                return true;
            l++;
            r++;
        }
        return false;
    }
}
