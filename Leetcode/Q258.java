public class Q258 {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        return addDigits(sumAdd(num));
    }
       public int sumAdd(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumAdd(n/10);
        
       }
}
