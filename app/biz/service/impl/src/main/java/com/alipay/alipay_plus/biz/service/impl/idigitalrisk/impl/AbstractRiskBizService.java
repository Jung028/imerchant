package com.alipay.alipay_plus.biz.service.impl.idigitalrisk.impl;

import com.alipay.alipay_plus.core.service.idigitalrisk.repository.RiskEventRepository;

public abstract class AbstractRiskBizService {

    protected RiskEventRepository riskEventRepository;

    /**
     *
     * @param riskEventRepository
     */
    public void setRiskEventRepository(RiskEventRepository riskEventRepository) {
        this.riskEventRepository = riskEventRepository;
    }
}
