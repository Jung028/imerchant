
package com.alipay.merchant.common.service.facade.api;

import com.alipay.merchant.common.service.facade.baseresult.MerchantBizResult;
import com.alipay.merchant.common.service.facade.item.MerchantInfoItem;
import com.alipay.merchant.common.service.facade.result.QueryMerchantInfoRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author adam
 * @date 25/4/2026 6:11 PM
 */

@Path("/merchantService")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface MerchantService {

    @POST
    @Path("queryMerchantInfo")
    MerchantBizResult<MerchantInfoItem> queryMerchantInfo(QueryMerchantInfoRequest request);

}