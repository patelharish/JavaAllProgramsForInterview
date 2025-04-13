package Ptterns.Triangle;

public class Demo {
    public static void main(String[] args) {
        String str = "Opkey Automation Tool";
        String[] str2 = str.split(" ");
        String first = str2[0];
        String Second = str2[1];
        String Third = str2[2];


        for(int i= first.length()-1; i>=0; i--){
            System.out.print(first.charAt(i)+"");
        }
        System.out.print(" ");
        for(int i= Second.length()-1; i>=0; i--){
            System.out.print(Second.charAt(i)+"");
        }
        System.out.print(" ");
        for(int i= Third.length()-1; i>=0; i--){
            System.out.print(Third.charAt(i));
        }

        System.out.println();

        for (int i = 0; i < str2.length; i++) {
            StringBuilder sb = new StringBuilder(i);
            System.out.print(sb.reverse()+" ");
        }



    }
}
