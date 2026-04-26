package com.alipay.merchant.core.model.exception;


import com.alipay.merchant.common.service.facade.enums.MerchantResultCode;

public class BaseSlipException extends RuntimeException {

    public BaseSlipException(MerchantResultCode slipResultEnum) {
        super(slipResultEnum.getDescription());

    }

    public BaseSlipException(MerchantResultCode MerchantResultCode, String resultMsg) {
        super(MerchantResultCode.getDescription() + ":" + resultMsg);
    }
}
