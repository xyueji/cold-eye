package com.xyueji.coldeye.common.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xyueji.coldeye.common.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiongzhigang
 * @date 2021-01-01 15:23
 * @description
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     * @throws Exception
     */
    public UserEntity queryByUserName(String username) throws Exception;
}
