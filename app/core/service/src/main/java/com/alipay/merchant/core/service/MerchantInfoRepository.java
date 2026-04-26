package com.alipay.merchant.core.service;

import com.alipay.merchant.core.model.domain.MerchantInfo;

/**
 * @author adam
 * @date 25/4/2026 5:19 PM
 */
public interface MerchantInfoRepository {
    MerchantInfo queryMerchantInfo(String merchantId);
}