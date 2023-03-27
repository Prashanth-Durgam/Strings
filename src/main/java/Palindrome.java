//Write a Java Program to Check if Input String is Palindrome.
public class Palindrome {
    public static void main(String[] args) {
        String str = "aassaa";
        String rev ="";
        for (int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("the Given String is Palindrome:  "+str);
        }else {
            System.out.println("the Given String is not a Palindrome:"+str);
        }
    }
}
