package org.howard.edu.lsp.oopfinal.question2;

//Concrete implementation of PaymentStrategy for PayPal payments
class PayPalPayment implements PaymentStrategy {
private String emailAddress; // PayPal email address

 // Constructor requiring PayPal email address
 public PayPalPayment(String emailAddress) {
     this.emailAddress = emailAddress;
 }

 // Implementation of pay method for PayPal payment
 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using PayPal account " + emailAddress);
 }
}
