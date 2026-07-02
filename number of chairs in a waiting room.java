class Solution {
    public int minimumChairs(String s) {
        int current=0,max=0;
        for(char ch:s.toCharArray()){
            if(ch=='E'){
               current++;
               max=Math.max(current,max);
            }else{
                current--;
            }
        }
        return max;
    }
}