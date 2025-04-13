package StringsConcepts;

public class StringAllUsages {
    public static void main(String[] args) {
        // strings are immutable we cannot change
        // creating strings using string literal which is stored into string pool under the heap memory
        String str1 = "Harish Patel"; // str(reference) : heap memory, Harish Patel(object) : string pool
        String str2 = "Harish Patel";

        // creating strings using new keyword which is going into heap area
        String str3 = new String("Harish Patel");
        String str4 = new String("Harish Patel");

        // live example of these two string objects are in different memory locations
        // equals() → compares content
        System.out.println("Content equal? " + str1.equals(str3));  // true
        // == → compares references
        System.out.println("Same memory location? " + (str1 == str3));  // false

        System.out.println(System.identityHashCode(str1)); // 1922154895
        System.out.println(System.identityHashCode(str2)); // 1922154895 str1 and str2 pointing only one object location
        System.out.println(System.identityHashCode(str3)); // 883049899
        System.out.println(System.identityHashCode(str4)); // 2093176254

        // important methods of strings
        System.out.println(str1.length()); // checks string length : 12
        System.out.println(str1.charAt(4)); // print character with index of 4 i.e. : s
        // substring(start index, end index)
        System.out.println(str1.substring(7,12)); // starting index is 0 always remembered
        System.out.println(str1.contains("Patel")); // true
        System.out.println(str1.indexOf("P")); // 7
        //replace(old, new)
        System.out.println(str1.replace('H','G')); //Garish Patel
        // trim() removes white spaces from start, end not between like "  harish patel "
        String str5 = "  harish patel ";
        System.out.println(str5.trim()); // harish patel

        //split(delimiter) convert string to string array basis on delimiter
        String[] strArray = str3.split(" "); // [Harish, Patel]
        for(String i : strArray){
            System.out.print(i+" "); // Harish Patel
        }
        System.out.println();
        System.out.println(strArray[0]); // Harish
        System.out.println(strArray[1]); // Patel

        // String Comparison
        String a = "apple";
        String b = "Apple";
        System.out.println(a.equals(b));// false
        System.out.println(a.equalsIgnoreCase(b)); //true

       // StringBuilder and StringBuffer
       // When you need to modify strings often (like in loops), use:
        // StringBuilder (faster, not thread-safe)
        //StringBuffer (slower, thread-safe)

        StringBuilder sb = new StringBuilder(str4);
        System.out.println(sb); // Harish Patel
        System.out.println(sb.capacity()); // 28
        System.out.println(sb.append(" Katni")); // Harish Patel Katni
        System.out.println(sb.insert(6," rkh")); //Harish rkh Patel Katni
        System.out.println(sb.length()); //22
        System.out.println(sb.reverse()); // letaP hsiraH


        // best practices to use of automation
        String price = "$42,000 ";
        String cleanedPrice = price.replaceAll("\\$","").replaceAll(",","").trim();
        System.out.println("clean unexpected things: "+cleanedPrice); // 42000
        System.out.println(cleanedPrice.getClass().getSimpleName()); // String, note: thsese methods only works for objects not primitive data types


        //Convert Cleaned String to Number
        int numericPrice = Integer.parseInt(cleanedPrice);
        System.out.println("converted to number: "+numericPrice); // 42000
        Object obj = numericPrice;
        System.out.println(obj.getClass().getSimpleName()); // Integer

        // Extract Digits Only from a String
        String raw = "Total: $1,250.99";
        String digitsOnly = raw.replaceAll("[^0-9.]", "");
        System.out.println(digitsOnly); // Output: 1250.99

        //Extract Specific Part of a String most important
        String fullText = "Order ID: 12345 - Status: Delivered";
        String num = fullText.split("-")[0].split(":")[1].trim();
        System.out.println(num); // Output: 12345

        // Get Only Alphabetic or Alphanumeric Characters
        String messyText = "Product#123!";
        String clean = messyText.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(clean); // Output: Product123
    }

}
