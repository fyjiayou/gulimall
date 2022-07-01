package com.fystart.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fystart.common.utils.PageUtils;
import com.fystart.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author fy
 * @email fystart@163.com
 * @date 2022-07-01 08:19:42
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

