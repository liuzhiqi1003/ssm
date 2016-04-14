package cn.lzq.ssm.controller;

import cn.lzq.ssm.po.User;
import cn.lzq.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuzhiqi on 2016/4/9.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("findUserById.action")
    public ModelAndView findUserByid (@RequestParam int id) throws Exception{
        User user = userService.findUserById(id);
        ModelAndView mdv = new ModelAndView();
        mdv.setViewName("user");
        mdv.addObject("user",user);
        return mdv;
    }

    @RequestMapping("addUser.action")
    public String addUser (HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = new User();
        String name = (String) request.getAttribute("name");

        System.out.println("name = " + name);

//        System.out.println("user = " + user);
//        userService.addUser(user);
        return null;
    }
}
