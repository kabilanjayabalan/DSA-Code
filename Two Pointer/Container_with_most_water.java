class Solution { //Leetcode : 11
    public int maxArea(int[] he) {
        int sum=Integer.MIN_VALUE;
        int l=0;int r=he.length-1;
        while(l<r){
            int w=r-l;
            int h=0;
            if(he[l]<he[r]){
                h=he[l];
            }
            else{
                h=he[r];
            }
            int sum1=h*w;
            if(sum1>sum){
                sum=sum1;
            }
            if(he[l]<he[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return sum;
    }
}
