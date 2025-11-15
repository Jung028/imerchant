package com.alipay.alipay_plus.core.model.exception;

import com.alipay.alipay_plus.common.service.facade.enums.IdigitalriskResultCode;

public class IdigitalriskException extends RuntimeException {

  private static final long seralVersionUID = 9187623791824214L;

  private IdigitalriskResultCode resultCode;

  public IdigitalriskException(IdigitalriskResultCode resultCode, String message) {
    super(message);
    this.resultCode = resultCode;
  }

  public IdigitalriskException(IdigitalriskResultCode resultCode) {
    this(resultCode, resultCode.getDescription());
  }

  public IdigitalriskResultCode getResultCode() {
    return resultCode;
  }

  public void setResultCode(IdigitalriskResultCode resultCode) {
    this.resultCode = resultCode;
  }
}
