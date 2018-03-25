
package com.mkstore.mk.service;

import java.util.List;
import com.mkstore.mk.model.SysLog;

public interface SysLogService {
	public void save(SysLog item);
	public void update(SysLog item);
	public void delete(SysLog item);
	public List<SysLog> search(int start, int limit, SysLog item);
	public int count(SysLog item);
	public SysLog findById(Integer id);
}
	