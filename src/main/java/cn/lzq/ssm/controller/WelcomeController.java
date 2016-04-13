package cn.lzq.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuzhiqi on 2016/4/6.
 */

@Controller
public class WelcomeController {

    @RequestMapping("welcome.action")
    public ModelAndView welcome(){

        ModelAndView m = new ModelAndView();
        m.setViewName("welcome");
        return m;
    }
}
