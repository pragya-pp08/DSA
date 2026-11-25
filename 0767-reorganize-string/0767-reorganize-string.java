class Solution {
    public String reorganizeString(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a,b)->b[1]-a[1]);

        ArrayList<Character> keys =
            new ArrayList<>(map.keySet());

        for(int i=0; i<keys.size(); i++){
            char c = keys.get(i);
            int freq = map.get(c);

            int[] curr = {c,freq};
            pq.add(curr);
        }

        StringBuilder sb = new StringBuilder();
        int[] prev = null;

        while(!pq.isEmpty()){

            int[] remove = pq.poll();

            sb.append((char)remove[0]);

            remove[1]--;

            if(prev != null && prev[1] > 0){
                pq.add(prev);
            }

            prev = remove;
        }

        if(prev != null && prev[1] > 0){
            return "";
        }

        return sb.toString();
    }
}


    
