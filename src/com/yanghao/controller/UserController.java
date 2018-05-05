package com.yanghao.controller;

import com.yanghao.pojo.User;
import com.yanghao.pojo.Vo;
import com.yanghao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    /*@RequestMapping("date")
    public String hello(Date date,Model model){
        System.out.println("测试日期转换器："+date);
        return "index";
    }*/

    /*数组类型参数绑定*/
    /*@RequestMapping("arrayParameter")
    public String hello(String [] data,Model model){
        String result = "";
        for (String str:data
             ) {
            System.out.println(str);
            result+=str+" ";
        }
        model.addAttribute("result",result);
        return "index";
    }*/

    /*List类型参数绑定，场景：批量修改添加数据：注意两点：1、页面name属性的值要指定存储的下标 2、后台传指的对象必须包装在一个pojo中*/
    /*@RequestMapping("listParameter")
    public String hello(Vo vo, Model model){
        String result = "请看后台打印结果";
        for (User user:vo.getDatas()
                ) {
            System.out.println(user);
        }
        model.addAttribute("result",result);
        return "index";
    }*/

    /*RequestMapping的请求地址可以多个*/
    /*@RequestMapping(value = {"login1","login2","login3"})
    public String hello(String name,Model model){
        model.addAttribute("name",name);
        return "index";
    }*/

    /*RequestMapping加在类的头部，用于分类管理*/

    /*限定指定的请求类型才执行方法,此处限定请求的方法为get*/
    @RequestMapping(value = "method",method = RequestMethod.GET)
    public String hello(String method,Model model){
        model.addAttribute("method",method);
        System.out.println(method);
        return "index";
    }


}
