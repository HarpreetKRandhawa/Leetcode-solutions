class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        int len = nums.length-1;
        int left=0, right=len;
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right])
                left = mid+1;
            else if(nums[mid] < nums[left])
                right = mid;
            else
                right--;
        }
        return nums[left];
    }
}