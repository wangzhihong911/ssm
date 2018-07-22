package com.wzh.web.control;

import com.wzh.web.model.UserDTO;
import com.wzh.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class index {
    @Resource
    private UserService userService;

    @Autowired
    private HttpServletRequest req;

    @RequestMapping("/index")
    public String index(){
        System.out.println("----------------------------------------");
        List<UserDTO> list_user = this.userService.queryList();
        req.setAttribute("list",list_user);
        return "/list";
    }
}
