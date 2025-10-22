public class StringReverser {

    // Recursive method to reverse a string
    public static String reverseString(String text) {
        // Base case: if the string is empty or has one character
        if (text == null || text.length() <= 1) {
            return text;
        }
        
        // Recursive step:
        // Take the last character and add the reversed remainder
        System.out.println(text);

        return reverseString(text.substring(1)) + text.charAt(0);
    }

    // Test the function
    public static void main(String[] args) {
        String input = "ContentOptimizer";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
