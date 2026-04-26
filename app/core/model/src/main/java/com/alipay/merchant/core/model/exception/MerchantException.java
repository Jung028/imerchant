package com.alipay.merchant.core.model.exception;


import com.alipay.merchant.common.service.facade.enums.MerchantResultCode;

public class MerchantException extends RuntimeException {

  private static final long seralVersionUID = 9187623791824214L;

  private MerchantResultCode resultCode;

  public MerchantException(MerchantResultCode resultCode, String message) {
    super(message);
    this.resultCode = resultCode;
  }

  public MerchantException(MerchantResultCode resultCode) {
    this(resultCode, resultCode.getDescription());
  }

  public MerchantResultCode getResultCode() {
    return resultCode;
  }

  public void setResultCode(MerchantResultCode resultCode) {
    this.resultCode = resultCode;
  }
}
