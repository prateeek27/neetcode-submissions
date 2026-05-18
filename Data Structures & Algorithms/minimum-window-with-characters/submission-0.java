class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> input = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        int l=0,r=0,ansL=0,ansR=0,ans=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            input.put(c,input.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            window.put(c,window.getOrDefault(c,0)+1);
            r++;
            while(checkIfwindowContainsAllInput(input,window)){
            if(ans>r-l){
                ans = r-l;
                ansL = l;
                ansR = r;
            }
                char ch = s.charAt(l);
                window.put(ch,window.get(ch)-1);
                l++;
            }
        }
        return s.substring(ansL,ansR);

        
    }

    private boolean checkIfwindowContainsAllInput(HashMap<Character,Integer>input, HashMap<Character,Integer> window){
      int count =0;
      for(Map.Entry<Character,Integer> map:input.entrySet()){
        if(window.containsKey(map.getKey())){
             if(window.get(map.getKey()) >= map.getValue()) {
                count++;
        }
      } 
    }
      return (count == input.size()); 
    }
}
