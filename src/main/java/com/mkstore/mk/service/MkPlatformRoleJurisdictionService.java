
package com.mkstore.mk.service;

import java.util.List;
import com.mkstore.mk.model.MkPlatformRoleJurisdiction;

public interface MkPlatformRoleJurisdictionService {
	public void save(MkPlatformRoleJurisdiction item);
	public void update(MkPlatformRoleJurisdiction item);
	public void delete(MkPlatformRoleJurisdiction item);
	public List<MkPlatformRoleJurisdiction> search(int start, int limit, MkPlatformRoleJurisdiction item);
	public int count(MkPlatformRoleJurisdiction item);
	public MkPlatformRoleJurisdiction findById(Integer id);
}
	