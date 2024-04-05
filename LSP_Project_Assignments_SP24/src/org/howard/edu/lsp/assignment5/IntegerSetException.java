package org.howard.edu.lsp.assignment5;

// Exception class for IntegerSet operations.
public class IntegerSetException extends Exception {

    // Unique identifier for the serializable class
    private static final long serialVersionUID = 1L;

    // Constructs an IntegerSetException with the specified detail message.
    // @param message the detail message
    public IntegerSetException(String message) {
        super(message);
    }
}
