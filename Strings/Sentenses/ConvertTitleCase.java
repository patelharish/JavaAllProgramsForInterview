package Strings.Sentenses;
public class ConvertTitleCase {
    public static void main(String[] args) {
        String word = "my name is khan";
        String[] str = word.split(" ");
        StringBuilder titleCase = new StringBuilder();

        //enhanced loop
        for(String words : str){
            titleCase.append(Character.toUpperCase(words.charAt(0)))
                    .append(words.substring(1))
                    .append(" ");
        }
        System.out.println(titleCase);

        //without using in build method
        String titleCase2 = "";
        for(String w : str){
            for(int i=0; i<w.length(); i++) {
                titleCase2 += Character.toUpperCase(w.charAt(0));
                titleCase2 += w.substring(1);
                break;
            }
            titleCase2 += " ";
        }
        System.out.println(titleCase2);
    }
}
