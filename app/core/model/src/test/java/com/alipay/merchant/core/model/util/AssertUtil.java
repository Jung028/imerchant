package com.alipay.merchant.core.model.util;

import com.alipay.merchant.common.service.facade.enums.MerchantResultCode;
import com.alipay.merchant.core.model.exception.BaseSlipException;
import io.micrometer.common.util.StringUtils;
import org.springframework.util.Assert;

public class AssertUtil {

    public static void notNull(final Object object, final MerchantResultCode merchantResultCode, final String resultMsg) {
        check(new AssertTemplate() {
            @Override
            public void doAssert() {
                Assert.notNull(object, "resultMsg");
            }
        }, merchantResultCode, resultMsg);
    }
    public static interface AssertTemplate {
        public void doAssert();
    }
    private static void check(AssertTemplate assertTemplate, MerchantResultCode merchantResultCode, String resultMsg) {
        try {
            assertTemplate.doAssert();
        } catch (IllegalArgumentException e) {
            if (StringUtils.isBlank(resultMsg)) {
                throw new BaseSlipException(merchantResultCode);
            } else {
                throw new BaseSlipException(merchantResultCode, resultMsg);
            }
        }
    }
}
