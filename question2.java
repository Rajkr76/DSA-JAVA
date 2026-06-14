class Solution {
    public int secondLargestElement(int[] nums) {
    int largest = nums[0];
    for(int i = 0;i<nums.length;i++){
        if(nums[i]>largest){
            largest= nums[i];
        }
    // dont return here as when u return here then code will exit here means below code will be unreachable
    }
   int s_largest = -1;
    for(int i = 0;i<nums.length;i++){
        if(nums[i]>s_largest && nums[i] != largest){
             s_largest = nums[i];
        } 
    }
    return s_largest;
    }
}

// above solution is better solution . having time complexity O(N+N) = O(2N)
