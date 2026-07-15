class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int total=0;
        for(String word :words){
            Map<Character,Integer>map1=new HashMap<>();
            boolean form=true;
            for(char c:word.toCharArray()){
                map1.put(c,map1.getOrDefault(c,0)+1);
                if(map1.get(c)>map.getOrDefault(c,0)){
                    form=false;
                    break;
                }
            }
            if(form){
                total+=word.length();
            }
        }
        return total;
    }
}