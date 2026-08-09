public class Maxvalinarray {
    public static void main(String[] args) {
        int[] arr= {1,43,5,89,17};
        System.out.println(max(arr));
        System.out.println(maxinrange(arr,0,2));
    }


    static int max(int[] arr){
        if (arr.length ==0) return -1;
        int max =Integer.MIN_VALUE ;
        int i;
        for(i=0;i<arr.length;i++){  
            max= Math.max(max,arr[i]);
        }
        return max;
    }

// for cases like when array is null 
    static int maxinrange(int[] arr, int left, int right){
        if(arr==null|| arr.length==0)return -1;
        if(left>right|| left<0|| right>arr.length)return -1;
        
        int max= arr[left];
        for(int i=left;i<right;i++){
            max= Math.max(max,arr[i]);
        }
        return max;
    }
        

    }

