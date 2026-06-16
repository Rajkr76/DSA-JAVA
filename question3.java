// Check if the Array is Sorted

class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        int n = nums.size();
        for( int i =1 ; i < n -1; i++ ){
            if(nums.get(i)<=nums.get(i+1)){
                
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}