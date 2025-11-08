package com.alipay.alipay_plus.common.service.facade.enums;


import static com.alipay.alipay_plus.common.service.facade.enums.ErrorCodeConstants.PREFIX;

public enum IdigitalriskResultCode {


    EXECUTE_SUCCESS(GlobalResultCodes.EXECUTE_SUCCESS, "Success"),


    SYSTEM_EXCEPTION(GlobalResultCodes.SYSTEM_EXCEPTION, "System Exception"),


    PARAM_ILLEGAL(GlobalResultCodes.PARAM_ILLEGAL, "Parameter Illegal"),


    REPEATED_SUBMIT(GlobalResultCodes.REPEATED_SUBMIT, "Repeated Submit"),


    RISK_SCENE_NOT_EXIST(ResultCodeLevel.ERROR, ResultCodeType.BIZ_ERROR, IdigitalriskBizType.RISK_SCENE, "01", "Risk Scene Not Exist");


    private final String code;

    private final String description;

    IdigitalriskResultCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    IdigitalriskResultCode(String level, String bizError, String bizType, String errorSpecific, String description) {
        this.code = PREFIX + level + bizError + SystemCode.I_SLIPCORE + bizType + errorSpecific;
        this.description = description;
    }
}
