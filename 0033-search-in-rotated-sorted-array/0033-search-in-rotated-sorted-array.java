class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int n=nums.length;
        int high=n-1;
        while(low<=high){
            int guess=high-low/2;
            if(nums[guess]==target){
                return guess;
            }
            if(nums[guess]>nums[n-1]){
                if(nums[guess]>target){
                    if(nums[0]>target){
                        low=guess+1;
                    }
                    else{
                        high=guess-1;
                    }
                }
                else{
                    low=guess+1;
                }
            }
            else{
                if(nums[guess]>target){
                    high=guess-1;

                }
                else{
                    if(nums[n-1]<target){
                        high=guess-1;
                    }
                    else{
                        low=guess+1;
                    }
                }
            }
        }
        return -1;

    }
}