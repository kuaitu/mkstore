
package com.mkstore.mk.service.impl;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkstore.mk.model.MkPlatformMenuExample.Criteria;

import com.mkstore.mk.dao.MkPlatformMenuMapper;
import com.mkstore.mk.model.*;
import com.mkstore.mk.service.MkPlatformMenuService;

@Service
public class MkPlatformMenuServiceImpl implements MkPlatformMenuService {
	@Autowired
	private MkPlatformMenuMapper mapper;

	private MkPlatformMenuExample buildExample(MkPlatformMenu item) {
		MkPlatformMenuExample example = new MkPlatformMenuExample();
		Criteria criteria = example.createCriteria();

		// TODO: 条件需要添加

		return example;
	}

	@Override
	public List<MkPlatformMenu> search(int start, int limit, MkPlatformMenu item) {
		MkPlatformMenuExample example = buildExample(item);
		if (-1 != limit) {
			example.setLimitAndOffset(limit, start);
		}
		return mapper.selectByExample(example);
	}
	
	@Override
	public int count(MkPlatformMenu item) {
		MkPlatformMenuExample  example = buildExample(item);
		return mapper.countByExample(example); 
	}

	@Override
	public void save(MkPlatformMenu item) {
		mapper.insertSelective(item);
	}

	@Override
	public void update(MkPlatformMenu item) {
		mapper.updateByPrimaryKeySelective(item);
	}
	
	@Override
	public void delete(MkPlatformMenu item) {
		MkPlatformMenuExample example = new MkPlatformMenuExample();
		example.or().andPlatformMenuIdEqualTo(item.getPlatformMenuId());
		mapper.deleteByExample(example);
	}
	
	@Override
	public MkPlatformMenu findById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
}
	