class Solution {
    public int largestElement(int[] nums) {
        int largest = nums[0];
     for(int i =0; i <nums.length;i++){
        if(nums[i]>largest){
            largest=nums[i];
        }
     }
     return largest;
    }
}

// Above solution is optimal solution having time complexity O(N)