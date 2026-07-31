class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int[]res=new int[nums.length];
       Stack<Integer>st=new Stack<>();
       for(int i=nums.length-2;i>=0;i--){
          st.push(nums[i]);
       } 
       for(int i=nums.length-1;i>=0;i--){
        while(!st.empty() && st.peek()<=nums[i]){
            st.pop();
        }
        if(st.isEmpty()){
            res[i]=-1;
        }
        else{
            res[i]=st.peek();
        }
        st.push(nums[i]);
       }
       return res;
    }
}