class Solution {
    public int removeDuplicates(int[] nums) {
      int of=0;
      int cm=of+1;
      int count=1;

      while(cm<nums.length){
        if(nums[cm]==nums[of]){
            cm++;
            
        }
        else{
            of++;
            nums[of]=nums[cm];
            cm++;
            count++;

        }

      } 
      return count;
    }
}