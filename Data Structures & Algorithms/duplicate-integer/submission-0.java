class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashNum = new HashSet<Integer> ();
        for (int i = 0 ; i < nums.length ; i++){
            if (hashNum.contains(nums[i])){
                return true;
            }
            else {
                hashNum.add(nums[i]);
            }
           
        }
         return false;
    }
    public void main (String [] args){
            int [] arr = {1,2,3,1};
            System.out.print(hasDuplicate(arr));
    }
}
