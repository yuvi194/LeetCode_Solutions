class Solution {
    public int minimumLength(String s) {
        int prefix=0;
        int suffix=s.length()-1;
        while(prefix<suffix){
            if(s.charAt(prefix)==s.charAt(suffix)){
                prefix++;
                suffix--;
                while(prefix<=suffix && s.charAt(prefix)==s.charAt(prefix-1)){
                    prefix++;
                }
                 while(prefix<=suffix && s.charAt(suffix)==s.charAt(suffix+1)){
                    suffix--;
                }
            }
            else{
                return suffix-prefix+1;
            }
        }
        return suffix-prefix+1;
    }
}