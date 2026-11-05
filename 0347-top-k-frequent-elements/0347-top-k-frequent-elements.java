class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        Integer[]keys=map.keySet().toArray(new Integer[0]);
        for(int j=0;j<keys.length;j++){
            int element=keys[j];
            int freq=map.get(element);
            int[] curr={freq,element};
        
        if(pq.size()<k){
            pq.add(curr);
            continue;
        }
        if(pq.peek()[0]<curr[0]){
            pq.poll();
            pq.add(curr);
        }
        }
        int [] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[1];
        }
        return ans;
       

    }
}