package com.alipay.alipay_plus.core.model.context;

import com.alipay.alipay_plus.core.model.enums.IdigitalriskActionEnum;

import java.util.Date;

public class IdigitalriskContext {

    private static final long serialVersionUID = 1L;

    private Date time;
    private IdigitalriskActionEnum action;
    private String operatorId;
    private String operatorName;


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public IdigitalriskActionEnum getAction() {
        return action;
    }

    public void setAction(IdigitalriskActionEnum action) {
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

    public IdigitalriskContext(IdigitalriskActionEnum action, Date time, String operatorId, String operatorName) {
        this.action = action;
        this.time = time;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
    }
}
