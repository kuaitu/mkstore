
package com.mkstore.mk.service.impl;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkstore.mk.model.MkPlatformRoleMenuExample.Criteria;

import com.mkstore.mk.dao.MkPlatformRoleMenuMapper;
import com.mkstore.mk.model.*;
import com.mkstore.mk.service.MkPlatformRoleMenuService;

@Service
public class MkPlatformRoleMenuServiceImpl implements MkPlatformRoleMenuService {
	@Autowired
	private MkPlatformRoleMenuMapper mapper;

	private MkPlatformRoleMenuExample buildExample(MkPlatformRoleMenu item) {
		MkPlatformRoleMenuExample example = new MkPlatformRoleMenuExample();
		Criteria criteria = example.createCriteria();

		// TODO: 条件需要添加

		return example;
	}

	@Override
	public List<MkPlatformRoleMenu> search(int start, int limit, MkPlatformRoleMenu item) {
		MkPlatformRoleMenuExample example = buildExample(item);
		if (-1 != limit) {
			example.setLimitAndOffset(limit, start);
		}
		return mapper.selectByExample(example);
	}
	
	@Override
	public int count(MkPlatformRoleMenu item) {
		MkPlatformRoleMenuExample  example = buildExample(item);
		return mapper.countByExample(example); 
	}

	@Override
	public void save(MkPlatformRoleMenu item) {
		mapper.insertSelective(item);
	}

	@Override
	public void update(MkPlatformRoleMenu item) {
		mapper.updateByPrimaryKeySelective(item);
	}
	
	@Override
	public void delete(MkPlatformRoleMenu item) {
		MkPlatformRoleMenuExample example = new MkPlatformRoleMenuExample();
		example.or().andPlatformRoleMenuIdEqualTo(item.getPlatformRoleMenuId());
		mapper.deleteByExample(example);
	}
	
	@Override
	public MkPlatformRoleMenu findById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
}
	