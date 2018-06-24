package com.mkstore.mk.util;

import java.util.Date;
import com.mkstore.mk.model.SysLog;
import com.mkstore.mk.service.SysLogService;

public class OperLogUtil {
	 public static void log4PlatForm(Integer id ,String varcharId,String tableName, String user, String type, String content) {
	        try {
	        	SysLogService sysLogService = SpringContextUtils.getBeanByClass(SysLogService.class);
	        	SysLog sysLog = new SysLog();
	        	sysLog.setOptContent(content);
	        	sysLog.setOptPriKey(varcharId);
	        	sysLog.setOptTable(tableName);
	        	sysLog.setOptTag("");
	        	sysLog.setOptTime(new Date());
	        	sysLog.setOptType(type);
	        	sysLog.setOptUserId(id);
	        	sysLog.setOptUserName(user);
	        	sysLogService.save(sysLog);
	        } catch (Exception e) {
	            LogUtil.error("插入日志表失败", e);
	        }
	    }
}
