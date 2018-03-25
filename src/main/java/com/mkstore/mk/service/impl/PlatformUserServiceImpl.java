
package com.mkstore.mk.service.impl;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkstore.mk.model.PlatformUserExample.Criteria;

import com.mkstore.mk.dao.PlatformUserMapper;
import com.mkstore.mk.model.*;
import com.mkstore.mk.service.PlatformUserService;

@Service
public class PlatformUserServiceImpl implements PlatformUserService {
	@Autowired
	private PlatformUserMapper mapper;

	private PlatformUserExample buildExample(PlatformUser item) {
		PlatformUserExample example = new PlatformUserExample();
		Criteria criteria = example.createCriteria();

		// TODO: 条件�?要添�?

		return example;
	}

	@Override
	public List<PlatformUser> search(int start, int limit, PlatformUser item) {
		PlatformUserExample example = buildExample(item);
		if (-1 != limit) {
			example.setLimitAndOffset(limit, start);
		}
		return mapper.selectByExample(example);
	}
	
	@Override
	public int count(PlatformUser item) {
		PlatformUserExample  example = buildExample(item);
		return mapper.countByExample(example); 
	}

	@Override
	public void save(PlatformUser item) {
		mapper.insertSelective(item);
	}

	@Override
	public void update(PlatformUser item) {
		mapper.updateByPrimaryKeySelective(item);
	}
	
	@Override
	public void delete(PlatformUser item) {
		PlatformUserExample example = new PlatformUserExample();
		example.or().andUserIdEqualTo(item.getUserId());
		mapper.deleteByExample(example);
	}
	
	@Override
	public PlatformUser findById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
}
	