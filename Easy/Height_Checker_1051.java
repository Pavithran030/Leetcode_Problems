class Solution {
    public int heightChecker(int[] heights) {
        int[] except=heights.clone();
        Arrays.sort(except);

        int count =0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=except[i]) count++;
        }
        return count;
    }
}
