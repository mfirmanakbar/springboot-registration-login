package com.mfirmanakbar.loginpro.service;

import com.mfirmanakbar.loginpro.entity.UserEntity;

public interface UserService {
	void save(UserEntity user);

	UserEntity findByUsername(String username);
}
