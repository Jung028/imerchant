package com.alipay.alipay_plus.core.service.idigitalrisk.repository.impl;

import com.alipay.alipay_plus.common.service.facade.enums.IdigitalriskResultCode;
import com.alipay.alipay_plus.core.model.exception.IdigitalriskException;
import com.alipay.alipay_plus.core.model.util.AssertUtil;
import com.alipay.alipay_plus.core.service.idigitalrisk.repository.AbstractDomainRepository;
import com.alipay.alipay_plus.core.service.idigitalrisk.repository.RiskEventRepository;

public class RiskEventRepositoryImpl extends AbstractDomainRepository implements RiskEventRepository {


    @Override
    public void selectAgeAndPaymentId() {
        // DO convertDO
        TestDO testDO = testMapperDAO.selectAgeAndPaymentId();
        AssertUtil.notNull(testDO, IdigitalriskResultCode.SYSTEM_EXCEPTION, "testMapperDAO must not be null");

    }
}
