package com.alipay.merchant.core.model.enums;

import java.util.Date;

public enum MerchantActionEnum {
    QUERY_MERCHANT_INFO("QUERY_MERCHANT_INFO", "Query merchant info");

    private String code;
    private String desc;
    MerchantActionEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
