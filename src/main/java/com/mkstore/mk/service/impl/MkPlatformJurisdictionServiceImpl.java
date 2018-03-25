
package com.mkstore.mk.service.impl;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkstore.mk.model.MkPlatformJurisdictionExample.Criteria;

import com.mkstore.mk.dao.MkPlatformJurisdictionMapper;
import com.mkstore.mk.model.*;
import com.mkstore.mk.service.MkPlatformJurisdictionService;

@Service
public class MkPlatformJurisdictionServiceImpl implements MkPlatformJurisdictionService {
	@Autowired
	private MkPlatformJurisdictionMapper mapper;

	private MkPlatformJurisdictionExample buildExample(MkPlatformJurisdiction item) {
		MkPlatformJurisdictionExample example = new MkPlatformJurisdictionExample();
		Criteria criteria = example.createCriteria();

		// TODO: 条件需要添加

		return example;
	}

	@Override
	public List<MkPlatformJurisdiction> search(int start, int limit, MkPlatformJurisdiction item) {
		MkPlatformJurisdictionExample example = buildExample(item);
		if (-1 != limit) {
			example.setLimitAndOffset(limit, start);
		}
		return mapper.selectByExample(example);
	}
	
	@Override
	public int count(MkPlatformJurisdiction item) {
		MkPlatformJurisdictionExample  example = buildExample(item);
		return mapper.countByExample(example); 
	}

	@Override
	public void save(MkPlatformJurisdiction item) {
		mapper.insertSelective(item);
	}

	@Override
	public void update(MkPlatformJurisdiction item) {
		mapper.updateByPrimaryKeySelective(item);
	}
	
	@Override
	public void delete(MkPlatformJurisdiction item) {
		MkPlatformJurisdictionExample example = new MkPlatformJurisdictionExample();
		example.or().andPlatformJurisdictionIdEqualTo(item.getPlatformJurisdictionId());
		mapper.deleteByExample(example);
	}
	
	@Override
	public MkPlatformJurisdiction findById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
}
	