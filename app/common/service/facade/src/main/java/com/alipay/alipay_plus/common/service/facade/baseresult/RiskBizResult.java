package com.alipay.alipay_plus.common.service.facade.baseresult;

public class RiskBizResult<T> extends IdigitalriskBaseResult {
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
