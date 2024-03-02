package org.howard.edu.lsp.assignment4;

/**
 * The Driver class contains the main method to test the IntegerSet class.
 */
public class Driver {
    public static void main(String[] args) {
        // Creating Set1 and Set2
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(6);

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Test individual functions
        System.out.println("Testing individual functions:");

        // Test add
        set1.add(4); // Add an element to Set1
        System.out.println("After adding 4 to Set1: " + set1.toString());

        // Test remove
        set1.remove(2); // Remove an element from Set1
        set1.remove(2); // Attempt to remove an element not in Set1
        System.out.println("After removing 2 twice from Set1: " + set1.toString());

        // Test contains
        System.out.println("Set1 contains 3: " + set1.contains(3)); // Check if Set1 contains 3
        System.out.println("Set1 contains 6: " + set1.contains(6)); // Check if Set1 contains 6
        System.out.println("Set1 contains 8: " + set1.contains(8)); // Check if Set1 contains 8

        // Test length
        System.out.println("Length of Set1: " + set1.length()); // Get the length of Set1

        // Test largest and smallest
        try {
            System.out.println("Largest value in Set1: " + set1.largest()); // Get the largest value in Set1
            System.out.println("Smallest value in Set1: " + set1.smallest()); // Get the smallest value in Set1
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage()); // Handle exception if Set1 is empty
        }

        // Test operations
        System.out.println("\nTesting operations:");

        // Test union
        IntegerSet unionResult = new IntegerSet();
        unionResult.union(set1);
        unionResult.union(set2);
        System.out.println("Union of Set1 and Set2: " + unionResult.toString()); // Perform union operation

        // Test intersection
        IntegerSet intersectResult = new IntegerSet();
        intersectResult.union(set1);
        intersectResult.intersect(set2);
        System.out.println("Intersection of Set1 and Set2: " + intersectResult.toString()); // Perform intersection operation

        // Test difference
        IntegerSet diffResult = new IntegerSet();
        diffResult.union(set1);
        diffResult.diff(set2);
        System.out.println("Difference of Set1 and Set2: " + diffResult.toString()); // Perform difference operation

        // Test complement
        IntegerSet complementResult = new IntegerSet();
        complementResult.union(set1);
        complementResult.complement(set2);
        System.out.println("Complement of Set1 and Set2: " + complementResult.toString()); // Perform complement operation

        // Test equals
        System.out.println("\nTesting equals function:");
        System.out.println("Set1 equals Set2: " + set1.equals(set2)); // Check if Set1 equals Set2

        // Test toString
        System.out.println("\nTesting toString function:");
        System.out.println("Set2: " + set2.toString()); // Test the toString method of Set2
        
        // Test clear
        System.out.println("\nTesting clear function:");
        set1.clear(); // Clear Set1
        System.out.println("Set1 after clear: " + set1.toString()); // Verify Set1 is empty
    }
}
