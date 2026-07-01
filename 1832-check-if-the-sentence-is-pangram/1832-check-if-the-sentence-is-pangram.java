class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] letter=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            letter[ch-'a']=true;
        }
        for(int i=0;i<26;i++){
            if(!letter[i]) return false;
        }
        return true;
    }
}