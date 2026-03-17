class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        s=s.toLowerCase();
        char[] arr=s.toCharArray();
        for(char ch:arr){
            if(Character.isLetter(ch)){
            if("aeiou".indexOf(ch)!=-1) v++;
            else c++;
            }
        }
        if(c==0) return 0;
        return v/c;
    }
}