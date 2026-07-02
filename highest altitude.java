class Solution {
    public int largestAltitude(int[] gain) {
        int current=0, max=0;
        int n=gain.length;
        for(int i=0;i<n;i++){
           current+=gain[i];
           max=Math.max(current,max);
        }
        return max;
    }
}