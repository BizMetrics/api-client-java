package io.swagger.client.api.services;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;

import io.swagger.client.ApiException;
import io.swagger.client.api.ApirefundsApi;
import io.swagger.client.api.ApisubscriptionsApi;
import io.swagger.client.model.RefundBean;

public class RefundsService extends Service {

    final ApirefundsApi api;

    RefundsService(ApirefundsApi api) {
        this.api = api;
    }

    public static RefundsService getInstance(String baseUrl) {
        //TODO make this configurable
        ApirefundsApi apirefundsApi = new ApirefundsApi(baseUrl);
        return new RefundsService(apirefundsApi);
    }

    public RefundBean createRefund(String subscriptionExtId, Integer amount, DateTime refundDate) throws ApiException {
        checkNotNull(refundDate);
        checkNotNull(amount);
        checkArgument(StringUtils.isNotBlank(subscriptionExtId));
        RefundBean refundBean = new RefundBean();
        refundBean.setAmount(amount);
        refundBean.setDateOfChange(refundDate.toDate());

        return api.POST_controllers_api_Refunds$_createRefund(refundBean, subscriptionExtId);

    }
}
