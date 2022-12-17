package com.atguigu.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author fy
 * @date 2022/11/5 15:48
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {


}
