package com.xyueji.coldeye.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyueji.coldeye.common.user.entity.UserTokenEntity;
import com.xyueji.coldeye.common.utils.ResultResp;

/**
 * @author xiongzhigang
 * @date 2021-01-01 16:02
 * @description
 */
public interface UserTokenService extends IService<UserTokenEntity> {

    /**
     * 创建token
     *
     * @param userId
     * @return
     * @throws Exception
     */
    public ResultResp createToken(long userId) throws Exception;

    /**
     * 登出
     *
     * @param token
     * @throws Exception
     */
    public void logout(String token) throws Exception;

    /**
     * 根据token查询
     *
     * @param token
     * @return
     * @throws Exception
     */
    public UserTokenEntity getToken(String token) throws Exception;
}
