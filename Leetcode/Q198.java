public class Q198 {
    public int maxrob(int[]nums, int n){
        if(n<0) return 0;
        if(n==0) return nums[n];
        if(n==1) return nums[n];
        return nums[n]+ Math.max(maxrob(nums,n-2),maxrob(nums,n-3));
    } 
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1) return nums[n-1];
        else{
            return Math.max(maxrob(nums,n-1),maxrob(nums,n-2));
        }
    }
}
