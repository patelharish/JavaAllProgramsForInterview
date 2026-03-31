package Array.DSA;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "@ M, a d,@am*";
        System.out.println(isPalindrone(str));
    }

    private static boolean isPalindrone(String str) {
        char[] c = str.toCharArray();
        int left = 0;
        int right = c.length-1;

        while(left < right){
            //skipping special, space etc from the left
            while(left < right && !Character.isLetterOrDigit(c[left])){
                left++;
            }
            //skipping special, space etc from the right
            while(left < right && !Character.isLetterOrDigit(c[right])){
                right--;
            }
            // comparing left and right characters if not equals then returning false
            if(Character.toLowerCase(c[left]) != Character.toLowerCase(c[right])){
                return false;
            }
            // incrementing left characters
            left++;
            // decrementing right characters
            right--;
        }
        // returning if all characters are same
        return true;
    }
}
