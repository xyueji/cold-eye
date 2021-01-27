package com.xyueji.coldeye.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyueji.coldeye.admin.service.HostService;
import com.xyueji.coldeye.common.admin.dao.HostDao;
import com.xyueji.coldeye.common.admin.entity.HostEntity;
import com.xyueji.coldeye.common.admin.entity.WareHouseEntity;
import com.xyueji.coldeye.common.utils.PageUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-27 15:32
 * @description
 */
@Service("hostService")
public class HostServiceImpl extends ServiceImpl<HostDao, HostEntity> implements HostService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        int current = params.get("page") == null ? 1 : Integer.valueOf(params.get("page").toString());
        int size = params.get("pagesize") == null ? 10 : Integer.valueOf(params.get("pagesize").toString());

        String houseId = params.get("houseId") == null ? "" : params.get("houseId").toString();
        String houseName = params.get("houseName") == null ? "" : params.get("houseName").toString();
        String hostCode = params.get("hostCode") == null ? "" : params.get("hostCode").toString();
        String hostName = params.get("hostName") == null ? "" : params.get("hostName").toString();

        Page<HostEntity> page = new Page<>();
        QueryWrapper<HostEntity> wrapper = new QueryWrapper<>();

        if (StringUtils.isNotEmpty(houseId)) {
            wrapper.lambda().eq(HostEntity::getHouseId, houseId);
        }

        if (StringUtils.isNotEmpty(houseName)) {
            wrapper.lambda().like(HostEntity::getHouseName, houseName);
        }

        if (StringUtils.isNotEmpty(hostCode)) {
            wrapper.lambda().like(HostEntity::getHostCode, hostCode);
        }

        if (StringUtils.isNotEmpty(hostName)) {
            wrapper.lambda().like(HostEntity::getHostName, hostName);
        }

        IPage<HostEntity> result = this.page(page, wrapper);
        return new PageUtils(result);
    }
}
