
package com.mkstore.mk.service;

import java.util.List;
import com.mkstore.mk.model.MkPlatformMenu;

public interface MkPlatformMenuService {
	public void save(MkPlatformMenu item);
	public void update(MkPlatformMenu item);
	public void delete(MkPlatformMenu item);
	public List<MkPlatformMenu> search(int start, int limit, MkPlatformMenu item);
	public int count(MkPlatformMenu item);
	public MkPlatformMenu findById(Integer id);
}
	