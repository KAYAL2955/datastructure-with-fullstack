class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1;
        int max=0;
        while(start<end){
            int width=end-start;
            int high=Math.min(height[start],height[end]);
            int area=width*high;
            max=Math.max(max,area);
            if(height[start]<height[end])
                start++;
            else
                end--;
        }
        return max;
    }
}
