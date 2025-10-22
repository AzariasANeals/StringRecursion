
/**
 * Write a description of class StringReverser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringReverser
{
    public static String reverseString(String text){
        
        if(text == null || text.length() <= 1){
            return text;
        }
        
        
        /**
         *  CRAB 
         *  
         *  RAB + C
         * 
         *  (AB) + R + C
         * 
         *  (B) + A + R + C 
         *  
         *   BARC
         *   
         *   
         *   a + b = new string
         *   
         *   O(n) + O(n) 
         *   
         *   n - 1 O(n-1) O(n + n - 1) 
         *   
         *   O(n ^ 2)
         *   
         *   O(1)
         *   
         *   O(n)
         *   
         *   
         */
        System.out.println(text);
        return reverseString( text.substring(1) ) + text.charAt(0);
    }
    
    public static void main(String[] args){
        
        String text1 = "CRAB";
        String reversed1 = reverseString(text1);
        
        System.out.println("Original text 1: " + text1);
        System.out.println("Reversed text 1: " + reversed1);
        
        
        String text2 = "ContentOptimizer";
        String reversed2 = reverseString(text2);
        
        System.out.println("Original text 2: " + text2);
        System.out.println("Reversed text 2: " + reversed2);
        
        
    }
    
    
}