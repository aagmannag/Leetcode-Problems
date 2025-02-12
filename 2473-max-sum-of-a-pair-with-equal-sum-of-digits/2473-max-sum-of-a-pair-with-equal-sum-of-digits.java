class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            int digitSum = sumOfDigit(i);
            if(map.containsKey(digitSum)){
                int prevNum = map.get(digitSum);
                max = Math.max(prevNum + i, max);
                map.put(digitSum, Math.max(prevNum, i));
            }else{
                map.put(digitSum, i);
            }
        }
        return max;
    }
    private int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;

    }
}