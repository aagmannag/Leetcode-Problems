class Solution {
    public String nearestPalindromic(String n) {
        int i = n.length()/2;
        boolean even = n.length()%2 == 0;
        if(even) i -= 1;
        long leftSide = Long.parseLong(n.substring(0, i+1));

        ArrayList<Long> list = new ArrayList<>();
        list.add(getPal(leftSide, even)); // 12345 , 1234
        list.add(getPal(leftSide+1, even)); // 12321
        list.add(getPal(leftSide-1, even)); // 1221
        list.add((long)Math.pow(10, n.length()-1)-1); // 100
        list.add((long)Math.pow(10, n.length())+1);

        long ans = 0, diff = Long.MAX_VALUE, num = Long.parseLong(n);
        for(long c : list){
            if(c == num) continue;
            long curr = Math.abs(num-c);
            if(diff > curr){
                ans = c;
                diff = curr;
            }
            else if(diff == curr){
                ans = Math.min(ans, c);
            }
        }
        return String.valueOf(ans);
    }
    private long getPal(long leftSide , boolean even){
        long ans = leftSide;
        if(!even) leftSide /= 10;
        while(leftSide > 0){
            ans = (ans*10) + (leftSide%10);
            leftSide /= 10;
        }
        return ans;
    }
}