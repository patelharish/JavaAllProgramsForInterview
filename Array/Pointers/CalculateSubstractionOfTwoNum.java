package Array.Pointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculateSubstractionOfTwoNum {
    public static void main(String[] args) {
        // {2,4,7,11,18,20} = {2,3,4,7,2}
        int[] n = {2,4,7,11,18,20};
        List<Integer> lis = new ArrayList<>();
        for(int i=0; i<n.length-1; i++){
            lis.add(n[i+1]-n[i]);
        }
        System.out.println(lis.toString());
        // find max subtraction num
        Collections.sort(lis, Collections.reverseOrder());
        System.out.println(lis.get(0));
    }
}
