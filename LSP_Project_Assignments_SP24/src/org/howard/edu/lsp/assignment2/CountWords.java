

package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        
        try {
            // Get the file path relative to the package
            InputStream inputStream = CountWords.class.getResourceAsStream("words.txt");
            if (inputStream == null) {
                throw new FileNotFoundException("words.txt not found");
            }
            Scanner scanner = new Scanner(inputStream);
            
            // Echo the input file to stdout
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            
            scanner.close();
            scanner = new Scanner(CountWords.class.getResourceAsStream("words.txt")); // Reopen the file for word counting

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                // Check if the word contains at least one letter
                if (word.matches(".*[a-zA-Z]+.*") && word.length() > 3) {
                    // Split words with apostrophes and add only if each part has length greater than 3
                    String[] parts = word.split("'");
                    for (String part : parts) {
                        if (part.length() > 3) {
                            wordCounts.put(part, wordCounts.getOrDefault(part, 0) + 1);
                        }
                    }
                }
            }
            
            scanner.close();
            
            // Display word counts
            for (String word : wordCounts.keySet()) {
                System.out.println(word + ": " + wordCounts.get(word));
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
