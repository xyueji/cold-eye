package com.xyueji.coldeye.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyueji.coldeye.common.user.dao.UserDao;
import com.xyueji.coldeye.common.user.entity.UserEntity;
import com.xyueji.coldeye.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author xiongzhigang
 * @date 2021-01-01 15:59
 * @description
 */
@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     * @throws Exception
     */
    @Override
    public UserEntity getUserByName(String username) throws Exception {
        return baseMapper.queryByUserName(username);
    }
}
