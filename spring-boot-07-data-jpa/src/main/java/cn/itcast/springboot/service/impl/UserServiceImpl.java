package cn.itcast.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.dao.UserRepository;
import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> findByUserNameLikeOrderByAgeDesc(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserNameLikeOrderByAgeDesc(userName);
	}

	@Override
	public User updateById(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
