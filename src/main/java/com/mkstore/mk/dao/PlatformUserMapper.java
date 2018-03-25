package com.mkstore.mk.dao;

import com.mkstore.mk.model.PlatformUser;
import com.mkstore.mk.model.PlatformUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformUserMapper {
    int countByExample(PlatformUserExample example);

    int deleteByExample(PlatformUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(PlatformUser record);

    int insertSelective(PlatformUser record);

    List<PlatformUser> selectByExample(PlatformUserExample example);

    PlatformUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") PlatformUser record, @Param("example") PlatformUserExample example);

    int updateByExample(@Param("record") PlatformUser record, @Param("example") PlatformUserExample example);

    int updateByPrimaryKeySelective(PlatformUser record);

    int updateByPrimaryKey(PlatformUser record);
}