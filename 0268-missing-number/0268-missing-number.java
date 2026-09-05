//better approach 
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]=1;
        }
        for(int i =0;i<n+1;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
}

// brute force
// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length+1;

//         for(int i =0 ; i<n; i++){
//             boolean found = false ;
//             for( int j = 0 ; j < n-1;j++){
//                 if(nums[j]==i){
//                     found = true;
//                     break;
//                 }
              
//             }
//             if(!found){
//                 return i;
//             }
//         }
//        return -1;
//     }
// }