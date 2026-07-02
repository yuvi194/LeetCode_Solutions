class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!s.isEmpty() && prices[i]<=prices[s.peek()]){
                int j=s.pop();
                prices[j]=prices[j]-prices[i];
            }
            s.push(i);
        }
        return prices;
    }
}