package com.alipay.merchant.biz.service.impl.template;

import com.alipay.merchant.common.service.facade.baseresult.MerchantBaseRequest;
import com.alipay.merchant.common.service.facade.baseresult.MerchantBaseResult;

public abstract class MerchantBizCallback<T extends MerchantBaseRequest, R extends MerchantBaseResult>{

    /**
     * define the default response object
     */
    protected abstract R createDefaultResponse();

    /**
     * check params
     */
    protected abstract void checkParams(T request);

    /**
     * execute
     */
    protected abstract void process(T request, R response);



}
