package com.cg.CreditCard.service;

import java.util.List;

import com.cg.CreditCard.entity.Account;

public interface IAccountService {
	Account addAccount(Account account);
	Account removeAccount(long id);
	Account updateAccount(long id,Account account);
	Account getAccount(long id);
	List<Account> getAllAccounts();

}
