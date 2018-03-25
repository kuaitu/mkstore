package com.mkstore.mk.dao;

import com.mkstore.mk.model.MkPlatformRole;
import com.mkstore.mk.model.MkPlatformRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MkPlatformRoleMapper {
    int countByExample(MkPlatformRoleExample example);

    int deleteByExample(MkPlatformRoleExample example);

    int deleteByPrimaryKey(Integer platformRoleId);

    int insert(MkPlatformRole record);

    int insertSelective(MkPlatformRole record);

    List<MkPlatformRole> selectByExample(MkPlatformRoleExample example);

    MkPlatformRole selectByPrimaryKey(Integer platformRoleId);

    int updateByExampleSelective(@Param("record") MkPlatformRole record, @Param("example") MkPlatformRoleExample example);

    int updateByExample(@Param("record") MkPlatformRole record, @Param("example") MkPlatformRoleExample example);

    int updateByPrimaryKeySelective(MkPlatformRole record);

    int updateByPrimaryKey(MkPlatformRole record);
}