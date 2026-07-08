class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int val=x;
        while(val>0){
            sum+=val%10;;
            val=val/10;
        }
        if(x%sum==0){
            return sum;
        }else{
            return -1;
        }
    }
}