class Solution {
    public int findNumbers(int[] nums) {
       int count=0;

       for(int num:nums){
        int n=num;
        int digit=0;

        if(n==0)
        {
            digit=1;
        }
        while(n!=0){
            n=n/10;
            digit++;
        }
        if(digit%2==0){
            count++;
        }
       } 
       return count;
    }
}
