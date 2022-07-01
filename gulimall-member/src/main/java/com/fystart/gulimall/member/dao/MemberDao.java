package com.fystart.gulimall.member.dao;

import com.fystart.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fy
 * @email fystart@163.com
 * @date 2022-07-01 09:15:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
