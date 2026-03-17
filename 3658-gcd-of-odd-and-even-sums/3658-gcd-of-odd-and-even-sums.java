class Solution {
    public int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        int odd = n * n;          // sum of first n odd numbers
        int even = n * (n + 1);   // sum of first n even numbers

        int ans=gcd(odd,even);
        return ans;
    }
}