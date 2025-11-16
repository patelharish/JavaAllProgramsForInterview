package Array;

public class PrintAllSubarrays {
    public static void main(String[] args) {
        int[] num = {2,4,5,1,9,7};
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                System.out.print("{");
                for(int k=i; k<=j; k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println("}");
            }
        }
    }

}
