package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fy
 * @email fystart@163.com
 * @date 2022-11-05 11:51:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
