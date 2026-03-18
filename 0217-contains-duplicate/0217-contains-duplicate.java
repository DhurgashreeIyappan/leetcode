class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> l=new HashMap<>();
        for(int n:nums){
            l.put(n,l.getOrDefault(n,0)+1);
        }
        for(int val:l.values()){
            if(val!=1) return true;
        }
        return false;
    }
}