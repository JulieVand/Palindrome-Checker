public class Palindrome {
    
    boolean isPalindrome(String x){
        if (x.length() < 2){
            return true;
        }
        if (x.charAt(0) == x.charAt(x.length() - 1)){
            return isPalindrome(x.substring(1, (x.length() - 1)));
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.print("Please state a word: ");
        String input = System.console().readLine();
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome(input) == true){
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is NOT a palindrome.");
        }
    }
}
