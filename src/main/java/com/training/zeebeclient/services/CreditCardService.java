package com.training.zeebeclient.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CreditCardService {

Logger LOGGER = LoggerFactory.getLogger(CreditCardService.class);

public void chargeAmount(String cardNumber, String cvc, String expiryDate, Double amount){
LOGGER.info(
"Credit card number: " + cardNumber + ", CVC: " + cvc + ", Expiry date: " + expiryDate + ", Order total: " + amount);
}
}