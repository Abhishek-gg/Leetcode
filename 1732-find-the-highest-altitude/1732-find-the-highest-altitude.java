class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight = 0;
        int currentHeight = 0;

        for(int g : gain){
            currentHeight += g;
            maxHeight = Math.max(maxHeight,currentHeight);
        }

        return maxHeight;
    }
}