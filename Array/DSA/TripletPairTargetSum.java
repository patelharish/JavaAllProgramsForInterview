package Array.DSA;

public class TripletPairTargetSum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        int target = 10;
        int n = num.length;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(num[i] + num[j] + num[k] == target){
                        System.out.println(num[i]+"+"+num[j]+"+"+num[k]+"="+target);
                    }
                }
            }
        }
    }
}
