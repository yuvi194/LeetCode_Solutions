class RecentCounter {
    private HashMap<Integer, Integer> map;
    private int a; 
    private int b;
    public RecentCounter() {
        this.map = new HashMap<>();
        this.a = 0;
        this.b = 0;
    }
    
    public int ping(int t) {
        map.put(b, t);
        b++;
        while (map.get(a) < t - 3000) {
            map.remove(a);
            a++;
        }
        return b - a;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */