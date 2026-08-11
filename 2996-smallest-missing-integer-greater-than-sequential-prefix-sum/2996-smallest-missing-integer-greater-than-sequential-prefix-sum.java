import java.util.*;

class Solution {
    public int missingInteger(int[] nums) {
        
        int sum =nums[0];

        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] == nums[i]+1){
                sum = sum + nums[i+1];
            }
            else{
                break;
            }
        }

            Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==sum){
               sum = sum + 1 ;
            }
        }

        return sum;
    }
}