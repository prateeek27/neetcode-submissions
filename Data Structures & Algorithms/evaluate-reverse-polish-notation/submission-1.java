class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> set = new HashSet<>(Set.of("+", "-", "*", "/"));
        int res =0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s: tokens){
            if(!set.contains(s)){
                stack.push(Integer.valueOf(s));
            }else{
                int b = stack.pop();
                int a = stack.pop();
                switch(s){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
