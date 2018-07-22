package com.wzh.web.dao;

import com.wzh.web.model.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDAO")
public interface UserDAO {
    List<UserDTO> queryList();
}
