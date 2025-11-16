package Array;

public class CountAllSubArrays {
    public static void main(String[] args) {
        int[] num = {1,3};
        long count = 0;

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                System.out.print("{");
                for(int k=i; k<=j; k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println("}");
                count++;
            }
        }
        System.out.println(count);
    }
}
