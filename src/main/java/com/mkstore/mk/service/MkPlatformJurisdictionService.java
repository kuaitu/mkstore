
package com.mkstore.mk.service;

import java.util.List;
import com.mkstore.mk.model.MkPlatformJurisdiction;

public interface MkPlatformJurisdictionService {
	public void save(MkPlatformJurisdiction item);
	public void update(MkPlatformJurisdiction item);
	public void delete(MkPlatformJurisdiction item);
	public List<MkPlatformJurisdiction> search(int start, int limit, MkPlatformJurisdiction item);
	public int count(MkPlatformJurisdiction item);
	public MkPlatformJurisdiction findById(Integer id);
}
	