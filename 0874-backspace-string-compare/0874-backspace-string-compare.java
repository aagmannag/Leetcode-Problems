class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c == '#'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}