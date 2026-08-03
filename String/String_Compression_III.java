class Solution { //Leetcode : 3163
    public String compressedString(String word) {
        StringBuilder ans=new StringBuilder();

        int i=0;

        while(i<word.length()){
            char c=word.charAt(i);
            int count=0;
            while(i<word.length() && word.charAt(i)==c && count<9){
                count++;
                i++;
            }
            ans.append(count);
            ans.append(c);
        }
        return ans.toString();
        
    }
}

// Other approach

class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int count = 1, n = word.length();
        char ch = word.charAt(0);
        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == ch && count < 9) {
                count++;
            } else {
                sb.append(count+""+ch);
                ch = word.charAt(i);
                count = 1;
            }
        }
        sb.append(count+""+ch);
        return sb.toString();
    }
}
