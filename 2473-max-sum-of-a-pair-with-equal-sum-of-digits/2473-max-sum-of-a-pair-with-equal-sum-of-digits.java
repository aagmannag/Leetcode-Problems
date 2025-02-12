class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
        // HashMap<Integer, Integer> map = new HashMap<>();
        int map[] = new int[82];
        for(int i : nums){
            int digitSum = sumOfDigit(i);
            if(map[digitSum] > 0){
                int prevNum = map[digitSum];
                max = Math.max(prevNum + i, max);
                map[digitSum] = Math.max(prevNum, i);
                // map.put(digitSum, Math.max(prevNum, i));
            }else{
                map[digitSum] = i;
                // map.put(digitSum, i);
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