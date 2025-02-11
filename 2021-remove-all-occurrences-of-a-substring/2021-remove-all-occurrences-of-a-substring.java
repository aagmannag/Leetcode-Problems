class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = part.length();
        for(int i = 0; i < n; i++){
            sb.append(s.charAt(i));
            if(sb.length() >= m){
                String ans = sb.substring(sb.length()-m);
                if(ans.equals(part)){
                    sb.setLength(sb.length() - m);
                }
            }
        }
        return sb.toString();
    }
}