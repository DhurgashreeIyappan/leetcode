class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        char[] str=s.toCharArray();
        for(char c:str){
            if(c=='{' || c=='[' || c=='('){
                stk.push(c);
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                char t=stk.peek();
                if(c==']' && t!='[' || c=='}' && t!='{' || c==')' && t!='('){
                    return false;
                }else{
                    stk.pop();
                }
            }
        }
        return stk.isEmpty();
    }
}