package com.bs.extender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.mkstore.mk.util.EasyUIReturns;
import com.mkstore.mk.util.LogUtil;
import com.mkstore.mk.util.LogicException;
import com.mkstore.mk.util.Returns;

public class GlobalExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
            Exception exception) {
        LogUtil.error("发现异常", exception);

        if (request.getHeader("x-requested-with") != null
                && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
            // 如果是ajax请求响应头会有，x-requested-with
            response.setContentType("application/json; charset=utf-8");
            response.setCharacterEncoding("UTF-8");
            if (exception instanceof LogicException) {
                return new ModelAndView(new MappingJackson2JsonView(), Returns.mapError(exception.getMessage()));
            } else if (exception instanceof ConstraintViolationException) {
                StringBuffer sb = new StringBuffer(1024);
                List<Map> errorList = new ArrayList<Map>();
                ConstraintViolationException cve = (ConstraintViolationException) exception;
                Set<ConstraintViolation<?>> set = cve.getConstraintViolations();
                Iterator<ConstraintViolation<?>> it = set.iterator();
                while (it.hasNext()) {
                    ConstraintViolation<?> cv = it.next();
                    Map<String, String> feildMap = new HashMap<String, String>();
                    feildMap.put("message", cv.getMessage());
                    String path = cv.getPropertyPath().toString();
                    if (path.indexOf(".") > 0) {
                        path = path.substring(path.indexOf(".") + 1);
                    }
                    feildMap.put("feild", path);
                    errorList.add(feildMap);
                    sb.append(cv.getMessage() + "\n");
                }
                return new ModelAndView(new MappingJackson2JsonView(), EasyUIReturns.mapError(errorList, sb.toString()));
            } else {
                return new ModelAndView(new MappingJackson2JsonView(), EasyUIReturns.mapError("系统错误"));
            }

        }

        if (exception instanceof LogicException) {
            HashMap<String, String> model = new HashMap<String, String>();
            model.put("message", exception.getMessage());
            return new ModelAndView("logic_error", model);
        } else {
            HashMap<String, String> model = new HashMap<String, String>();
            model.put("message", "系统错误");
            return new ModelAndView("error", model);
        }
    }
}