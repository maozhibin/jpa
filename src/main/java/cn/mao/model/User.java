package cn.mao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	// CREATE TABLE `t_user` (
	// `userId` int(11) NOT NULL AUTO_INCREMENT,
	// `state` int(1) DEFAULT '0' COMMENT '0 user 1 admin',
	// `username` varchar(20) NOT NULL,
	// `password` varchar(50) NOT NULL,
	// `nickname` varchar(20) NOT NULL,
	// `email` varchar(50) NOT NULL,
	// `website` varchar(50) DEFAULT NULL,
	// `imageName` varchar(50) DEFAULT NULL,
	// PRIMARY KEY (`userId`,`username`,`nickname`),
	// UNIQUE KEY `userId` (`userId`)
	// ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

	private Integer userId;

	private Integer state;

	private String username;

	private String password;

	private String nickname;

	private String email;

	private String website;

	private String imageName;

	@Id
	@Column(name = "userid", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "state")
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "nickname")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "website")
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Column(name = "imagename")
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

}
