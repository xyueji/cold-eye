package com.xyueji.coldeye.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyueji.coldeye.admin.service.MeterService;
import com.xyueji.coldeye.common.admin.dao.MeterDao;
import com.xyueji.coldeye.common.admin.entity.MeterEntity;
import com.xyueji.coldeye.common.utils.PageUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-27 15:41
 * @description
 */
@Service("meterService")
public class MeterServiceImpl extends ServiceImpl<MeterDao, MeterEntity> implements MeterService {
    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return PageUtils
     */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        int current = params.get("page") == null ? 1 : Integer.valueOf(params.get("page").toString());
        int size = params.get("pagesize") == null ? 10 : Integer.valueOf(params.get("pagesize").toString());

        String hostId = params.get("hostId") == null ? "" : params.get("hostId").toString();
        String companyName = params.get("companyName") == null ? "" : params.get("companyName").toString();
        String houseName = params.get("houseName") == null ? "" : params.get("houseName").toString();
        String hostName = params.get("hostName") == null ? "" : params.get("hostName").toString();
        String meterCode = params.get("meterCode") == null ? "" : params.get("meterCode").toString();
        String meterName = params.get("meterName") == null ? "" : params.get("meterName").toString();


        Page<MeterEntity> page = new Page<>();
        QueryWrapper<MeterEntity> wrapper = new QueryWrapper<>();

        if (StringUtils.isNotEmpty(hostId)) {
            wrapper.lambda().eq(MeterEntity::getHouseId, hostId);
        }

        if (StringUtils.isNotEmpty(companyName)) {
            wrapper.lambda().like(MeterEntity::getCompanyName, companyName);
        }

        if (StringUtils.isNotEmpty(houseName)) {
            wrapper.lambda().like(MeterEntity::getHouseName, houseName);
        }

        if (StringUtils.isNotEmpty(hostName)) {
            wrapper.lambda().like(MeterEntity::getHostName, hostName);
        }

        if (StringUtils.isNotEmpty(meterCode)) {
            wrapper.lambda().like(MeterEntity::getMeterCode, meterCode);
        }

        if (StringUtils.isNotEmpty(meterName)) {
            wrapper.lambda().like(MeterEntity::getMeterName, meterName);
        }

        IPage<MeterEntity> result = this.page(page, wrapper);

        return new PageUtils(result);
    }
}
