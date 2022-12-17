package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fy
 * @email fystart@163.com
 * @date 2022-11-05 14:03:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
