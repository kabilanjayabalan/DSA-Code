class Solution { //Leetcode : 14
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            int count = 0;

            for (int j = 0; j < strs.length; j++) {
                if (i < strs[j].length() && c == strs[j].charAt(i)) {
                    count++;
                }
            }

            if (count == strs.length) {
                // s += c;
                sb.append(c);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
