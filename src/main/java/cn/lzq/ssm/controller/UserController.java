package cn.lzq.ssm.controller;

import cn.lzq.ssm.po.User;
import cn.lzq.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by liuzhiqi on 2016/4/9.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("findUserByid.action")
    public ModelAndView findUserByid (@RequestParam int id) throws Exception{
        User user = userService.findUserById(id);
        ModelAndView mdv = new ModelAndView();
        mdv.setViewName("user");
        mdv.addObject("user",user);
        return mdv;
    }
}
