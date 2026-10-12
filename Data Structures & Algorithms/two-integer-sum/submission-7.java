class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int j = 0; j < nums.length; j++){
            int numberToLook = target - nums[j];

            if(map.containsKey(numberToLook) && map.get(numberToLook) != j){
                int[] results = {j, map.get(numberToLook)};
                return results;
            }

        }

        return null;
    }
}
