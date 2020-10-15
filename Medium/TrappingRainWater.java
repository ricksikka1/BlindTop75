class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0 || height == null){
            return height.length;
        }
        if(height.length == 2){
            return Math.min(height[0], height[1]);
        }
        
        int l = 0;
        int r = height.length - 1;
        
        int area = Math.min(height[l], height[r]) * (height.length-1);
        while(l < r){
            if(height[l] > height[r]){
                r--;
            }else{
                l++;
            }
            area = Math.max(area, Math.min(height[l], height[r])*(r-l));
        }
        return area;
    }
}