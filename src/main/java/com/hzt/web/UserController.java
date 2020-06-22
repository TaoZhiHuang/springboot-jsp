package com.hzt.web;

import com.hzt.entity.User;
import com.hzt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public String list(Model model, HttpServletRequest request, HttpServletResponse response){
        List<User> users = userService.userList();
        model.addAttribute("users",users);
        ServletContext sc = request.getSession().getServletContext();
        model.addAttribute("url",sc);
        return "list";
    }

    @RequestMapping("insert")
    public String insert (){
        return "insert";
    }

    @RequestMapping("insertUser")
    public String insertUser(User user){

     User user1 =userService.findById(user.getId());
        if(user1!=null){
            userService.edit(user);
        }else{
            userService.insertUser(user);
        }

        return "redirect:/user/list";
    }

    @RequestMapping("edit")
    public String edit(Integer id,Model model){
        User user = userService.findById(id);
        model.addAttribute("user",user);
//        userService.edit(user);
        return "updateUser";
    }


    @RequestMapping("delete")
    public String delete(Integer id){
        userService.delete(id);
        return "redirect:/user/list";
    }
}
