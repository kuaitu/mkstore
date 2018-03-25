
package com.mkstore.mk.service.impl;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkstore.mk.model.MkPlatformRoleExample.Criteria;

import com.mkstore.mk.dao.MkPlatformRoleMapper;
import com.mkstore.mk.model.*;
import com.mkstore.mk.service.MkPlatformRoleService;

@Service
public class MkPlatformRoleServiceImpl implements MkPlatformRoleService {
	@Autowired
	private MkPlatformRoleMapper mapper;

	private MkPlatformRoleExample buildExample(MkPlatformRole item) {
		MkPlatformRoleExample example = new MkPlatformRoleExample();
		Criteria criteria = example.createCriteria();

		// TODO: 条件需要添加

		return example;
	}

	@Override
	public List<MkPlatformRole> search(int start, int limit, MkPlatformRole item) {
		MkPlatformRoleExample example = buildExample(item);
		if (-1 != limit) {
			example.setLimitAndOffset(limit, start);
		}
		return mapper.selectByExample(example);
	}
	
	@Override
	public int count(MkPlatformRole item) {
		MkPlatformRoleExample  example = buildExample(item);
		return mapper.countByExample(example); 
	}

	@Override
	public void save(MkPlatformRole item) {
		mapper.insertSelective(item);
	}

	@Override
	public void update(MkPlatformRole item) {
		mapper.updateByPrimaryKeySelective(item);
	}
	
	@Override
	public void delete(MkPlatformRole item) {
		MkPlatformRoleExample example = new MkPlatformRoleExample();
		example.or().andPlatformRoleIdEqualTo(item.getPlatformRoleId());
		mapper.deleteByExample(example);
	}
	
	@Override
	public MkPlatformRole findById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
}
	