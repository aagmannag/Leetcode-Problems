class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int left = 0, ans = 0;
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0){
                ans += s.length() - i;
                arr[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}