package cn.mao.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mao.common.JsonResponseMsg;
import cn.mao.model.User;
import cn.mao.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("one")
	@ResponseBody
	public JsonResponseMsg findByuserId(String userId) {
		JsonResponseMsg result = new JsonResponseMsg();
		if (userId == null) {
			return result.fill(JsonResponseMsg.CODE_FAIL, "参数错误");
		}
		User user = userService.findByUserId(Integer.parseInt(userId));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", user);
		return result.fill(JsonResponseMsg.CODE_SUCCESS, "查询成功", map);

	}

	@RequestMapping("/login.do")
	public String clientLogin(HttpSession httpSession, String username, String password) {

		if (username.equals("yuan") && password.equals("123456")) {
			// 登陆成功
			httpSession.setAttribute("username", username);
			return "forward:clientsList.action";
		} else {
			// 登陆失败
			return "forward:login.jsp";
		}
	}

}
