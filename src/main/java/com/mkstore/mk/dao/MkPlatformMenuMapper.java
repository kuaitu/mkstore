package com.mkstore.mk.dao;

import com.mkstore.mk.model.MkPlatformMenu;
import com.mkstore.mk.model.MkPlatformMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MkPlatformMenuMapper {
    int countByExample(MkPlatformMenuExample example);

    int deleteByExample(MkPlatformMenuExample example);

    int deleteByPrimaryKey(Integer platformMenuId);

    int insert(MkPlatformMenu record);

    int insertSelective(MkPlatformMenu record);

    List<MkPlatformMenu> selectByExample(MkPlatformMenuExample example);

    MkPlatformMenu selectByPrimaryKey(Integer platformMenuId);

    int updateByExampleSelective(@Param("record") MkPlatformMenu record, @Param("example") MkPlatformMenuExample example);

    int updateByExample(@Param("record") MkPlatformMenu record, @Param("example") MkPlatformMenuExample example);

    int updateByPrimaryKeySelective(MkPlatformMenu record);

    int updateByPrimaryKey(MkPlatformMenu record);
}