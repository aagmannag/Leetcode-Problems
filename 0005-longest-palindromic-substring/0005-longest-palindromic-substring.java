class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            // odd
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                } 
            }
            String pal = s.substring(low+1, high);
            if(pal.length() > ans.length()){
                ans = pal;
            }

            // even
            low = i - 1;
            high = i;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }
            pal = s.substring(low+1, high);
            if(pal.length() > ans.length()){
                ans = pal;
            }
        }
        return ans;
    }
}