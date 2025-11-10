//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String str = args[0];
            str = str.toUpperCase();
            int num = Integer.parseInt(args[1]);
            String an = "AEFHILMNORSX";
            for (int i= 0; i<str.length();i++){
                char letter = str.charAt(i);
                if (an.indexOf(letter)!=-1){
                        System.out.println("Give me an " + str.charAt(i) +": " + str.charAt(i) + "!");
                }
                else{
                        System.out.println("Give me a " + str.charAt(i) +": " + str.charAt(i) + "!");
                }
            }
            for (int t=0; t<num;t++){
                System.out.println(str+ "!!!");
            }

        }
}
