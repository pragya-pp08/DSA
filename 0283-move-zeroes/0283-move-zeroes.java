class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 1;

        while (i < nums.length && j < nums.length) {

            if (nums[i] == 0) {

                // j ko next non-zero tak le jao
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }

                // agar non-zero mila
                if (j < nums.length) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                    i++;
                    j++;
                }
            } 
            else {
                i++;
                j++;
            }
        }
    }
}