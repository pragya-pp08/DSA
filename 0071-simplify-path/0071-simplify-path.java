class Solution {
    public String simplifyPath(String path) {
       Stack<String>st=new Stack<>();
       String[] parts=path.split("/");
       for(int i=0;i<parts.length;i++){
        if(parts[i].equals("..")){
            if(!st.isEmpty()){
            st.pop();
            }
            
        }
        else if(parts[i].equals(".")|| parts[i].equals("")){
            continue; //skip
        }
        else{
            st.push(parts[i]);
        }
       }
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<st.size();i++){
        sb.append("/");
        sb.append(st.get(i));
       } 
       if(sb.length()==0){
        return("/");
       }
       return sb.toString();
    }
}