package com.xyueji.coldeye.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyueji.coldeye.admin.service.WareHouseService;
import com.xyueji.coldeye.common.admin.dao.WareHouseDao;
import com.xyueji.coldeye.common.admin.entity.WareHouseEntity;
import com.xyueji.coldeye.common.utils.PageUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-27 14:59
 * @description
 */
@Service("wareHouseService")
public class WareHouseServiceImpl extends ServiceImpl<WareHouseDao, WareHouseEntity> implements WareHouseService {
    /**
     * 分页查询
     *
     * @param params 参数
     * @return PageUtils
     */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        int current = params.get("page") == null ? 1 : Integer.valueOf(params.get("page").toString());
        int size = params.get("pagesize") == null ? 10 : Integer.valueOf(params.get("pagesize").toString());

        String companyId = params.get("companyId") == null ? "" : params.get("companyId").toString();
        String companyName = params.get("companyName") == null ? "" : params.get("companyName").toString();
        String houseCode = params.get("houseCode") == null ? "" : params.get("houseCode").toString();
        String houseName = params.get("houseName") == null ? "" : params.get("houseName").toString();


        Page<WareHouseEntity> page = new Page<>();
        QueryWrapper<WareHouseEntity> wrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(companyId)) {
            wrapper.lambda().eq(WareHouseEntity::getCompanyId, companyId);
        }

        if (StringUtils.isNotEmpty(companyName)) {
            wrapper.lambda().like(WareHouseEntity::getCompanyName, companyName);
        }

        if (StringUtils.isNotEmpty(houseCode)) {
            wrapper.lambda().like(WareHouseEntity::getHouseCode, houseCode);
        }

        if (StringUtils.isNotEmpty(houseName)) {
            wrapper.lambda().like(WareHouseEntity::getHouseName, houseName);
        }

        IPage<WareHouseEntity> result = this.page(page, wrapper);

        return new PageUtils(result);
    }
}
