package com.tfy.user.service;


import com.tfy.user.model.User;

import java.util.List;

/**
 * 用户 User Service
 * Created by tanfy on 2017/5/15 0015.
 */
public interface IUserService  {

    /**
     * 保存数据（插入或更新）
     * @param entity
     */
    public void save(User entity);
    /**
     * 获取单条数据
     * @param id
     * @return
     */
    public User get(String id);
    /**
     * 更新数据
     * @param entity
     * @return
     */
    public int update(User entity);
    /**
     * 删除数据
     * @param entity
     */
    public void delete(User entity);

    /**
     * 查询所有数据 By tanfy 2017-07-10
     * @param t
     * @return
     */
    public List<User> findList(User t);
}
