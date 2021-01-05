package com.vastika.uis.service;

import java.util.List;

import com.vastika.uis.model.User;

public interface UserService {
	
	
		
		int saveUserInfo(User user);

		int updateUserInfo(User user);
		
		int deleteUserInfo(int id);  //delete hami id k base ma garxau so id matra lid hunxa
	
		List<User>getAllUserInfo();
		
		User getUserByID(int id);
		
		
		
		
		
		
}


