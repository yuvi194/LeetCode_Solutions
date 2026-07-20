class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        Arrays.sort(products);
        int l = 0;
        int r = products.length - 1;
        for (int i = 0; i < searchWord.length(); i++) {
            char c = searchWord.charAt(i);
            while (l <= r && (products[l].length() <= i || products[l].charAt(i) != c)) {
                l++;
            }
            while (l <= r && (products[r].length() <= i || products[r].charAt(i) != c)) {
                r--;
            }
            List<String> current = new ArrayList<>();
            for (int j = 0; j < 3 && l + j <= r; j++) {
                current.add(products[l + j]);
            }
            res.add(current);
        }
        return res;
    }
}