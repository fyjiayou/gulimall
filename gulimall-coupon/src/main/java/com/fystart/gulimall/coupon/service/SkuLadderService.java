package com.fystart.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fystart.common.utils.PageUtils;
import com.fystart.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author fy
 * @email fystart@163.com
 * @date 2022-07-01 09:09:07
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

