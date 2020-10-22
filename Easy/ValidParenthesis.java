class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++){
            if(stack.isEmpty() && s.charAt(i) == '}'){
               return false;
            }
            if(s.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
            }else if(s.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }else if(s.charAt(i) == ']' && stack.peek() == '['){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        
        return stack.isEmpty();
    }
}