package com.cg.CreditCard.service;

import java.util.List;

import com.cg.CreditCard.entity.CreditCard;

public interface ICreditCardService {
	CreditCard addCreditCard(CreditCard creditCard);
	CreditCard removeCreditCard(long cardId);
	CreditCard updateCreditCard(long cardId,CreditCard card);
	CreditCard getCreditCard(long cardId);
	List<CreditCard> getAllCreditCards();
	
}
