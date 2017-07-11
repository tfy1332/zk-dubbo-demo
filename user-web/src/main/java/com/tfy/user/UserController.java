
package com.tfy.user;


import com.tfy.user.model.User;
import com.tfy.user.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户Controller
 * @author tanfy
 * @version 2017-07-10
 */
@Controller
@RequestMapping(value = "/user")
public class UserController  {
    @Autowired
    private IUserService userService;
    /**
     * 跳转到新增页面 by tanfy 2017-07-10
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = {"add", ""})
    public String add( HttpServletRequest request, HttpServletResponse response, Model model,User user) {
        if (StringUtils.isNotEmpty(user.getId())){
            User userDB =  userService.get(user.getId());
            model.addAttribute("user", userDB);
        }
        return "user/add";
    }
    /**
     * 保存页面提交的数据 by tanfy 2017-07-10
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = {"save", ""})
    public String save( HttpServletRequest request, HttpServletResponse response, Model model,User user) {
        if (StringUtils.isNotEmpty(user.getId())){
            //修改用户
            userService.update(user);
        }else{
            //新增用户
            userService.save(user);

        }
//          return "user/list";
        return "redirect: /user/list";

    }

    /**
     * 跳转到用户信息列表 by tanfy 2017-07-10
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = {"list", ""})
    public String list( HttpServletRequest request, HttpServletResponse response, Model model,User user) {

        List<User> userList =  userService.findList(user);
        model.addAttribute("userList", userList);
        model.addAttribute("hello", "tfy");
        return "user/list";
    }
    /**
     * 根据ID删除用户 by tanfy 2017-07-11
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = {"delete", ""})
    public String delete( HttpServletRequest request, HttpServletResponse response, Model model,User user) {
        userService.delete(user);
//        return "user/list";
        return "redirect: /user/list";

    }

}