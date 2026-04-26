package com.alipay.merchant.core.model.context;

import com.alipay.merchant.core.model.enums.MerchantActionEnum;

import java.util.Date;

public class MerchantContext {

    private static final long serialVersionUID = 1L;

    private Date time;
    private MerchantActionEnum action;
    private String operatorId;
    private String operatorName;


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public MerchantActionEnum getAction() {
        return action;
    }

    public void setAction(MerchantActionEnum action) {
        this.action = action;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public MerchantContext(MerchantActionEnum action, Date time, String operatorId, String operatorName) {
        this.action = action;
        this.time = time;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
    }
}
