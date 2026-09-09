
public class Bin {

    // Recursive Linear Search
    static int linearSearch(int[] arr, int n, int key) {

        if (n == 0)
            return -1;

        if (arr[n - 1] == key)
            return n - 1;

        return linearSearch(arr, n - 1, key);
    }

    // Recursive Binary Search
    static int binarySearch(int[] arr, int low, int high, int key) {

        if (low > high)
            return -1;

        int mid = low+(high-low) / 2;

        if (arr[mid] == key)
            return mid;

        if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);

        return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 15, 19, 23};

        int key = 15;

        int result1 = linearSearch(arr, arr.length, key);

        if (result1 != -1)
            System.out.println("Linear Search: Element found at index " + result1);
        else
            System.out.println("Linear Search: Element not found");

        int result2 = binarySearch(arr, 0, arr.length - 1, key);

        if (result2 != -1)
            System.out.println("Binary Search: Element found at index " + result2);
        else
            System.out.println("Binary Search: Element not found");
    }
}
