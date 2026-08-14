class Solution {
    public boolean eatable(int[] arr , int h,int sp){
        long cur = 0;
        for(int piller:arr)cur+=(piller+sp-1)/sp;
        return cur<=h;

    }
    public int minEatingSpeed(int[] arr, int h) {
        int start=1,end = Arrays.stream(arr).max().orElse(0),mid=0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(eatable(arr,h,mid)) end = mid-1;
            else start=mid+1;
        }
        return start;

        
    }
}
