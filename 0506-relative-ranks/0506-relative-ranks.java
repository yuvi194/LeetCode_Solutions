class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n= score.length;
        String [] res=new String[n];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> score[b] - score[a]);
        for (int i = 0; i < n; i++) {
            maxHeap.add(i);
        }
        int rank = 1;
        while (!maxHeap.isEmpty()) {
            int i = maxHeap.poll();
            if (rank == 1) {
                res[i] = "Gold Medal";
            } else if (rank == 2) {
                res[i] = "Silver Medal";
            } else if (rank == 3) {
                res[i] = "Bronze Medal";
            } else {
                res[i] = String.valueOf(rank);
            }
            rank++;
        }
        
        return res;
    }
}