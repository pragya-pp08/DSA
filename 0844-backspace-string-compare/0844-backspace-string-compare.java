class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(check(s).equals(check(t))){
            return true;
        }
        else{
            return false;
        }
    }
    public String check(String str){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)!='#'){
                sb.append(str.charAt(i));
                i++;
            }
            else{
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                    
                }
                i++;
            }

        }
        return sb.toString();
    }
}