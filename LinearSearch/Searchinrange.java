package LinearSearch;

public class Searchinrange {
    public static void main(String[] args) {
        int []arr= {18,12,-7,3,14,2,28,4,42,6};
        int target =4;
        System.out.println(search(arr, target, 2, 8));

    }
    static int search(int arr[], int target, int beg, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=beg;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
