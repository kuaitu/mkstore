
package com.mkstore.mk.service;

import java.util.List;
import com.mkstore.mk.model.MkPlatformRoleMenu;

public interface MkPlatformRoleMenuService {
	public void save(MkPlatformRoleMenu item);
	public void update(MkPlatformRoleMenu item);
	public void delete(MkPlatformRoleMenu item);
	public List<MkPlatformRoleMenu> search(int start, int limit, MkPlatformRoleMenu item);
	public int count(MkPlatformRoleMenu item);
	public MkPlatformRoleMenu findById(Integer id);
}
	