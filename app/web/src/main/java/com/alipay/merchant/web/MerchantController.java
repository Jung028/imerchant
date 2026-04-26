package com.alipay.merchant.web;

import com.alipay.merchant.common.service.facade.api.MerchantService;
import com.alipay.merchant.common.service.facade.baseresult.MerchantBizResult;
import com.alipay.merchant.common.service.facade.item.MerchantInfoItem;
import com.alipay.merchant.common.service.facade.result.QueryMerchantInfoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adam
 * @date 25/4/2026 6:36 PM
 */

@RestController
@RequestMapping("/merchant/")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @PostMapping("/queryMerchantInfo")
    public MerchantBizResult<MerchantInfoItem> queryMerchantInfo(@RequestBody QueryMerchantInfoRequest request) {
        return merchantService.queryMerchantInfo(request);
    }
}