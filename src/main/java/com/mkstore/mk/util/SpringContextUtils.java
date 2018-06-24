package com.mkstore.mk.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 用于手动获取bean
 * @author cj
 *
 */
@Component
public class SpringContextUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        applicationContext = ac;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBeanById(String id) {
        return applicationContext.getBean(id);
    }

    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }
    
    public static <T> T getBeanByClass(Class<T> c) {
        return applicationContext.getBean(c);
    }
}
