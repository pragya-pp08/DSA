class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        int[] left = previoussmaller(heights);

    int[] right = nextsmaller(heights);
     for(int i=0;i<heights.length;i++){
        int width=right[i]-left[i]-1;
        int area=heights[i]*width;
        maxarea=Math.max(area,maxarea);
     }
     return maxarea;
    }
    public int[] previoussmaller(int[] heights){
      int[] left=new int[heights.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.empty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        return left;
    }
    public int[] nextsmaller(int[] heights){
        Stack<Integer>st=new Stack<>();
        int[] right=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!st.empty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=heights.length;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);

        }
        return right;

    }
}