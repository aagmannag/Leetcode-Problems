class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                ans += s.charAt(i);
            }
        }
        int i = 0;
        int j = ans.length()-1;
        System.out.print(ans);
        while(i < j){
            if(ans.charAt(i) == (ans.charAt(j))){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}