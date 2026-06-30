class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();

        for(String word:words){
            int wordWeight=0;

            for(char ch:word.toCharArray()){
                wordWeight+=weights[ch-'a'];
            }
            int idx=wordWeight%26;

            char mapped=(char)('z'-idx);

            ans.append(mapped);
        }
        return ans.toString();
    }
}
