// brute force approach 

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            int count = 0;
            int numb = nums[i];
            for(int j =0; j<n;j++){
                if(nums[j]==numb){
                    count++;
                }
            }
            if(count ==1){
                return numb;
            }
        }
        return -1;
    }
}