package com.alipay.alipay_plus.core.model.context;

import com.alipay.alipay_plus.core.model.enums.IdigitalriskActionEnum;

import java.util.Date;

public final class IdigitalriskContextHolder {

    private final static ThreadLocal<IdigitalriskContext> contextLocal = new ThreadLocal<>();

    public static void set(IdigitalriskContext context){
        contextLocal.set(context);
    }

    public static void set(IdigitalriskActionEnum action, Date time, String operatorId, String operatorName) {
        set(new IdigitalriskContext(action, time, operatorId, operatorName));
    }
}
