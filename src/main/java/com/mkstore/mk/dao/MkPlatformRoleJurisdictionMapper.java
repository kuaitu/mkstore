package com.mkstore.mk.dao;

import com.mkstore.mk.model.MkPlatformRoleJurisdiction;
import com.mkstore.mk.model.MkPlatformRoleJurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MkPlatformRoleJurisdictionMapper {
    int countByExample(MkPlatformRoleJurisdictionExample example);

    int deleteByExample(MkPlatformRoleJurisdictionExample example);

    int deleteByPrimaryKey(Integer platformRoleJurisdictionId);

    int insert(MkPlatformRoleJurisdiction record);

    int insertSelective(MkPlatformRoleJurisdiction record);

    List<MkPlatformRoleJurisdiction> selectByExample(MkPlatformRoleJurisdictionExample example);

    MkPlatformRoleJurisdiction selectByPrimaryKey(Integer platformRoleJurisdictionId);

    int updateByExampleSelective(@Param("record") MkPlatformRoleJurisdiction record, @Param("example") MkPlatformRoleJurisdictionExample example);

    int updateByExample(@Param("record") MkPlatformRoleJurisdiction record, @Param("example") MkPlatformRoleJurisdictionExample example);

    int updateByPrimaryKeySelective(MkPlatformRoleJurisdiction record);

    int updateByPrimaryKey(MkPlatformRoleJurisdiction record);
}