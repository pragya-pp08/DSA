class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j = nums.length - 1;
        int temp = 0;
        int n = nums.length;
        int count = 0;
        
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] != val) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                   
                    j--;
                    i++;
                } else {
                    j--;

                }

            } 
            else {
                i++;
            }
            

        }

        return i;

    }
}