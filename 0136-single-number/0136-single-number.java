//optimal approach
class Solution {
    public int singleNumber(int[] nums) {
        int xorr=0;
        for(int i =0;i<nums.length;i++){
            xorr = xorr^nums[i];
        }
        return xorr;
    }
       
 }

//Better approach
// import java.util.HashMap;
// import java.util.Map;
// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = nums.length;
//          HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i =0;i<n;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
//         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//             if(entry.getValue()==1){
//                 return entry.getKey();
//             }
//         }
//         return -1;
//     }
       
//  }


// brute force approach 

// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = nums.length;
//         for(int i =0;i<n;i++){
//             int count = 0;
//             int numb = nums[i];
//             for(int j =0; j<n;j++){
//                 if(nums[j]==numb){
//                     count++;
//                 }
//             }
//             if(count ==1){
//                 return numb;
//             }
//         }
//         return -1;
//     }
// }