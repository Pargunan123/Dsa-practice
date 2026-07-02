class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0,sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int avg=sum/k;
        if(avg>=threshold) count++;
        int st=1,end=k;
        while(end<arr.length){
            sum=sum-arr[st-1]+arr[end];
            avg=sum/k;
            if(avg>=threshold) count++;
            st++;
            end++;
        }
        return count;
    }
}