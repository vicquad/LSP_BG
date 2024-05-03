package org.howard.edu.lsp.oopfinal.question2;

//Class representing a shopping cart
class ShoppingCart {
private PaymentStrategy paymentStrategy; // Payment strategy instance

 // Method to set payment strategy
 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 // Method to checkout with provided payment amount
 public void checkout(double amount) {
     paymentStrategy.pay(amount); // Call pay method of the provided payment strategy
 }
}
