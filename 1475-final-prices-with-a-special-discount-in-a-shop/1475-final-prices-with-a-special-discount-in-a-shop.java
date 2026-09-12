class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<prices.length;i++){
            ans[i]=prices[i];
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                int index=st.pop();
                ans[index]=prices[index]-prices[i];

            }
            st.push(i);
        }
        return ans;

    }
}