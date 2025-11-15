package com.alipay.alipay_plus.core.model.exception;

import com.alipay.alipay_plus.common.service.facade.enums.IdigitalriskResultCode;
import com.alipay.alipay_plus.common.service.facade.enums.SlipResultEnum;

public class BaseSlipException extends RuntimeException {

    public BaseSlipException(SlipResultEnum slipResultEnum) {
        super(slipResultEnum.getResultMsg());

    }

    public BaseSlipException(SlipResultEnum slipResultEnum, String resultMsg) {
        super(slipResultEnum.getResultMsg() + ":" + resultMsg);
    }

    public BaseSlipException(IdigitalriskResultCode idigitalriskResultCode, String resultMsg) {
        super(idigitalriskResultCode.getDescription() + ":" + resultMsg);
    }
}
