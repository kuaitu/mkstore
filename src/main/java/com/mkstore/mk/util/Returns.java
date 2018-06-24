package com.mkstore.mk.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Util class, returns a Map in the format Ext JS expects
 * 
 * Sample project presented at BrazilJS
 * Brazilian JavaScript Conference
 * Fortaleza - Cear- 13-14 May 2011
 * http://braziljs.com.br/2011
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class Returns {
    /**
     * Generates modelMap to return in the modelAndView
     * @param contacts
     * @return
     */
    public static Map<String, Object> mapOK(Object list, int total, String msg) {

        Map<String, Object> modelMap = new HashMap<String, Object>(3);
        modelMap.put("total", total);
        modelMap.put("message", msg);
        modelMap.put("data", list);
        // modelMap.put("rows", list);
        modelMap.put("success", true);

        return modelMap;
    }

    public static Map<String, Object> mapOK(Object list, String msg) {

        Map<String, Object> modelMap = new HashMap<String, Object>(3);
        modelMap.put("data", list);
        // modelMap.put("rows", list);
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

        return modelMap;
    }

    /**
     * Generates modelMap to return in the modelAndView in case
     * of exception
     * @param msg message
     * @return
     */
    public static Map<String, Object> mapError(String msg, Object flag) {

        Map<String, Object> modelMap = new HashMap<String, Object>(2);
        modelMap.put("message", msg);
        modelMap.put("success", false);
        modelMap.put("flag", flag);

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
