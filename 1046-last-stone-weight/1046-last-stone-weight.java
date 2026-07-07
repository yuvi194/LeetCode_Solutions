class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : stones) {
            maxHeap.add(n);
        }
        while (maxHeap.size() > 1) {
            maxHeap.add(maxHeap.poll()- maxHeap.poll()); 
        }
        if (maxHeap.isEmpty()) {
            return 0;
        } else {
            return maxHeap.peek();
        }
    }
}