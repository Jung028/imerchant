package com.alipay.merchant.core.model.context;

import com.alipay.merchant.core.model.enums.MerchantActionEnum;

import java.util.Date;

public final class MerchantContextHolder {

    private final static ThreadLocal<MerchantContext> contextLocal = new ThreadLocal<>();

    public static void set(MerchantContext context){
        contextLocal.set(context);
    }

    public static void set(MerchantActionEnum action, Date time, String operatorId, String operatorName) {
        set(new MerchantContext(action, time, operatorId, operatorName));
    }

    public static void clear() {
        contextLocal.remove();
    }
}
