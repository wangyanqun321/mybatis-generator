package com.wyq.mybatisgenerator.application;

import com.wyq.mybatisgenerator.domain.User;
import com.wyq.mybatisgenerator.mapper.UserDOMapper;
import com.wyq.mybatisgenerator.pojo.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserApplicationService {
    @Autowired
    UserDOMapper mapper;

    public int addUser(UserDO user){
        mapper.insert(user);
        return 1;
    }
}
