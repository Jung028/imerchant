package com.alipay.merchant.core.service;

import com.alipay.merchant.common.dal.auto.custom.MerchantInfoDAO;
import com.alipay.merchant.common.dal.auto.dataobject.MerchantInfoDO;
import com.alipay.merchant.core.model.convertor.MerchantInfoConvertor;
import com.alipay.merchant.core.model.domain.MerchantInfo;
import com.alipay.merchant.core.model.exception.RepositoryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author adam
 * @date 25/4/2026 5:20 PM
 */
@Repository
public class MerchantInfoRepositoryImpl implements MerchantInfoRepository {

    @Autowired
    private MerchantInfoDAO merchantInfoDAO;

    @Override
    public MerchantInfo queryMerchantInfo(String merchantId) {
        try {
            MerchantInfoDO merchantInfoDO = merchantInfoDAO.queryMerchantInfo(merchantId);
            if (merchantInfoDO == null) {
                throw new RepositoryException("MerchantInfoDO is null");
            }
            return MerchantInfoConvertor.convertToModel(merchantInfoDO);
        } catch (RepositoryException e) {
            throw new RepositoryException(e.getMessage());
        }
    }
}