class Solution {
    public static int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxWater = 0;

    while (left < right) {
        int width = right - left;
        int minHeight = Math.min(height[left], height[right]);
        int water = width * minHeight;

        if (water > maxWater) {
            maxWater = water;
        }

        // move the shorter side inward
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxWater;
}
}