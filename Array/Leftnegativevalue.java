package Array;

public class Leftnegativevalue {
    public static void main(String[] args) {
        int[] num = {1,-3,5,-7,9,-2};;
        int[] result = new int[num.length];
        int index = 0;
        System.out.print("before: ");
        for(int n:num){
            System.out.print(n+",");
        }
        System.out.println();
        for(int n:num){
            if(n<0){
                result[index++] = n;
            }
        }
        for(int n:num){
            if(n>=0){
                result[index++] = n;
            }
        }
        System.out.print("After: ");
        for(int r:result){
            System.out.print(r+",");
        }
    }
}
