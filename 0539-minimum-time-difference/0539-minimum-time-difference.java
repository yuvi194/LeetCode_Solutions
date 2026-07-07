class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3, 5));
            minutes.add(h * 60 + m);
        }
        Collections.sort(minutes);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < minutes.size(); i++) {
            min = Math.min(min, minutes.get(i) - minutes.get(i - 1));
        }
        int wrapAround = (minutes.get(0) + 1440) - minutes.get(minutes.size() - 1);
        min = Math.min(min, wrapAround);
        return min;
    }
}