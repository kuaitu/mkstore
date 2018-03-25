
package com.mkstore.mk.service.impl;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkstore.mk.model.MkPlatformRoleJurisdictionExample.Criteria;

import com.mkstore.mk.dao.MkPlatformRoleJurisdictionMapper;
import com.mkstore.mk.model.*;
import com.mkstore.mk.service.MkPlatformRoleJurisdictionService;

@Service
public class MkPlatformRoleJurisdictionServiceImpl implements MkPlatformRoleJurisdictionService {
	@Autowired
	private MkPlatformRoleJurisdictionMapper mapper;

	private MkPlatformRoleJurisdictionExample buildExample(MkPlatformRoleJurisdiction item) {
		MkPlatformRoleJurisdictionExample example = new MkPlatformRoleJurisdictionExample();
		Criteria criteria = example.createCriteria();

		// TODO: 条件需要添加

		return example;
	}

	@Override
	public List<MkPlatformRoleJurisdiction> search(int start, int limit, MkPlatformRoleJurisdiction item) {
		MkPlatformRoleJurisdictionExample example = buildExample(item);
		if (-1 != limit) {
			example.setLimitAndOffset(limit, start);
		}
		return mapper.selectByExample(example);
	}
	
	@Override
	public int count(MkPlatformRoleJurisdiction item) {
		MkPlatformRoleJurisdictionExample  example = buildExample(item);
		return mapper.countByExample(example); 
	}

	@Override
	public void save(MkPlatformRoleJurisdiction item) {
		mapper.insertSelective(item);
	}

	@Override
	public void update(MkPlatformRoleJurisdiction item) {
		mapper.updateByPrimaryKeySelective(item);
	}
	
	@Override
	public void delete(MkPlatformRoleJurisdiction item) {
		MkPlatformRoleJurisdictionExample example = new MkPlatformRoleJurisdictionExample();
		example.or().andPlatformRoleJurisdictionIdEqualTo(item.getPlatformRoleJurisdictionId());
		mapper.deleteByExample(example);
	}
	
	@Override
	public MkPlatformRoleJurisdiction findById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
}
	