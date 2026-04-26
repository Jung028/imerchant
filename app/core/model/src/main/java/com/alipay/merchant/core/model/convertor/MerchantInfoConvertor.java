package com.alipay.merchant.core.model.convertor;

import com.alipay.merchant.common.dal.auto.dataobject.MerchantInfoDO;
import com.alipay.merchant.common.service.facade.item.MerchantInfoItem;
import com.alipay.merchant.core.model.domain.MerchantInfo;

/**
 * @author adam
 * @date 25/4/2026 6:31 PM
 */
public class MerchantInfoConvertor {

    public static MerchantInfoItem convertToItem(MerchantInfo merchantInfo) {
        if (merchantInfo == null) {
            return null;
        }
        MerchantInfoItem merchantInfoItem = new MerchantInfoItem();
        merchantInfoItem.setMerchantId(merchantInfo.getMerchantId());
        merchantInfoItem.setMerchantName(merchantInfo.getMerchantName());
        merchantInfoItem.setCreatedAt(merchantInfo.getCreatedAt());
        merchantInfoItem.setUpdatedAt(merchantInfo.getUpdatedAt());
        merchantInfoItem.setMerchantType(merchantInfo.getMerchantType());
        merchantInfoItem.setStatus(merchantInfo.getStatus());
        return merchantInfoItem;
    }

    public static MerchantInfoItem convertToDomain(MerchantInfo merchantInfo) {
        if (merchantInfo == null) {
            return null;
        }
        MerchantInfoItem merchantInfoItem = new MerchantInfoItem();
        merchantInfoItem.setMerchantId(merchantInfo.getMerchantId());
        merchantInfoItem.setMerchantName(merchantInfo.getMerchantName());
        merchantInfoItem.setCreatedAt(merchantInfo.getCreatedAt());
        merchantInfoItem.setUpdatedAt(merchantInfo.getUpdatedAt());
        merchantInfoItem.setMerchantType(merchantInfo.getMerchantType());
        merchantInfoItem.setStatus(merchantInfo.getStatus());
        return merchantInfoItem;
    }

    public static MerchantInfo convertToModel(MerchantInfoDO merchantInfoDO) {
        if (merchantInfoDO == null) {
            return null;
        }
        MerchantInfo merchantInfo = new MerchantInfo();
        merchantInfo.setMerchantId(merchantInfo.getMerchantId());
        merchantInfo.setMerchantName(merchantInfo.getMerchantName());
        merchantInfo.setCreatedAt(merchantInfo.getCreatedAt());
        merchantInfo.setUpdatedAt(merchantInfo.getUpdatedAt());
        merchantInfo.setMerchantType(merchantInfo.getMerchantType());
        merchantInfo.setStatus(merchantInfo.getStatus());
        return merchantInfo;
    }
}