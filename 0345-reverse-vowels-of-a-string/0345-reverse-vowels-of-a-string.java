class Solution {
    public String reverseVowels(String s) {
        String store = "aeiouAEIOU";
        char[] str = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            while(start < end && !store.contains(str[start] + "")){
                start++;
            }
            while(start < end && !store.contains(str[end] + "")){
                end--;
            }
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
        return new String(str);
    }
}