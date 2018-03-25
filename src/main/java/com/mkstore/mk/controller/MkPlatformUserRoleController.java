
package com.mkstore.mk.controller;

import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import com.mkstore.mk.util.EasyUIReturns;
import com.mkstore.mk.util.ValidationException;

import com.mkstore.mk.model.MkPlatformUserRole;
import com.mkstore.mk.service.MkPlatformUserRoleService;

@Controller
@RequestMapping(value = "/MkPlatformUserRole/*")
public class MkPlatformUserRoleController {

	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	@Autowired
	private MkPlatformUserRoleService service;

	@RequestMapping(value = "search.action")
	public @ResponseBody Map<String, ? extends Object> search(
			@RequestParam int page, @RequestParam int rows,
			@RequestParam(required = false) String exampleJson) {
		MkPlatformUserRole item = new MkPlatformUserRole();
		if (StringUtils.isNotEmpty(exampleJson)) {
			item = gson.fromJson(exampleJson, new TypeToken<MkPlatformUserRole>() {
				}.getType());
		}
		int total = service.count(item);
		List<MkPlatformUserRole> items = service.search((page-1)*rows, rows, item);
		return EasyUIReturns.mapOK(items, total, "成功!");
	}
	
	@RequestMapping(value = "create.action")
	public @ResponseBody Map<String, ? extends Object> create(@RequestBody MkPlatformUserRole item) {
		service.save(item);
		return EasyUIReturns.mapOK(item.getUserRoleId(), "成功!");
	}

	@RequestMapping(value = "update.action")
	public @ResponseBody Map<String, ? extends Object> update(@RequestBody MkPlatformUserRole item) {
		service.update(item);
		return EasyUIReturns.mapOK("成功!");
	}

	@RequestMapping(value = "delete.action")
	public @ResponseBody Map<String, ? extends Object> delete(@RequestBody MkPlatformUserRole item) {
		service.delete(item);
		return EasyUIReturns.mapOK("成功!");
	}
	
	@RequestMapping(value = "findById.action")
	public @ResponseBody Map<String, ? extends Object> findById(@RequestBody MkPlatformUserRole item) {
		if (null == item.getUserRoleId()) {
			throw new ValidationException("参数校验失败");
		}
		return EasyUIReturns.mapOK(service.findById(item.getUserRoleId()),"成功!");
	}
}	
