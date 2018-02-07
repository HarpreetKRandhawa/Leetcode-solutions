class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int[] res = new int[nums.length];
        int i=0, j=nums.length-1;
        int index = a >=0 ? nums.length-1:0;
        while(i <= j){
            if(a >= 0)
                res[index--] = quad(nums[j],a,b,c) > quad(nums[i],a,b,c) ? quad(nums[j--],a,b,c) : quad(nums[i++],a,b,c);
            else
                res[index++] = quad(nums[j],a,b,c) > quad(nums[i],a,b,c) ? quad(nums[i++],a,b,c) : quad(nums[j--],a,b,c);
        }
        return res;
    }
    private int quad(int x, int a, int b, int c){
        return a*x*x+b*x+c;
    }
}
