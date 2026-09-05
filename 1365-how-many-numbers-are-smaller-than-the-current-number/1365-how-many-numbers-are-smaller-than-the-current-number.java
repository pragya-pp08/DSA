
class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;

        int[] original = nums.clone();
        Arrays.sort(nums);

        int[] arr = new int[n];

        int i = 0;

        while (i < n) {

            int dup = i;

            while (i < n && nums[i] == nums[dup]) {
                i++;
            }

            // nums[dup] ka smaller count = dup
            for (int j = 0; j < n; j++) {
                if (original[j] == nums[dup]) {
                    arr[j] = dup;
                }
            }
        }

        return arr;
    }
}