class Solution {
    public int findSpecialInteger(int[] arr) {
        int len=arr.length;
        int tf=len/4;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(val>tf){
                return key;
            }
        }
        return -1;
    }
}