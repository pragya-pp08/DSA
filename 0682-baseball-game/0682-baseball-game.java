class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("+")) {

                int first = st.pop();      // Top score
                int second = st.peek();    // Second top score

                st.push(first);            // Put the top back
                st.push(first + second);   // Push their sum

            }

            else if (operations[i].equals("D")) {

                st.push(st.peek() * 2);

            }

            else if (operations[i].equals("C")) {

                st.pop();

            }

            else {

                st.push(Integer.parseInt(operations[i]));

            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}