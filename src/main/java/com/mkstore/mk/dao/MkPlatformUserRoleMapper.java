package com.mkstore.mk.dao;

import com.mkstore.mk.model.MkPlatformUserRole;
import com.mkstore.mk.model.MkPlatformUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MkPlatformUserRoleMapper {
    int countByExample(MkPlatformUserRoleExample example);

    int deleteByExample(MkPlatformUserRoleExample example);

    int deleteByPrimaryKey(Integer userRoleId);

    int insert(MkPlatformUserRole record);

    int insertSelective(MkPlatformUserRole record);

    List<MkPlatformUserRole> selectByExample(MkPlatformUserRoleExample example);

    MkPlatformUserRole selectByPrimaryKey(Integer userRoleId);

    int updateByExampleSelective(@Param("record") MkPlatformUserRole record, @Param("example") MkPlatformUserRoleExample example);

    int updateByExample(@Param("record") MkPlatformUserRole record, @Param("example") MkPlatformUserRoleExample example);

    int updateByPrimaryKeySelective(MkPlatformUserRole record);

    int updateByPrimaryKey(MkPlatformUserRole record);
}