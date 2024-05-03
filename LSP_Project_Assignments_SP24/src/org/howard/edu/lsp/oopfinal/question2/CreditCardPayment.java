package org.howard.edu.lsp.oopfinal.question2;


//Concrete implementation of PaymentStrategy for credit card payments
class CreditCardPayment implements PaymentStrategy {
 private String creditCardNumber; // Credit card number

 // Constructor requiring credit card number
 public CreditCardPayment(String creditCardNumber) {
     this.creditCardNumber = creditCardNumber;
 }

 // Implementation of pay method for credit card payment
 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using credit card " + creditCardNumber);
 }
}
