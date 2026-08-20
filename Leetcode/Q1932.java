class Q1932 {
    long mod =1000000007;
    public int countGoodNumbers(long n) {
        long even= (n+1)/2;
        long odd =n/2;
        long ans =power(5,even)*power (4,odd)%mod;
        return (int)ans;
    }
    public long power(long a, long n){
        if(n==0){
            return 1;
        }
        long half =power (a, n/2);
        if(n%2==0){
            return half* half % mod;
        }
        else{
            return half * half % mod *a % mod;
        }
    }
}