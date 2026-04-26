package com.alipay.merchant.common.service.facade.baseresult;

public class MerchantBizResult<T> extends MerchantBaseResult {
    private T result;
    private boolean success;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
