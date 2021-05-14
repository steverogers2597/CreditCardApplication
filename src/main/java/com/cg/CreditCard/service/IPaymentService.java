package com.cg.CreditCard.service;

import com.cg.CreditCard.entity.Payment;

public interface IPaymentService {
	Payment addPayment(Payment payment);
	Payment removePayment(long id);
	Payment updatePayment(long id,Payment payment);
	Payment getPayment(long id);
}
