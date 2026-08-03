class Solution { //Leetcode : 383
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:ransomNote.toCharArray()){
            map1.put(c,map1.getOrDefault(c, 0)+1);
        }
        for(char c:magazine.toCharArray()){
            map2.put(c,map2.getOrDefault(c, 0)+1);
        }
        for (char ch : map1.keySet()) {
            if (!map2.containsKey(ch)) {
                return false;
            }
            if (map2.get(ch) < map1.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
