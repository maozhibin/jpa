package cn.mao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.mao.dao.UserDao;
import cn.mao.model.User;

@Component
public class UserService {
	@Autowired
	private UserDao userDao;

	public User findByUserId(Integer userId) {
		return userDao.findByUserId(userId);
	}
}
