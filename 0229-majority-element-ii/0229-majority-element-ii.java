class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int candidate1 = 0;
        int count2 = 0;
        int candidate2 = 0;
        for(int i : nums){
            if(candidate1 == i){
                count1++;
            }else if(candidate2 == i){
                count2++;
            }else if(count1 == 0){
                candidate1 = i;
                count1++;
            }else if(count2 == 0){
                candidate2 = i;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;
        for(int i : nums){
            if(i == candidate1){
                freq1++;
            }else if(i == candidate2){
                freq2++;
            }
        }
        if(freq1 > nums.length/3){
            list.add(candidate1);
        }
        if(freq2 > nums.length/3){
            list.add(candidate2);
        }
        return list;
    }
} 