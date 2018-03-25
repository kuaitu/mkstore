package com.mkstore.mk.dao;

import com.mkstore.mk.model.MkPlatformJurisdiction;
import com.mkstore.mk.model.MkPlatformJurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MkPlatformJurisdictionMapper {
    int countByExample(MkPlatformJurisdictionExample example);

    int deleteByExample(MkPlatformJurisdictionExample example);

    int deleteByPrimaryKey(Integer platformJurisdictionId);

    int insert(MkPlatformJurisdiction record);

    int insertSelective(MkPlatformJurisdiction record);

    List<MkPlatformJurisdiction> selectByExample(MkPlatformJurisdictionExample example);

    MkPlatformJurisdiction selectByPrimaryKey(Integer platformJurisdictionId);

    int updateByExampleSelective(@Param("record") MkPlatformJurisdiction record, @Param("example") MkPlatformJurisdictionExample example);

    int updateByExample(@Param("record") MkPlatformJurisdiction record, @Param("example") MkPlatformJurisdictionExample example);

    int updateByPrimaryKeySelective(MkPlatformJurisdiction record);

    int updateByPrimaryKey(MkPlatformJurisdiction record);
}