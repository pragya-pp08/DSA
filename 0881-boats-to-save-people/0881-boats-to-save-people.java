class Solution {
    public int numRescueBoats(int[] people, int limit) {
         int i=0;
         int j=people.length-1;
         Arrays.sort(people);
         int boats=0;
         while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
               
            }
            else{
                j--;
                
            }
            boats++;
         }
         return boats;
    }
}