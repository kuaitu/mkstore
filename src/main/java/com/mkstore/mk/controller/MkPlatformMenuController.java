
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

import com.mkstore.mk.model.MkPlatformMenu;
import com.mkstore.mk.service.MkPlatformMenuService;

@Controller
@RequestMapping(value = "/MkPlatformMenu/*")
public class MkPlatformMenuController {

	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	@Autowired
	private MkPlatformMenuService service;

	@RequestMapping(value = "search.action")
	public @ResponseBody Map<String, ? extends Object> search(
			@RequestParam int page, @RequestParam int rows,
			@RequestParam(required = false) String exampleJson) {
		MkPlatformMenu item = new MkPlatformMenu();
		if (StringUtils.isNotEmpty(exampleJson)) {
			item = gson.fromJson(exampleJson, new TypeToken<MkPlatformMenu>() {
				}.getType());
		}
		int total = service.count(item);
		List<MkPlatformMenu> items = service.search((page-1)*rows, rows, item);
		return EasyUIReturns.mapOK(items, total, "成功!");
	}
	
	@RequestMapping(value = "create.action")
	public @ResponseBody Map<String, ? extends Object> create(@RequestBody MkPlatformMenu item) {
		service.save(item);
		return EasyUIReturns.mapOK(item.getPlatformMenuId(), "成功!");
	}

	@RequestMapping(value = "update.action")
	public @ResponseBody Map<String, ? extends Object> update(@RequestBody MkPlatformMenu item) {
		service.update(item);
		return EasyUIReturns.mapOK("成功!");
	}

	@RequestMapping(value = "delete.action")
	public @ResponseBody Map<String, ? extends Object> delete(@RequestBody MkPlatformMenu item) {
		service.delete(item);
		return EasyUIReturns.mapOK("成功!");
	}
	
	@RequestMapping(value = "findById.action")
	public @ResponseBody Map<String, ? extends Object> findById(@RequestBody MkPlatformMenu item) {
		if (null == item.getPlatformMenuId()) {
			throw new ValidationException("参数校验失败");
		}
		return EasyUIReturns.mapOK(service.findById(item.getPlatformMenuId()),"成功!");
	}
}	
