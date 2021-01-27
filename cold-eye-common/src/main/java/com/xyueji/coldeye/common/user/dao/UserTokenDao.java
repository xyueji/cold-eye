package com.xyueji.coldeye.common.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xyueji.coldeye.common.user.entity.UserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiongzhigang
 * @date 2021-01-01 15:38
 * @description
 */
@Mapper
public interface UserTokenDao extends BaseMapper<UserTokenEntity> {

    /**
     * 根据token查询
     *
     * @param token
     * @return
     * @throws Exception
     */
    public UserTokenEntity queryByToken(String token) throws Exception;

    /**
     * 删除token
     *
     * @param token
     * @throws Exception
     */
    public void deleteByToken(String token) throws Exception;
}
