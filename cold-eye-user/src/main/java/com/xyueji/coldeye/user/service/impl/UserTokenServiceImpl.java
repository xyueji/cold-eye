package com.xyueji.coldeye.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyueji.coldeye.common.user.dao.UserTokenDao;
import com.xyueji.coldeye.common.user.entity.UserTokenEntity;
import com.xyueji.coldeye.common.utils.ResultResp;
import com.xyueji.coldeye.common.utils.TokenGenerator;
import com.xyueji.coldeye.user.service.UserTokenService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author xiongzhigang
 * @date 2021-01-01 16:19
 * @description
 */
@Service("UserTokenService")
public class UserTokenServiceImpl extends ServiceImpl<UserTokenDao, UserTokenEntity> implements UserTokenService {
    //12小时后过期
    private final static int EXPIRE = 3600 * 12;

    @Override
    public ResultResp createToken(long userId) throws Exception {
        // 生成token
        String token = TokenGenerator.generateValue();

        // 当前时间
        Date now = new Date();
        // 过期时间
        Date expireTime = new Date(now.getTime() + EXPIRE * 1000);

        // 判断是否生成过token
        UserTokenEntity userTokenEntity = this.getById(userId);
        if (userTokenEntity == null) {
            userTokenEntity = new UserTokenEntity();
            userTokenEntity.setUserId(userId);
            userTokenEntity.setToken(token);
            userTokenEntity.setExpireTime(expireTime);
            userTokenEntity.setUpdateTime(now);

            // 保存token
            this.save(userTokenEntity);
        } else {
            userTokenEntity.setToken(token);
            userTokenEntity.setExpireTime(expireTime);
            userTokenEntity.setUpdateTime(now);

            // 更新数据库token
            this.updateById(userTokenEntity);
        }

        return ResultResp.success(userTokenEntity);
    }

    /**
     * 登出
     *
     * @param token
     * @throws Exception
     */
    @Override
    public void logout(String token) throws Exception {
        baseMapper.deleteByToken(token);
    }

    /**
     * 根据token查询
     *
     * @param token
     * @return
     * @throws Exception
     */
    @Override
    public UserTokenEntity getToken(String token) throws Exception {
        return baseMapper.queryByToken(token);
    }
}
