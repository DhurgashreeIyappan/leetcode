class Solution {
    public int reverse(int x) {
        if(x>=0 && x<=9) return x;
        int rev=0;
        while(x!=0){
            int last=x%10;
            rev=rev*10+last;
            x=x/10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
        }
        return rev;
    }
}