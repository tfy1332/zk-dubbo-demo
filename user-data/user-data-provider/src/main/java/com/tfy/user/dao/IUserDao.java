/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.tfy.user.dao;


import com.tfy.common.persistence.annotation.MyBatisDao;
import com.tfy.user.model.User;

import java.util.List;

/**
 * 用户DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface IUserDao  {

	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public User get(String id);




	/**
	 * 查询所有数据列表
	 * @param entity
	 * @return
	 */
	public List<User> findAllList(User entity);



	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	public int insert(User entity);

	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public int update(User entity);

	/**
	 * 删除数据（一般为逻辑删除，更新del_flag字段为1）
	 * @param id
	 * @see public int delete(T entity)
	 * @return
	 */
	@Deprecated
	public int delete(String id);
}
