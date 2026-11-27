class Solution {
    public int leastInterval(char[] tasks, int n) {
     HashMap<Character,Integer>map=new HashMap<>();
     for(int i=0;i<tasks.length;i++){
        char c=tasks[i];
        map.put(c,map.getOrDefault(c,0)+1);
     } 
     PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
     ArrayList<Character>keys=new ArrayList<>(map.keySet());  //[A,B,C]
     for(int i=0;i<keys.size();i++){
        char c=keys.get(i);
        int freq=map.get(c);
        int curr[]={c,freq};
        pq.add(curr);
     }
     Queue<int[]>q=new LinkedList<>(); //cooldown queue
     int time=0;
     while(!pq.isEmpty() || !q.isEmpty()){
        time++;
        if(!q.isEmpty() && q.peek()[2]==time){
            int[] remove=q.poll();
            pq.add(new int[]{ remove[0],remove[1]});
        }
        if(!pq.isEmpty()){
            int[] remove=pq.poll();
            remove[1]--;
        
        if(remove[1]>0){
            q.add(new int[]{
                remove[0],remove[1],time+n+1
            });
        }
        }
     }
     return time;




    }
}