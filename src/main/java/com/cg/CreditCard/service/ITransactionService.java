package com.cg.CreditCard.service;

import java.util.List;

import com.cg.CreditCard.entity.Transaction;

public interface ITransactionService {
	Transaction addTransaction(Transaction transaction);
	Transaction removeTransaction(long id);
	Transaction updateTransaction(long id,Transaction transaction);
	Transaction getTransactionDetails(long id);
	List<Transaction> getAllTransactions();
}
