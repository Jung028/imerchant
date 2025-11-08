package com.alipay.alipay_plus.biz.service.impl.template;

import com.alipay.alipay_plus.common.service.facade.baseresult.*;

public abstract class IdigitalriskBizCallback<T extends IdigitalriskBaseRequest, R extends IdigitalriskBaseResult>{

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
