package com.alipay.merchant.common.dal.custom;


import com.alipay.merchant.core.model.domain.MerchantInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MerchantInfoDAO {
    MerchantInfo queryMerchantInfo(@Param("merchantId") String merchantId);
}
