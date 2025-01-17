//Tc: o(n)
//sc: o(1)
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx] > 0)
                nums[idx] *= -1; 
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                result.add(i+1);
            }else{
                nums[i] *= -1;
            }
        }
        return result;
    }
}
