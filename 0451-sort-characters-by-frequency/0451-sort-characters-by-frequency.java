
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        ArrayList<Character> keys = new ArrayList<>(map.keySet());
            for(int i=0;i<keys.size();i++){
                char c=keys.get(i);
                int freq=map.get(c);
                int[] curr={c,freq};
                pq.add(curr);
            }
        
            StringBuilder sb=new StringBuilder();
            while(!pq.isEmpty()){
                int[] removed=pq.poll();
                char c= (char)removed[0];
                int freq=removed[1];
                for(int i=0;i<freq;i++){
                    sb.append(c);
                }
            

            }
            return sb.toString();

        

    }
}
