class Solution {
    public double myPow(double x, int n) {
        //return Math.pow(x,n);
       long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        double pro = x;
        while (N > 0) {
            if ((N % 2) == 1) {
                result *= pro;
            }
            pro *= pro;
            N /= 2;
        }
        
        return result;
    }
}