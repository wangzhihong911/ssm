package com.wzh.web.service.impl;

import com.wzh.web.dao.UserDAO;
import com.wzh.web.model.UserDTO;
import com.wzh.web.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    public List<UserDTO> queryList() {
        List<UserDTO> list = null;
        try{
            list = this.userDAO.queryList();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return list;
    }
}
