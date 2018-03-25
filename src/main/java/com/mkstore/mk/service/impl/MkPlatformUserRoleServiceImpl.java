
package com.mkstore.mk.service.impl;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkstore.mk.model.MkPlatformUserRoleExample.Criteria;

import com.mkstore.mk.dao.MkPlatformUserRoleMapper;
import com.mkstore.mk.model.*;
import com.mkstore.mk.service.MkPlatformUserRoleService;

@Service
public class MkPlatformUserRoleServiceImpl implements MkPlatformUserRoleService {
	@Autowired
	private MkPlatformUserRoleMapper mapper;

	private MkPlatformUserRoleExample buildExample(MkPlatformUserRole item) {
		MkPlatformUserRoleExample example = new MkPlatformUserRoleExample();
		Criteria criteria = example.createCriteria();

		// TODO: 条件需要添加

		return example;
	}

	@Override
	public List<MkPlatformUserRole> search(int start, int limit, MkPlatformUserRole item) {
		MkPlatformUserRoleExample example = buildExample(item);
		if (-1 != limit) {
			example.setLimitAndOffset(limit, start);
		}
		return mapper.selectByExample(example);
	}
	
	@Override
	public int count(MkPlatformUserRole item) {
		MkPlatformUserRoleExample  example = buildExample(item);
		return mapper.countByExample(example); 
	}

	@Override
	public void save(MkPlatformUserRole item) {
		mapper.insertSelective(item);
	}

	@Override
	public void update(MkPlatformUserRole item) {
		mapper.updateByPrimaryKeySelective(item);
	}
	
	@Override
	public void delete(MkPlatformUserRole item) {
		MkPlatformUserRoleExample example = new MkPlatformUserRoleExample();
		example.or().andUserRoleIdEqualTo(item.getUserRoleId());
		mapper.deleteByExample(example);
	}
	
	@Override
	public MkPlatformUserRole findById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
}
	