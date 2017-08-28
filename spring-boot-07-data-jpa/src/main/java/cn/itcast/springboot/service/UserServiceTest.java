package cn.itcast.springboot.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.springboot.Application;
import cn.itcast.springboot.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)//指定引导类
public class UserServiceTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void testFindByUserNameLikeOrderByAgeDesc() {
		List<User> list = userService.findByUserNameLikeOrderByAgeDesc("%雷%");
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testUpdateById() {
		User user = new User();
		user.setId(7L);
		user.setUserName("传智播客");
		user.setAccount("itcast");
		user.setGender(0);
		user.setAge(100);
		
		User tmp = userService.updateById(user);
		System.out.println(tmp);
	}

	
}
