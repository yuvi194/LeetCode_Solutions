class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        search(1, n, k, new ArrayList<>(), res);
        return res;
    }

    private void search(int start, int n, int k, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n - (k - list.size()) + 1; i++) {
            list.add(i);                            
            search(i + 1, n, k, list, res);  
            list.remove(list.size() - 1);       
        }
    }
}