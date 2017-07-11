package com.tfy.user.service.impl;


import com.tfy.user.dao.IUserDao;
import com.tfy.user.model.User;
import com.tfy.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**用户Service 实现
 * Created by tanfy on 2017/7/10 0015.
 */
@Service("userService")
public class UserServiceImpl  implements IUserService {

    @Autowired
    private IUserDao userDao;

    public void save(User entity) {
        userDao.insert(entity);
    }

    public User get(String id) {
        return userDao.get(id);
    }

    public int update(User entity) {
        return userDao.update(entity);
    }

    public void delete(User entity) {
        userDao.delete(entity.getId());
    }

    public List<User> findList(User t) {
        return userDao.findAllList(t);
    }
}
