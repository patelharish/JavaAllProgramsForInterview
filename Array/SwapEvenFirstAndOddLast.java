package Array;

public class SwapEvenFirstAndOddLast {
    public static void main(String[] args) {
        int[] n = {12,5,6,2,9,7,4,8,1};
        int size = n.length;
        int[] n2 = new int[size];
        int index = 0;

     for(int E:n){
            if(E%2==0){
                n2[index++] = E;
            }
        }

        for(int o : n){
            if(o%2 != 0){
                n2[index++] = o;
            }
        }

        for(int num : n2){
            System.out.print(num+" ");
        }

    }
}
