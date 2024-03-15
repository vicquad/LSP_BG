package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    /**
     * Encrypts a given string by rearranging characters.
     * 
     * @param text the string to be encrypted
     * @return the encrypted string
     */
    public static String encrypt(String text) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Removing whitespace and punctuation
        String cleanedText = removeWhitespaceAndPunctuation(text);
        
        for (int i = 0; i < cleanedText.length(); i++) {
            if (isEvenIndex(i)) {
                evenChars.append(cleanedText.charAt(i));
            } else {
                oddChars.append(cleanedText.charAt(i));
            }
        }
        return evenChars.append(oddChars).toString();
    }

    // Method to remove whitespace and punctuation from the text
    private static String removeWhitespaceAndPunctuation(String text) {
        return text.replaceAll("\\s+","").replaceAll("\\p{Punct}","");
    }

    // Method to check if the index is even
    private static boolean isEvenIndex(int index) {
        return index % 2 == 0;
    }

    public static void main(String[] args) {
        // Testing the method with the given example
        String result = encrypt("I love CSCI363");
        System.out.println(result); // Expected output: "IoesI6LvCC33"
    }
}
