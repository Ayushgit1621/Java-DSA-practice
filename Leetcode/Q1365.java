package Leetcode;

public class Q1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n =nums.length;
        int[] freq = new int[101]; 
        // because the values in the nums array can be 0-100 and here we are counting the freq of each num 
        int res[]= new int[n];

        for (int num: nums){
            freq[num]++;// stores the freq of each element of the nums array
        }

        for(int i=1;i<freq.length;i++){
           freq[i]+= freq[i-1];
        } // Here (freq[x] tells how many num <= x)

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                res[i]=0;
            }
            else{
                res[i]= freq[nums[i]-1]; // gives the no. of elements less than the num (res[8]=res[8-1] gives 4 since res[7]=4 with cummulative freq thing)
            }
        }
        return res;
    }
}
