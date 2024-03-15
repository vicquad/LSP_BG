package org.howard.edu.lsp.midterm.question2;

/**
 * Interface representing a range of integers.
 */
public interface Range {
    /**
     * Returns true if the range contains the specified value.
     * @param value the value to check
     * @return true if value is within the range, false otherwise
     */
    boolean contains(int value);

    /**
     * Returns true if there is at least one value in common with another range.
     * @param other the other range to check for overlap
     * @return true if there is an overlap, false otherwise
     */
    boolean overlaps(Range other);

    /**
     * Returns the number of integers in the range.
     * @return the size of the range
     */
    int size();
}
