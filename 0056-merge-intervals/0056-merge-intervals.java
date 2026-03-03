class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[][] arr=new int[intervals.length][2];
        int index=0;
        int i=0;
        while(i<intervals.length){
            int start=intervals[i][0];
            int end=intervals[i][1];
            while(i<intervals.length-1 && end>=intervals[i+1][0]){
                end=Math.max(end,intervals[i+1][1]);
                i++;
            }
            arr[index][0]=start;
            arr[index][1]=end;
            index++;
            i++;
        }
        return Arrays.copyOf(arr,index);
    }
}