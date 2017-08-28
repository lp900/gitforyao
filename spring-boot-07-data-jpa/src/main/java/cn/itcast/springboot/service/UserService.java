package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.pojo.User;

public interface UserService {
	/**
	 * 根据名称模糊查询并按年龄降序排序
	 * @param userName 名称
	 * @return
	 */
	public List<User> findByUserNameLikeOrderByAgeDesc(String userName);
	
	/**
	 * 根据id更新用户信息
	 * @param user 用户
	 * @return
	 */
	public User updateById(User user);

}
