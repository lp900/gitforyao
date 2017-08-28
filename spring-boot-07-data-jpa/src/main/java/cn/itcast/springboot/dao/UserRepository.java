package cn.itcast.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.itcast.springboot.pojo.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByUserNameLikeOrderByAgeDesc(String userName);
}
