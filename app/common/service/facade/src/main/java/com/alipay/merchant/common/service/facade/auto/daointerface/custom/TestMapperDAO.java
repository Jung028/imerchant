package com.alipay.merchant.common.service.facade.auto.daointerface.custom;

import com.alipay.merchant.common.service.facade.auto.dataobject.test;
import java.util.List;

public interface TestMapperDAO {
    // Custom query selecting specific columns
    List<test> selectAgeAndPaymentId();

    // Another example: query with condition
    List<test> selectByStatus(String status);
}
