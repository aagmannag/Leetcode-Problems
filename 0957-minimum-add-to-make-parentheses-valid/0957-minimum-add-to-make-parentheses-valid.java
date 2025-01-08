class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
		int close = 0;
		for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else if(open > 0 && s.charAt(i) == ')'){
                open--;
            }else{
                close++;
            }
        }
        return open + close;
    }
}