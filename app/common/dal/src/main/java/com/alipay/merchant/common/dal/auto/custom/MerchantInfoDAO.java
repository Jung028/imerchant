package com.alipay.merchant.common.dal.auto.custom;


import com.alipay.merchant.common.dal.auto.dataobject.MerchantInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MerchantInfoDAO {

    MerchantInfoDO queryMerchantInfo(@Param("merchantId") String merchantId);
}
