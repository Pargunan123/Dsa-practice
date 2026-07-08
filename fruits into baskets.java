class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        int i=0, j=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(j<fruits.length){
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            while(hm.size()>2){
                 hm.put(fruits[i],hm.getOrDefault(fruits[i],0)-1);
                 if(hm.get(fruits[i])==0) hm.remove(fruits[i]);
                 i++;
            }
            maxFruits=Math.max(maxFruits,j-i+1);
            j++;
        }
        return maxFruits;
    }
}