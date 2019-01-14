public class Main {

    public static void main(String[] args) {
	// write your code here

        String phrase = "A man, a plan, a canal, Panama"; // insert potential palindrome here
        boolean palindrome = false, spaces;
        int len = phrase.length();
        int subtracter = len - 1;
        int adder = 0;
        String backwards = "";
        String character = "";
        String forwards = "";

        do {
            character = phrase.substring(adder,adder+1);
            switch(character) {
                case " ":
                    break;
                case ",":
                    break;
                case ":":
                    break;
                default:
                    forwards = forwards + character;
            }
            adder++;
        } while (adder < len);

        do {
            character = phrase.substring(subtracter,subtracter+1);
            switch(character) {
                case " ":
                    break;
                case ",":
                    break;
                case ":":
                    break;
                default:
                    backwards = backwards + character;
            }
            subtracter--;
        } while (subtracter >= 0);

        if (backwards.equalsIgnoreCase(forwards)) {
            palindrome = true;
        }

        System.out.println("Is '" + phrase + "' a palindrome?\n" + palindrome);
    }
}
