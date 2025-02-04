class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String str){
        Stack<Character> mt = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '#'){
                if(!mt.isEmpty()){
                    mt.pop();
                }
            }else{
                mt.push(c);
            }
        }
        String ans = mt.toString();
        return ans;
    }
}