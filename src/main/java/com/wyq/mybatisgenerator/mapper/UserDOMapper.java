package com.wyq.mybatisgenerator.mapper;

import com.wyq.mybatisgenerator.pojo.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDOMapper {
    int insert(UserDO record);

    int insertSelective(UserDO record);
}