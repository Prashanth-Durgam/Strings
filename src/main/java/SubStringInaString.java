//Write a Java Program to Count the Number of Occurrences of Substring in a String.

public class SubStringInaString {
    public static void main(String[] args) {
       String str = "AABBAARR";
       String subString = "AA";
       int count = 0;
       int index = 0;
       while (index<str.length()){
           index = str.indexOf(subString, index);
           if (index<0){
               break;
           }
           count++;
           index = index+subString.length();
       }
        System.out.println(count);
    }
}
