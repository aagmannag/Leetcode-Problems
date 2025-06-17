class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for(int i : bills){
            if(i == 5){
                five++;
            }else if(i == 10 && five >= 1){
                ten++;
                five--;
            }else{
                if(ten >= 1 && five >= 1){
                    ten--;
                    five--;
                    twenty++;
                }else if(five >= 3){
                    five -= 3;
                    twenty++;
                }else{
                    return false;
                }
            }
        }
        if((five > 0) || (ten > 0) || (twenty > 0)) return true;
        return false;
    }
}