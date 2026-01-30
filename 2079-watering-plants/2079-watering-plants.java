class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cap=capacity;
        int steps=0;
        for(int i=0;i<plants.length;i++){
            if(plants[i]>cap){
                steps+=2*i;
                cap=capacity-plants[i];
                steps++;
            }else{
                steps++;
                cap-=plants[i];
            }
        }
        return steps;
    }
}