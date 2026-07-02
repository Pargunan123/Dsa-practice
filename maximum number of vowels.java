class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount=0,max=0;
       
        for(int i=0;i<k;i++){
               if(isVowel(s.charAt(i))) vowelCount++;
        }
        max=vowelCount;
        int st=1,end=k;
        while(end< s.length()){
            if (isVowel(s.charAt(st-1)))vowelCount--;
            if (isVowel(s.charAt(end)))vowelCount++;
            max=Math.max(vowelCount,max);
            st++;
            end++;
        }
        return max;
    }
     boolean isVowel(char ch){
            return( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
   }
}