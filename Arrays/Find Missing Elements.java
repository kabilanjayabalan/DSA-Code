class Solution {  //Leetcode : 3731
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } if (nums[i] > max) {
                max = nums[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int pointer = 0;
        for (int i = min; i <= max; i++) {
            if (pointer < nums.length && nums[pointer] == i) {
                pointer++;
            } else {
                list.add(i);
            }
        }
        return list;
    }
}
