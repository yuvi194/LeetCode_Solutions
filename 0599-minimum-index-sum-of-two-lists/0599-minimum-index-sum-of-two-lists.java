class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String , Integer> map = new HashMap<>();
        
        int n = list1.length;
        int m = list2.length;
        
        for(int i=0;i<n;i++)
        {
            map.put(list1[i],i);
        }

        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>(); 

        for(int i=0;i<m;i++)
        {
            if(map.containsKey(list2[i]) && (map.get(list2[i]) + i ) <= min)
            {
                if(min > (map.get(list2[i]) + i))
                {
                    res.clear();
                    min = map.get(list2[i])+i;
                }
                
                res.add(list2[i]);
                
            }
        }
        return res.toArray(new String[0]);
        
    }
}