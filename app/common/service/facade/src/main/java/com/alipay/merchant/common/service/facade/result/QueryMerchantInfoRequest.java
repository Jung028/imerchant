package com.alipay.merchant.common.service.facade.result;

import com.alipay.merchant.common.service.facade.baseresult.MerchantBaseRequest;

/**
 * @author adam
 * @date 25/4/2026 6:13 PM
 */
public class QueryMerchantInfoRequest extends MerchantBaseRequest {
    private String merchantId;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
}