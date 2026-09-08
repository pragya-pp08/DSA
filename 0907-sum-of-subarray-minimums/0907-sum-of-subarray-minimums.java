class Solution {
    public int sumSubarrayMins(int[] arr) {
         int[] left=previousmaller(arr);
         int[] right=nextsmaller(arr);
         long ans = 0;
         int mod = 1000000007;
         for(int i=0;i<arr.length;i++){
            int leftchoice=i-left[i];
            int rightchoice=right[i]-i;
            long contribution=(long)arr[i]*leftchoice*rightchoice;
            ans=(ans+contribution)%mod;
         }
         return (int) ans;
         


    }

    public int[] nextsmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = arr.length;
            } else {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;

    }

    public int[] previousmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
}