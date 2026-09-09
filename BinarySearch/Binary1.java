public class Binary1 {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10,12,14,18,34};
        int[] arr1={34,18,14,12,10,8,6,4,2};
        int target =18;
        System.out.println("The element is at "+search(arr, target)+" index in ascending order");
        System.out.println("The element is at "+agnoSearch(arr1, target)+" index in descending order");
    }
    
    static int search(int[] arr, int target ){
        int l=0;int r= arr.length-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            //  cant do (r+l)/2 since the start and end thing might exceed the range of the int type 
            if(target<arr[mid]){
                r=mid-1;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
    //When we dont know if the array is in Ascending or Descending order 
    // Order agnostic Binary Search

    static int agnoSearch(int[] arr, int target){
        int l=0; int r=arr.length-1;
        // to find the sorting order (ascend or descend)
        boolean isAsc= arr[l]<arr[r];
        while(l<=r){
            int mid= l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                r=mid-1;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            }
            else{
                if(target>arr[mid]){
                r=mid-1;
                }
            else if(target<arr[mid]){
                l=mid+1;
                }
            }
        }
        return -1;
    }
}


//best case: O()
//worst case: O()

//javac Binary1.java
//java Binary1