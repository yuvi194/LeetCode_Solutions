class Solution {
    public int addMinimum(String word) {
        int i=0;
        int res=0;
        while(i<word.length()){
            int count=0;
            if(word.charAt(i)=='a'){
                count++;
                i++;
            }
            if(i < word.length() && word.charAt(i) == 'b') {
                count++;
                i++;
            }
            if(i < word.length() && word.charAt(i) == 'c') {
                count++;
                i++;
            }
            res += 3 - count;
        }
        return res;
    }
}