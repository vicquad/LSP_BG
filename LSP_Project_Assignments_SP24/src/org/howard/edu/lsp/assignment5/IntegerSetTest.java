package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;




import org.junit.Test;

public class IntegerSetTest {

    // Test case for clear method
    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Adding elements to the set
        set1.add(0);
        set1.add(1);
        // Clearing the set
        set1.clear();
        // Verifying if the set is empty
        assertTrue(set1.isEmpty());
    }

   

	// Test case for length method
	@Test
    @DisplayName("Test case for length")
    public void testLength() {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Adding elements to the set
        set1.add(4);
        set1.add(5);
        // Verifying the length of the set
        assertEquals(2, set1.length());
    }

    // Test case for equals method
    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        // Creating two IntegerSet objects
        IntegerSet set1 = new IntegerSet();
        set1.add(4);
        set1.add(5);

        IntegerSet set2 = new IntegerSet();
        set2.add(4);
        set2.add(5);

        // Verifying if two sets are equal
        assertTrue(set1.equals(set2));

        // Modifying set2 and verifying equality again
        set2.add(4);
        assertTrue(set1.equals(set2));
        
        set2.add(0);
        assertFalse(set1.equals(set2));
    }

    // Test case for contains method
    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Adding elements to the set
        set1.add(0);
        // Verifying if the set contains an element
        assertTrue(set1.contains(0));
        assertFalse(set1.contains(10));
    }

    // Test case for largest method
    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Adding elements to the set
        set1.add(8);
        set1.add(9);
        // Verifying the largest element in the set
        assertEquals(9, set1.largest());

        // Verifying behavior when set is empty
        assertThrows(IntegerSetException.class, () -> new IntegerSet().largest());
    }

    // Test case for smallest method
    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Adding elements to the set
        set1.add(1);
        set1.add(2);
        // Verifying the smallest element in the set
        assertEquals(1, set1.smallest());

        // Verifying behavior when set is empty
        assertThrows(IntegerSetException.class, () -> new IntegerSet().smallest());
    }

    // Test case for add method
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Adding elements to the set
        set1.add(1);
        // Verifying if the element is added successfully
        assertTrue(set1.contains(1));
        // Adding a duplicate element
        set1.add(1);
        // Verifying that duplicates are not allowed
        assertEquals(1, set1.length());
        // Adding another element
        set1.add(2);
        // Verifying the length after adding another element
        assertEquals(2, set1.length());
    }

    // Test case for remove method
    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Adding an element to the set
        set1.add(6);
        // Removing the element
        set1.remove(6);
        // Verifying if the element is removed successfully
        assertFalse(set1.contains(6));
        // Removing a non-existent element
        set1.remove(6);  
        // Verifying the length after removing
        assertEquals(0, set1.length());
    }

    // Test case for union method
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        // Creating IntegerSet objects
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        // Adding elements to the sets
        set1.add(3);
        set1.add(7);
        set2.add(4);
        set2.add(8);
        // Performing union operation
        set1.union(set2);
        // Verifying if the union operation is correct
        assertTrue(set1.contains(3));
        assertTrue(set1.contains(4));
        assertTrue(set1.contains(7));
        assertTrue(set1.contains(8));
    }

    // Test case for intersect method
    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        // Creating IntegerSet objects
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        // Adding elements to the sets
        set1.add(10);
        set1.add(11);
        set2.add(11);
        set2.add(12);
        // Performing intersection operation
        set1.intersect(set2);
        // Verifying if the intersection operation is correct
        assertFalse(set1.contains(10));
        assertTrue(set1.contains(11));
        assertFalse(set1.contains(12));
    }

    // Test case for diff method
    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        // Creating IntegerSet objects
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        // Adding elements to the sets
        set1.add(3);
        set1.add(4);
        set2.add(4);
        set2.add(5);
        // Performing difference operation
        set1.diff(set2);
        // Verifying if the difference operation is correct
        assertTrue(set1.contains(3));
        assertFalse(set1.contains(4));
        assertFalse(set1.contains(5));
    }

    // Test case for complement method
    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        // Creating IntegerSet objects
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        // Adding elements to the sets
        set1.add(0);
        set1.add(1);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        // Performing complement operation
        set1.complement(set2);
        // Verifying if the complement operation is correct
        assertFalse(set1.contains(1));
        assertTrue(set1.contains(2));
    }

    // Test case for isEmpty method
    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Verifying if the set is initially empty
        assertTrue(set1.isEmpty());
        // Adding an element to the set
        set1.add(4);
        // Verifying if the set is not empty after adding an element
        assertFalse(set1.isEmpty());
    }

    // Test case for toString method
    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        // Creating an IntegerSet object
        IntegerSet set1 = new IntegerSet();
        // Verifying the string representation of an empty set
        assertEquals("[]", set1.toString());
        // Adding an element to the set
        set1.add(1);
        // Verifying the string representation after adding an element
        assertEquals("[1]", set1.toString());
    }
}
