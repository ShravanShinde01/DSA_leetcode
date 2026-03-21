class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            count = count + nums[i];
            largest = Math.max(largest, count);

            if(count < 0){
                count = 0;
            }
        }
        return largest;
    }
}