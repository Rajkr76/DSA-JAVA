// 282 leetcode : Move Zeroes to the end of the array 

// Below code solution if of Brute forch approach

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int temp[] =new int[n];
        int j =0;
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
               temp[j] = nums[i];
               j++;
            }
        }
        int d = temp.length;
        for(int i =0;i<d;i++ ){
            nums[i]= temp[i];
        }
        for(int i = d ; i <n ; i++){
             nums[i]=0;
        }
    }
}

// Below code solution is of Optimal approach 

class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]==0){
                j= i;
                break;
            }
        }
        if(j==-1) {
            return;
        }
        for(int i = j+1;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]= temp;
                j++;
            }
        }
    }
}