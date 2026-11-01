class Solution {
    public int minMoves(int[] nums) {
        int low = Arrays.stream(nums).min().getAsInt(), moves = 0;
        for(int x : nums) moves += x - low;
        return moves;
    }
}