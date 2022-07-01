package com.fystart.gulimall.coupon.dao;

import com.fystart.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fy
 * @email fystart@163.com
 * @date 2022-07-01 09:09:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
