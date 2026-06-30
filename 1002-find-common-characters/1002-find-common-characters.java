class Solution {
    public List<String> commonChars(String[] words) {
        int[] common = new int[26];
        Arrays.fill(common,Integer.MAX_VALUE);
        for(String s:words){
            int[] freq = new int[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            for(int i = 0;i<26;i++){
                common[i] = Math.min(freq[i],common[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for(int i = 0;i<26;i++){
            while(common[i]>0){
                res.add(""+(char)(i+'a'));
                common[i]--;
            }
        }
        return res;
    }
}