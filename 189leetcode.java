// 189. Rotate Array ( this is right rotation when k values is given)

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int temp[]= new int[n];
        for(int i = 0 ; i < k; i ++){
            temp[i] = nums[n-k+i];
        }
        for(int i=n-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
    }
}


// below code is for left rotate array by k values

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int temp[] = new int[n];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = n - k; i < n; i++) {
            nums[i] = temp[i - (n - k)];
        }
    }
}