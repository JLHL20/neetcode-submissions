class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> hashi = new HashSet<Integer>();

        for(int i: nums){
            hashi.add(i);
        }

        if (hashi.size() != nums.length){
            return true;
        }
        return false;
        
    }
}