package org.howard.edu.lsp.oopfinal.question2;


//Concrete implementation of PaymentStrategy for Bitcoin payments
class BitcoinPayment implements PaymentStrategy {
 private String bitcoinAddress; // Bitcoin address

 // Constructor requiring Bitcoin address
 public BitcoinPayment(String bitcoinAddress) {
     this.bitcoinAddress = bitcoinAddress;
 }

 // Implementation of pay method for Bitcoin payment
 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using Bitcoin address " + bitcoinAddress);
 }
}
