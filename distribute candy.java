class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        HashSet<Integer>hs=new HashSet<>();
        for(int df:candyType){
            hs.add(df);
        }
        int dfSize=hs.size();
        int min=Math.min(n,dfSize);
        return min;
    }
}