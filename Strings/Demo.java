package Strings;

public class Demo {
        public static void main(String[] args) {

            String str = "Madam";
            str = str.toLowerCase();
            String actual = str;
            //System.out.println(str);

            StringBuffer sb = new StringBuffer(str);
            StringBuffer str2 = sb.reverse();
            System.out.println(str2);

            String reverse = str2.toString();

            if(actual.equals(reverse)){
                System.out.println("palim");
            }else{
                System.out.println("not palim");
            }
        }
    }

