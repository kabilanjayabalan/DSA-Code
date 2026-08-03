class Solution { // Leetcode : 438
    static boolean anagram(String s,String res){
        int freq[]=new int[128];
        for(int i=0;i<res.length();i++){
            freq[res.charAt(i)-'a']++;
            freq[s.charAt(i)-'a']--;
        }
        for(int i=0;i<128;i++){
            if(freq[i]>0 || freq[i]<0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n1=p.length();
        int left=0;
        int right=p.length()-1;
        ArrayList<Integer> list =new ArrayList<>();
        while(right<s.length()){
            String res=s.substring(left,right+1);
            if(anagram(p,res)){
                list.add(left);
            }
            left++;
            right++;
        }
        return list;
    }
}