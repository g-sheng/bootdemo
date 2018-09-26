package smm.springboot.service;

import smm.springboot.dto.UserDTO;


public interface UserService {
	
	 void insert(UserDTO user);

	 void update(UserDTO user);

	 UserDTO find(int id);

	 void delete(int id);
}
