package smm.springboot.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import smm.springboot.dto.UserDTO;
import smm.springboot.mapper.UserMapper;
import smm.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public void insert(UserDTO user) {
		userMapper.insert(user);
	}

	@Override
	public void update(UserDTO user) {
		userMapper.update(user);
	}

	@Override
	public UserDTO find(int id) {
		return userMapper.find(id);
	}

	@Override
	public void delete(int id){
		userMapper.delete(id);
	}
}
