package cn.mao.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.mao.model.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUserId(Integer userId);

}
