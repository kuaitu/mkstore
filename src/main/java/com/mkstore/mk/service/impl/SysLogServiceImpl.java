
package com.mkstore.mk.service.impl;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkstore.mk.model.SysLogExample.Criteria;

import com.mkstore.mk.dao.SysLogMapper;
import com.mkstore.mk.model.*;
import com.mkstore.mk.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {
	@Autowired
	private SysLogMapper mapper;

	private SysLogExample buildExample(SysLog item) {
		SysLogExample example = new SysLogExample();
		Criteria criteria = example.createCriteria();

		// TODO: 条件需要添加

		return example;
	}

	@Override
	public List<SysLog> search(int start, int limit, SysLog item) {
		SysLogExample example = buildExample(item);
		if (-1 != limit) {
			example.setLimitAndOffset(limit, start);
		}
		return mapper.selectByExample(example);
	}
	
	@Override
	public int count(SysLog item) {
		SysLogExample  example = buildExample(item);
		return mapper.countByExample(example); 
	}

	@Override
	public void save(SysLog item) {
		mapper.insertSelective(item);
	}

	@Override
	public void update(SysLog item) {
		mapper.updateByPrimaryKeySelective(item);
	}
	
	@Override
	public void delete(SysLog item) {
		SysLogExample example = new SysLogExample();
		example.or().andLogIdEqualTo(item.getLogId());
		mapper.deleteByExample(example);
	}
	
	@Override
	public SysLog findById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
}
	