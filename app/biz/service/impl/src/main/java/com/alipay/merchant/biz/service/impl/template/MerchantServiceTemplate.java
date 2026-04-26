package com.alipay.merchant.biz.service.impl.template;

import com.alipay.merchant.biz.service.impl.helper.MerchantResultHelper;
import com.alipay.merchant.common.service.facade.baseresult.MerchantBaseRequest;
import com.alipay.merchant.common.service.facade.baseresult.MerchantBaseResult;
import com.alipay.merchant.common.service.facade.constant.LoggerConstant;
import com.alipay.merchant.common.service.facade.enums.MerchantResultCode;
import com.alipay.merchant.common.util.EventContext;
import com.alipay.merchant.common.util.LogUtil;
import com.alipay.merchant.common.util.TenantUtil;
import com.alipay.merchant.common.util.enums.IpayTenantEnum;
import com.alipay.merchant.core.model.context.MerchantContextHolder;
import com.alipay.merchant.core.model.enums.MerchantActionEnum;
import com.alipay.merchant.core.model.exception.MerchantException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class MerchantServiceTemplate {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerConstant.MERCHANT_BIZ_SERVICE);

    /**
     * execute
     *
     * @param request digital risk request
     * @param action digital risk action
     * @param callback digital risk biz callback
     * @return digital risk result
     */
    public <T extends MerchantBaseRequest, R extends MerchantBaseResult> R execute(
            final T request,
            final MerchantActionEnum action,
            final MerchantBizCallback<T, R> callback) {

        R result = callback.createDefaultResponse();

        LogUtil.info(LOGGER, "service request[", request, "]");

        try {
            callback.checkParams(request);

            initContext(action, request);

            callback.process(request, result);

            MerchantResultHelper.fillSuccessResultCode(result);

        } catch (MerchantException e) {

            LogUtil.warn(LOGGER, e, "service process exception[", request, "]", ", code = "
                    , e.getResultCode(), ", msg= ", e.getMessage());

            MerchantResultHelper.fillExceptionResultCode(result, e.getResultCode());

        } catch (Throwable e) {
            LogUtil.error(LOGGER, e, "service process unexpected exception[", request, "]");

            MerchantResultHelper.fillExceptionResultCode(result, MerchantResultCode.SYSTEM_EXCEPTION);

        } finally {
            printDigestLog(result);

            LogUtil.info(LOGGER, "service result[" , result , "] [request =", request, "]" );

            MerchantContextHolder.clear();
        }


        return result;
    }

    private <R extends MerchantBaseResult> void printDigestLog(R result) {
    }

    private <T extends MerchantBaseRequest, R extends MerchantBaseResult> void initContext(MerchantActionEnum action, T request) {
        EventContext context = TenantUtil.getCurrentEventContext();
        context.setTntInstId(IpayTenantEnum.IPAY_SG.getTntInstId());
        TenantUtil.setCurrentEventContext(context);
       // BusinessContextHolder.set(action, slipExtraDAO.updateAndGetSystemDate(),request.getOperatorId(), request.getOperatorName());

    }
}
