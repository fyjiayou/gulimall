package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fy
 * @email fystart@163.com
 * @date 2022-11-05 14:08:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
