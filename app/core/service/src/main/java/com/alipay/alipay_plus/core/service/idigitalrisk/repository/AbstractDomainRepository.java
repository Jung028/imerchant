package com.alipay.alipay_plus.core.service.idigitalrisk.repository;

import com.alipay.alipay_plus.common.service.facade.auto.daointerface.custom.TestMapperDAO;

public class AbstractDomainRepository {

    protected TestMapperDAO testMapperDAO;

    public void setTestMapperDAO(TestMapperDAO testMapperDAO) {
        this.testMapperDAO = testMapperDAO;
    }
}
