package com.alipay.alipay_plus.core.model.util;

import com.alipay.alipay_plus.common.service.facade.enums.IdigitalriskResultCode;
import com.alipay.alipay_plus.common.service.facade.enums.SlipResultEnum;
import com.alipay.alipay_plus.core.model.exception.BaseSlipException;
import com.alipay.alipay_plus.core.model.exception.IdigitalriskException;
import io.micrometer.common.util.StringUtils;
import org.springframework.util.Assert;

public class AssertUtil {

    public static void notNull(final Object object, final SlipResultEnum slipResultEnum, final String resultMsg) {
        check(new AssertTemplate() {
            @Override
            public void doAssert() {
                Assert.notNull(object, "resultMsg");
            }
        }, slipResultEnum, resultMsg);
    }

    public static void notNull(final Object object, final IdigitalriskResultCode idigitalriskResultCode, final String resultMsg) {
        check(new AssertTemplate() {
            @Override
            public void doAssert() {
                Assert.notNull(object, "resultMsg");
            }
        }, idigitalriskResultCode, resultMsg);
    }

    public static interface AssertTemplate {
        public void doAssert();
    }
    private static void check(AssertTemplate assertTemplate, SlipResultEnum slipResultEnum, String resultMsg) {
        try {
            assertTemplate.doAssert();
        } catch (IllegalArgumentException e) {
            if (StringUtils.isBlank(resultMsg)) {
                throw new BaseSlipException(slipResultEnum);
            } else {
                throw new BaseSlipException(slipResultEnum, resultMsg);
            }
        }
    }

    private static void check(AssertTemplate assertTemplate, IdigitalriskResultCode idigitalriskResultCode, String resultMsg) {
        try {
            assertTemplate.doAssert();
        } catch (IllegalArgumentException e) {
            if (StringUtils.isBlank(resultMsg)) {
                throw new IdigitalriskException(idigitalriskResultCode);
            } else {
                throw new BaseSlipException(idigitalriskResultCode, resultMsg);
            }
        }
    }
}
