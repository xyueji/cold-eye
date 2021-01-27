package com.xyueji.coldeye.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyueji.coldeye.common.user.entity.UserEntity;

/**
 * @author xiongzhigang
 * @date 2021-01-01 15:57
 * @description
 */
public interface UserService extends IService<UserEntity> {

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     * @throws Exception
     */
    public UserEntity getUserByName(String username) throws Exception;
}
