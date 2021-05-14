package com.cg.CreditCard.service;

import com.cg.CreditCard.entity.User;

public interface IUserService {

	User signIn(User user);
	User signOut(User user);
	User changePassword(long id,User user);
}
