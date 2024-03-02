package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers.
 */
public class IntegerSet {

    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<>();

    // Default Constructor
    public IntegerSet() {
    }

    // Constructor if you want to pass in already initialized set
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     *
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Returns true if the two sets are equal, false otherwise.
     *
     * @param o the object to be compared
     * @return true if the sets are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return set.containsAll(that.set) && that.set.containsAll(set);
    }

    /**
     * Returns true if the set contains the specified value, otherwise false.
     *
     * @param value the value to be checked for existence in the set
     * @return true if the set contains the value, otherwise false
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set; Throws an IntegerSetException if the set is empty.
     *
     * @return the largest element in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int largest = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) > largest) {
                largest = set.get(i);
            }
        }
        return largest;
    }

    /**
     * Returns the smallest item in the set; Throws an IntegerSetException if the set is empty.
     *
     * @return the smallest element in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int smallest = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) < smallest) {
                smallest = set.get(i);
            }
        }
        return smallest;
    }

    /**
     * Adds an item to the set if it's not already present.
     *
     * @param item the item to be added to the set
     */
    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it's present.
     *
     * @param item the item to be removed from the set
     */
    public void remove(int item) {
        if (contains(item)) {
            set.remove(Integer.valueOf(item));
        }
    }

    /**
     * Performs a union operation with another IntegerSet.
     *
     * @param intSetb the IntegerSet to be unioned with this set
     */
    public void union(IntegerSet intSetb) {
        for (int value : intSetb.set) {
            if (!contains(value)) {
                set.add(value);
            }
        }
    }

    /**
     * Performs an intersection operation with another IntegerSet.
     *
     * @param intSetb the IntegerSet to be intersected with this set
     */
    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<>();
        for (int value : set) {
            if (intSetb.contains(value)) {
                intersection.add(value);
            }
        }
        set = intersection;
    }

    /**
     * Performs a set difference operation with another IntegerSet.
     *
     * @param intSetb the IntegerSet to be differenced with this set
     */
    public void diff(IntegerSet intSetb) {
        for (int value : intSetb.set) {
            set.remove(Integer.valueOf(value));
        }
    }

    /**
     * Performs a set complement operation with another IntegerSet.
     *
     * @param otherSet the IntegerSet to complement this set
     */
    public void complement(IntegerSet otherSet) {
        // Create a new IntegerSet to hold the result
        IntegerSet complementSet = new IntegerSet();

        // Copy the current set to the complementSet
        complementSet.union(otherSet);

        // Perform difference operation (otherSet - this)
        complementSet.diff(this);

        // Assign the complementSet to this set
        this.set = complementSet.set;
    }

    /**
     * Returns true if the set is empty, false otherwise.
     *
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     *
     * @return a string representation of the set
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
