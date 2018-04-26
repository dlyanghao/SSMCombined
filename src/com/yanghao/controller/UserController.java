package com.yanghao.controller;

import com.yanghao.pojo.User;
import com.yanghao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /*原始方法模型*/
    /*@RequestMapping("user")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = userService.getUserList();
        System.out.println(userList);
        modelAndView.addObject("msg","你好世界");
        modelAndView.setViewName("/WEB-INF/view/index.jsp");
        return modelAndView;
    }*/

    /*视图解析器配置前后缀后视图名称简化*/
    /*@RequestMapping("user")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = userService.getUserList();
        System.out.println(userList);
        modelAndView.addObject("msg","你好世界");
        modelAndView.setViewName("index");
        return modelAndView;
    }*/

   /*获得页面请求过来的参数，方法传参为名称相同的普通类型*/
   /*@RequestMapping("login")
   public ModelAndView hello(String username,String password){
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.addObject("username",username);
       modelAndView.addObject("password",password);
       modelAndView.setViewName("index");
       return modelAndView;
   }*/

    /*获取页面传过来的参数，方法传参为一个pojo对象*/
    /*@RequestMapping("login")
    public ModelAndView hello(User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username",user.getUsername());
        modelAndView.addObject("password",user.getPassword());
        modelAndView.setViewName("index");
        return modelAndView;
    }*/

    /*解决方法参数与请求参数名称不一致的问题*/
    /*@RequestMapping("login")
    public ModelAndView hello(@RequestParam(value = "name",required = true) String username, @RequestParam(value = "pwd",required = true) String password){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username",username);
        modelAndView.addObject("password",password);
        modelAndView.setViewName("index");
        return modelAndView;
    }*/

    /*使用Model/ModelMap简化操作*/
    /*@RequestMapping("login")
    public String hello(String username, String password,Model model){

        model.addAttribute("username",username);
        model.addAttribute("password",password);
        return "index";
    }*/

    /*@RequestMapping("login")
    public String hello(String username, String password,ModelMap modelMap){

        modelMap.addAttribute("username",username);
        modelMap.addAttribute("password",password);
        return "index";
    }*/

    /*自定义参数的绑定，使用场景：请求参数由于存在多种规则而无法由SpringMVC封装，需要开发人员定制*/
    @RequestMapping("date")
    public String hello(Date date,Model model){
        System.out.println("测试日期转换器："+date);
        return "index";
    }


}
