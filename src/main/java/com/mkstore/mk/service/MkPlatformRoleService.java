
package com.mkstore.mk.service;

import java.util.List;
import com.mkstore.mk.model.MkPlatformRole;

public interface MkPlatformRoleService {
	public void save(MkPlatformRole item);
	public void update(MkPlatformRole item);
	public void delete(MkPlatformRole item);
	public List<MkPlatformRole> search(int start, int limit, MkPlatformRole item);
	public int count(MkPlatformRole item);
	public MkPlatformRole findById(Integer id);
}
	