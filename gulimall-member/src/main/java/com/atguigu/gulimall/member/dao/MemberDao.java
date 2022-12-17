package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author fy
 * @email fystart@163.com
 * @date 2022-11-05 14:10:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
