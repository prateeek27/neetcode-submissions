class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<HashMap<Character,Integer>> mapList = new ArrayList<>();
        for(String s:strs){
                HashMap<Character,Integer> map = new HashMap<>();
            for(char c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            mapList.add(map);
        }

        HashSet<HashMap<Character,Integer>> set = new HashSet<>();
        for(HashMap<Character,Integer> map:mapList){
            set.add(map);
        }
        List<List<String>> res = new ArrayList<>();
        for(HashMap<Character,Integer> map:set){
            List<String> list = new ArrayList<>();
            for(int i=0;i<mapList.size();i++){
                if(map.equals(mapList.get(i))){
                    list.add(strs[i]);
                }
            }
            res.add(list);
        }
        return res;
    }
}
