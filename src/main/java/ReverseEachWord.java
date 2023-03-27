//Write a Java Program to Reverse Each Word of a String .

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "My name is kohli and i am a cricketer";
        String words[] = str.split(" ");
        String rev ="";
        for (int i=0; i<words.length; i++){
            StringBuffer sb = new StringBuffer();
            sb.append(words[i]);
            sb.reverse();
            if(i!= words.length-1){
                rev= rev+sb+" ";
            }
            else {
                rev = rev+sb;
            }
        }
        System.out.println(rev);
    }
}
