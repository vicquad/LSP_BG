package org.howard.edu.lsp.midterm.question2;

/**
 * Class to test the functionality of IntegerRange.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Create two IntegerRange objects for testing
        IntegerRange range1 = new IntegerRange(0, 10);
        IntegerRange range2 = new IntegerRange(5, 15);

        // Test the contains method
        System.out.println("Does range1 contain 5? " + range1.contains(5)); 
        System.out.println("Does range1 contain 15? " + range1.contains(15)); 
        System.out.println("Does range1 contain 0? " + range1.contains(0));
        System.out.println("Does range1 contain 10? " + range1.contains(10));
        
       

        // Test the overlaps method
        System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2)); // true

        // Test the size method
        System.out.println("Size of range1: " + range1.size()); // 11

        // Test the equals method
        System.out.println("Are range1 and range2 equal? " + range1.equals(range2)); // false
    }
}
