
package com.mkstore.mk.service;

import java.util.List;
import com.mkstore.mk.model.PlatformUser;

public interface PlatformUserService {
	public void save(PlatformUser item);
	public void update(PlatformUser item);
	public void delete(PlatformUser item);
	public List<PlatformUser> search(int start, int limit, PlatformUser item);
	public int count(PlatformUser item);
	public PlatformUser findById(Integer id);
}
	