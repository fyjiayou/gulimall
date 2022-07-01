package com.fystart.gulimall.product.dao;

import com.fystart.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fy
 * @email fystart@163.com
 * @date 2022-07-01 08:19:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
