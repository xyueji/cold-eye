package com.xyueji.coldeye.monitor.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyueji.coldeye.common.monitor.dao.MessageDao;
import com.xyueji.coldeye.common.monitor.entity.MessageEntity;
import com.xyueji.coldeye.common.utils.PageUtils;
import com.xyueji.coldeye.monitor.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-28 15:27
 * @description
 */
@Service("messageService")
public class MessageServiceImpl extends ServiceImpl<MessageDao, MessageEntity> implements MessageService {
    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return PageUtils
     */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        int current = params.get("page") == null ? 1 : Integer.valueOf(params.get("page").toString());
        int pagesize = params.get("pagesize") == null ? 1 : Integer.valueOf(params.get("pagesize").toString());

        String meterCode = params.get("meterCode") == null ? "" : params.get("meterCode").toString();

        Page<MessageEntity> page = new Page<>(current, pagesize);
        QueryWrapper<MessageEntity> wrapper = new QueryWrapper<>();

        wrapper.lambda().like(MessageEntity::getMeterCode, meterCode);
        IPage<MessageEntity> result = this.page(page, wrapper);

        return new PageUtils(result);
    }
}
