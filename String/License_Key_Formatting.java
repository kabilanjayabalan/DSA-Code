class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String str=s.replace("-","");
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(count==k){
                sb.append('-');
                count=0;
            }
            char ch=str.charAt(i);
            sb.append(Character.toUpperCase(ch));
            count++;
        }
        sb.reverse();
        return new String(sb);
    }
}
