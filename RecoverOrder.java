class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int idx=0;

        for(int id:order){
            for(int f:friends){
                if(id==f){
                    ans[idx++]=id;
                    break;
                }
            }
        }
        return ans;
    }
}
