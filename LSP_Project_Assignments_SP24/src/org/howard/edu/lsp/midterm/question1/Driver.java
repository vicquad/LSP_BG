package org.howard.edu.lsp.midterm.question1;

public class Driver {
    public static void main(String[] args) {
        // Testing the encrypt method from SecurityOps
        String result = SecurityOps.encrypt("I love CSCI363");
        System.out.println("Encrypted text: " + result); // Expected output: "IoesI6LvCC33"
    }
}
