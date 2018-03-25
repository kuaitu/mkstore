package com.mkstore.mk.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class EasyUIReturns {
	/**
     * Generates modelMap to return in the modelAndView
     * @param contacts
     * @return
     */
    public static Map<String, Object> mapOK(Object list, int total, String msg) {

        Map<String, Object> modelMap = new HashMap<String, Object>(3);
        modelMap.put("total", total);
        modelMap.put("message", msg);
        modelMap.put("rows", list);
        modelMap.put("data", list);
        modelMap.put("success", true);

        return modelMap;
    }

    public static Map<String, Object> mapOK(Object list, String msg) {

        Map<String, Object> modelMap = new HashMap<String, Object>(3);
        modelMap.put("rows", list);
        modelMap.put("data", list);
        modelMap.put("message", msg);
        modelMap.put("success", true);
        return modelMap;

    }

    /**
     * Generates modelMap to return in the modelAndView in case
     * of exception
     * @param msg message
     * @return
     */
    public static Map<String, Object> mapError(String msg) {

        Map<String, Object> modelMap = new HashMap<String, Object>(2);
        modelMap.put("message", msg);
        modelMap.put("success", false);
        modelMap.put("rows", new String[] {});

        return modelMap;
    }

    /**
     * Generates modelMap to return in the modelAndView in case
     * of exception
     * @param msg message
     * @return
     */
    public static Map<String, Object> mapError(Object object, String msg) {

        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("message", msg);
        modelMap.put("rows", object);
        modelMap.put("success", false);
        return modelMap;
    }

    public static Map<String, Object> mapOK(String msg) {

        Map<String, Object> modelMap = new HashMap<String, Object>(2);
        modelMap.put("message", msg);
        modelMap.put("success", true);

        return modelMap;
    }

    public static Map<String, Object> mapOK(boolean isValid) {

        Map<String, Object> modelMap = new HashMap<String, Object>(2);
        modelMap.put("isValid", isValid);
        modelMap.put("success", true);

        return modelMap;
    }

    /**
     * Generates modelMap to return in the modelAndView
     * @param contacts
     * @return
     */
    public static Map<String, Object> mapTree(Object list, String msg) {

        Map<String, Object> modelMap = new HashMap<String, Object>(3);
        modelMap.put("children", list);
        return modelMap;
    }
}
