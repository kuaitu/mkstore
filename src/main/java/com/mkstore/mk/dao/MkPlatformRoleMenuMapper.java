package com.mkstore.mk.dao;

import com.mkstore.mk.model.MkPlatformRoleMenu;
import com.mkstore.mk.model.MkPlatformRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MkPlatformRoleMenuMapper {
    int countByExample(MkPlatformRoleMenuExample example);

    int deleteByExample(MkPlatformRoleMenuExample example);

    int deleteByPrimaryKey(Integer platformRoleMenuId);

    int insert(MkPlatformRoleMenu record);

    int insertSelective(MkPlatformRoleMenu record);

    List<MkPlatformRoleMenu> selectByExample(MkPlatformRoleMenuExample example);

    MkPlatformRoleMenu selectByPrimaryKey(Integer platformRoleMenuId);

    int updateByExampleSelective(@Param("record") MkPlatformRoleMenu record, @Param("example") MkPlatformRoleMenuExample example);

    int updateByExample(@Param("record") MkPlatformRoleMenu record, @Param("example") MkPlatformRoleMenuExample example);

    int updateByPrimaryKeySelective(MkPlatformRoleMenu record);

    int updateByPrimaryKey(MkPlatformRoleMenu record);
}