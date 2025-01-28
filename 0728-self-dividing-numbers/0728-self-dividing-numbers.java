class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(divide(i)){
                list.add(i);
            }
        }
        return list;
    }
    private boolean divide(int n){
        int n1 = n;
        while(n > 0){
            int i = n % 10;
            n /= 10;
            if(i == 0 || n1 % i != 0) return false;
        }
        return true;
    }
}