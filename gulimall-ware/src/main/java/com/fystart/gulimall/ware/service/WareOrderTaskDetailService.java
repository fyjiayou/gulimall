package com.fystart.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fystart.common.utils.PageUtils;
import com.fystart.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author fy
 * @email fystart@163.com
 * @date 2022-07-01 09:24:09
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

