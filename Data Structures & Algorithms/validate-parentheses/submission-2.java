class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(stack.isEmpty() && map.containsKey(c)){
                return false;
            }
            if(!map.containsKey(c)){
                stack.push(c);
            }else{
                char ch = stack.pop();
                if(ch != map.get(c))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
