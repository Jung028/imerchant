package com.alipay.merchant.core.model.convertor;

import com.alipay.merchant.common.service.facade.item.MerchantInfoItem;
import com.alipay.merchant.core.model.domain.MerchantInfo;

/**
 * @author adam
 * @date 25/4/2026 6:31 PM
 */
public class MerchantInfoConvertor {

    public static MerchantInfoItem convertToItem(MerchantInfo merchantInfo) {
        MerchantInfoItem merchantInfoItem = new MerchantInfoItem();
        merchantInfoItem.setMerchantId(merchantInfo.getMerchantId());
        merchantInfoItem.setMerchantName(merchantInfo.getMerchantName());
        merchantInfoItem.setCreatedAt(merchantInfo.getCreatedAt());
        merchantInfoItem.setUpdatedAt(merchantInfo.getUpdatedAt());
        merchantInfoItem.setMerchantType(merchantInfo.getMerchantType());
        merchantInfoItem.setStatus(merchantInfo.getStatus());
        return merchantInfoItem;
    }
}