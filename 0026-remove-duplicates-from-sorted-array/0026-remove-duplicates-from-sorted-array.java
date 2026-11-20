class Solution {
    public int removeDuplicates(int[] nums) {
        int cm = 1;
        int of = 0;

        while(cm < nums.length) {
            if(nums[cm] != nums[of]) {
                of++;
                nums[of] = nums[cm];
            }
            cm++;
        }

        return of + 1;
    }
}