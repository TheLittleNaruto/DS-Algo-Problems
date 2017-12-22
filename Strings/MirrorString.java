// Java code to find the reverse alphabetical
// order from a given position

public class MirrorString {
 
    // Function which take the given string
    // and the position from which the reversing shall
    // be done and returns the modified string
    static String compute(String str, int n)
    {
 
        // Creating a string having reversed alphabetical order
        String reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba";
        int l = str.length();
         
        // The string up to the point specified in the question,
        // the string remains unchanged and from the point up to
        // the length of the string, we reverse the alphabetical order
        String answer = "";
        for (int i = 0; i < n; i++)
            answer = answer + str.charAt(i);
        for (int i = n; i < l; i++){
			char c = reverseAlphabet.charAt(str.charAt(i) - 'a');
			System.out.println("Character value at index " + i + " is " + c + " and reverse string position is: " + (str.charAt(i) - 'a'));
			answer = answer + c;
		}
		
        return answer;
    }
 
    // Driver function
    public static void main(String args[])
    {
        String str = "pneumonia";
        int n = 4;
        System.out.print(compute(str, n - 1));
    }
}