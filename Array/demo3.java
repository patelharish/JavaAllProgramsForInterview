package Array;

public class demo3 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,3,3,7,5};
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] != arr[j]){
                    System.out.print(arr[i]+",");
                    break;
                }
            }
        }

    }
}
