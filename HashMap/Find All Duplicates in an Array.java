class Solution { // Leetcode : 442 - Medium
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list =new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
