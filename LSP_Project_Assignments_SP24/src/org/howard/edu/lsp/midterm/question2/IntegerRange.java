package org.howard.edu.lsp.midterm.question2;

/**
 * Implementation of the Range interface representing a range of integers.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange with the specified lower and upper bounds.
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    @Override
    public boolean overlaps(Range other) {
        return !(upperBound < ((IntegerRange)other).lowerBound || lowerBound > ((IntegerRange)other).upperBound);
    }

    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Checks if this range is equal to another range.
     * Two ranges are equal if their lower and upper bounds are the same.
     * @param obj the other object to compare
     * @return true if the ranges are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IntegerRange)) return false;
        IntegerRange other = (IntegerRange) obj;
        return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
    }
}
