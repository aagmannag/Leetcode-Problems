class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> mt = new Stack<>();
        for(int i : asteroids){
            boolean flag = false;
            while (!mt.isEmpty() && i < 0 && mt.peek() > 0) {
                if (Math.abs(mt.peek()) < Math.abs(i)) {
                    mt.pop(); 
                }else if (Math.abs(mt.peek()) == Math.abs(i)) {
                    mt.pop(); 
                    flag = true;
                    break;
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                mt.push(i);
            }
        }
        int[] ans = new int[mt.size()];
        for(int i = ans.length-1; i >= 0; i--){
            ans[i] = mt.pop();
        }
        return ans;
    }
}