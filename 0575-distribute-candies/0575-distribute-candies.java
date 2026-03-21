class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>ct=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            ct.add(candyType[i]);
        }
        if(ct.size()>candyType.length/2){
            return candyType.length/2;
        }
        
    return ct.size();
    }
}