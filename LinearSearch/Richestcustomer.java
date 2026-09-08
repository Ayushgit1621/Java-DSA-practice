package LinearSearch;
import java.lang.Math;
public class Richestcustomer {
    public static void main(String[] args) {
        int[][]acc={
            {1,2,3},{3,2,1},{3,4,5}
        };
        System.out.println(maxWealth(acc));
    }
    static int maxWealth(int[][]acc){
        int maxWealth=0;
        for(int person=0;person<acc.length;person++){
            int currWealth=0;
            for(int account=0;account<acc[person].length;account++){
                currWealth+=acc[person][account];
            }
            maxWealth=Math.max(currWealth,maxWealth);
        }
        return maxWealth;
    }
}
//javac LinearSearch\Richestcustomer.java
//java LinearSearch.Richestcustomer