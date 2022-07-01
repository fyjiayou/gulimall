package com.fystart.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fystart.common.utils.PageUtils;
import com.fystart.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author fy
 * @email fystart@163.com
 * @date 2022-07-01 09:09:07
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

