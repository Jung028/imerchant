package com.alipay.merchant.biz.service.impl;

import com.alipay.merchant.biz.service.impl.checker.MerchantRequestChecker;
import com.alipay.merchant.biz.service.impl.helper.ResponseBuilder;
import com.alipay.merchant.biz.service.impl.template.MerchantBizCallback;
import com.alipay.merchant.biz.service.impl.template.MerchantServiceTemplate;
import com.alipay.merchant.common.service.facade.api.MerchantService;
import com.alipay.merchant.common.service.facade.baseresult.MerchantBizResult;
import com.alipay.merchant.common.service.facade.item.MerchantInfoItem;
import com.alipay.merchant.common.service.facade.result.QueryMerchantInfoRequest;
import com.alipay.merchant.core.model.convertor.MerchantInfoConvertor;
import com.alipay.merchant.core.model.domain.MerchantInfo;
import com.alipay.merchant.core.model.enums.MerchantActionEnum;
import com.alipay.merchant.core.service.MerchantInfoRepository;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author adam
 * @date 25/4/2026 6:12 PM
 */

@SofaService(
        interfaceType = MerchantService.class,
        bindings = {
                @SofaServiceBinding(bindingType = "rest"),
                @SofaServiceBinding(bindingType = "bolt")
        }
)
@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantServiceTemplate merchantServiceTemplate;

    @Autowired
    private MerchantInfoRepository merchantInfoRepository;

    @Override
    public MerchantBizResult<MerchantInfoItem> queryMerchantInfo(QueryMerchantInfoRequest request) {
        return merchantServiceTemplate.execute(request, MerchantActionEnum.QUERY_MERCHANT_INFO,
                new MerchantBizCallback<>() {

                    @Override
                    protected MerchantBizResult<MerchantInfoItem> createDefaultResponse() {
                        return new MerchantBizResult<>() {};
                    }

                    @Override
                    protected void checkParams(QueryMerchantInfoRequest request) {
                        MerchantRequestChecker.checkQueryMerchantInfoRequest(request);
                    }

                    @Override
                    protected void process(QueryMerchantInfoRequest request, MerchantBizResult<MerchantInfoItem> response) {
                        MerchantInfo merchantInfo = merchantInfoRepository.queryMerchantInfo(request.getMerchantId());
                        ResponseBuilder.success(response, MerchantInfoConvertor.convertToItem(merchantInfo),
                                MerchantActionEnum.QUERY_MERCHANT_INFO.getCode(),
                                MerchantActionEnum.QUERY_MERCHANT_INFO.getDesc());
                    }
                });
    }
}