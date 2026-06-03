package Array.DSA;

public class BinarySearch {
    public static void main(String[] args) {
       int[] num = {22,23,24,25,26};
       int target = 26;
        System.out.println(binarySearch(num,target));
    }
    public static int binarySearch(int[] num, int target){
        int low = 0;
        int high = num.length-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
