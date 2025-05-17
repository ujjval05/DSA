class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0;
        for(int a : nums){
            if(a == 0) zero++;
            else if(a == 1) one++;
        }
        for(int i = 0; i < zero; i++){
            nums[i] = 0;
        }

        for(int i = zero; i < zero + one; i++){
            nums[i] = 1;
        }

        for(int i = zero + one; i < nums.length; i++){
            nums[i] = 2;
        }
    }
}
