package com.fystart.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fystart.common.utils.PageUtils;
import com.fystart.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author fy
 * @email fystart@163.com
 * @date 2022-07-01 09:09:07
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

