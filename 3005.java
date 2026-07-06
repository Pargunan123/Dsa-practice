class Solution {
    public int maxFrequencyElements(int[] nums) {
     int max=0,sum=0;
     HashMap<Integer,Integer>hm=new HashMap<>();
     for(int key:nums){
        hm.put(key,hm.getOrDefault(key,0)+1);
        max=Math.max(max,hm.get(key));
     }
     for(int val:hm.values()){
        if(val==max) sum+=val;
     }
     return sum;
    }
}