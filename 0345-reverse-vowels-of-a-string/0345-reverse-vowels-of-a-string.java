class Solution {
    public String reverseVowels(String s) {
     char st[]=s.toCharArray();
     int start=0;
     int end=st.length-1;
     while (start<end){
        if (isVowel(st[start])==false){
            start++;
        }
        else if(isVowel(st[end])==false){
            end--;
        }
        else{
            char temp =st[start];
            st[start]=st[end];
            st[end]=temp;
            start++;
            end--;
        }
     }
     return new String (st);
    }
    public boolean isVowel(char s){
        if (s=='a'|| s=='e'|| s=='i'||s=='o'||s=='u'||s=='A'||s=='E'|| s=='I'|| s=='O'||s=='U'){
            return true;
        }
        return false;
    }
}