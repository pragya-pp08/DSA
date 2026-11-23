
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        // Step 2: Create Max Heap
        PriorityQueue<Character> pq =
            new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        // Step 3: Insert unique characters
        Character[] keys = map.keySet().toArray(new Character[0]);

        for(int j=0; j<keys.length; j++) {
            pq.add(keys[j]);
        }

        // Step 4: Build answer
        StringBuilder ans = new StringBuilder();

        while(!pq.isEmpty()) {
            char c = pq.poll();
            int freq = map.get(c);

            for(int i=0; i<freq; i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
