class Solution {
     // sort the array using bubble sort.
     public static void isSorted(int nums[]){
         for(int i =0; i<nums.length-1; i++){
            for(int j= 0; j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){

                  int temp = nums[j];
                  nums[j] = nums[j+1];
                  nums[j+1] = temp;
                }
            }
         }
    }

    public int maxProduct(int[] nums) {
        int prod = 1;
        isSorted(nums);

       for(int i = nums.length-1; i>=nums.length-2; i--){
            prod = prod * (nums[i]-1);
         }  
         
           return prod;
    }
}