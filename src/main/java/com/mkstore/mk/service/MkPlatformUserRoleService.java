
package com.mkstore.mk.service;

import java.util.List;
import com.mkstore.mk.model.MkPlatformUserRole;

public interface MkPlatformUserRoleService {
	public void save(MkPlatformUserRole item);
	public void update(MkPlatformUserRole item);
	public void delete(MkPlatformUserRole item);
	public List<MkPlatformUserRole> search(int start, int limit, MkPlatformUserRole item);
	public int count(MkPlatformUserRole item);
	public MkPlatformUserRole findById(Integer id);
}
	