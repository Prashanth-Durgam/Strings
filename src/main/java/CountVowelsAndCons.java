//Write a Java Program to Count Vowels and Consonants in a String.

public class CountVowelsAndCons {
    public static void main(String args[]){
        String str = "aeiou";
        int vowelsCount = 0;
        int consonentCount = 0;
        String uString = str.toUpperCase();
        System.out.println(uString);
        char c[] = uString.toCharArray();
        for (int i=0; i<c.length; i++){
            if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                vowelsCount++;
            }else {
                consonentCount++;
            }
        }
        System.out.println("Number of vowels in a String is:"+vowelsCount);
        System.out.println("Number of Consonets in a String is:"+consonentCount);

    }
}
