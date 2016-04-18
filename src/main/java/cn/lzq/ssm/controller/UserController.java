package cn.lzq.ssm.controller;

import cn.lzq.ssm.po.ResponJson;
import cn.lzq.ssm.po.User;
import cn.lzq.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuzhiqi on 2016/4/9.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("findUserById.action")
    public ModelAndView findUserByid (int id) throws Exception{
        User user = userService.findUserById(id);
        ModelAndView mdv = new ModelAndView();
        mdv.setViewName("user");
        mdv.addObject("user",user);
        return mdv;
    }

    @RequestMapping("addUser.action")
    @ResponseBody
    public ResponJson addUser (User user) throws Exception {
        ResponJson json = new ResponJson();
        json.setSuccess(true);
        json.setCode("000");
        json.setMsg("操作成功！");
        userService.addUser(user);
        return json;
    }

    @RequestMapping("addUserPage.action")
    public String addUserPage() throws Exception{
        return "user";
    }

    @RequestMapping("userListPage.action")
    public String userListPage() throws Exception{
        return "userList";
    }

    @RequestMapping("findAllUser.action")
    @ResponseBody
    public List<User> findAllUser() throws Exception{
        return userService.findAllUser();
    }

    @RequestMapping("updateUserPage.action")
    public ModelAndView updateUserPage(int id) throws Exception{
        ModelAndView mdv = new ModelAndView("userUpdate");
        User user = userService.findUserById(id);
        mdv.addObject("user",user);
        return mdv;
    }

    @RequestMapping("updateUser.action")
    @ResponseBody
    public ResponJson updateUser(User user) throws Exception{
        userService.updateUser(user);
        ResponJson json = new ResponJson();
        json.setSuccess(true);
        json.setCode("000");
        json.setMsg("操作成功！");
        return json;
    }

    @RequestMapping("deleteUser.action")
    @ResponseBody
    public ResponJson deleteUser (int id) throws Exception{
        ResponJson json = new ResponJson();
        json.setSuccess(true);
        json.setCode("000");
        json.setMsg("操作成功！");
        userService.deleteUser(id);
        return json;
    }
}
