class Q50 {
    public double myPow(double x, int n) {
        long N =n;
        if(N<0){
            return 1.0/recPow(x,-N);
        }
        return recPow(x,N);
    }
    double recPow(double x, long n){
        if(n==0){
            return 1.0;
        }
        double brk = recPow(x,n/2);
        if(n%2==0){
            return brk*brk;
        }
        else{
            return brk*brk*x;
        }
    }
}
