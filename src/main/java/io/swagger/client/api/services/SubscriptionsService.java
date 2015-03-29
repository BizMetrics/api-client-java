package io.swagger.client.api.services;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.Period;

import io.swagger.client.ApiException;
import io.swagger.client.api.ApisubscriptionsApi;
import io.swagger.client.model.ExternalId;
import io.swagger.client.model.Subscription;
import io.swagger.client.model.SubscriptionStatusChange;
import io.swagger.client.model.Subscription.Status;

public class SubscriptionsService extends Service {

    final ApisubscriptionsApi api;

    SubscriptionsService(ApisubscriptionsApi api) {
        this.api = api;
    }

    public static SubscriptionsService getInstance(String baseUrl) {
        //TODO make this configurable
        ApisubscriptionsApi apisubscriptionsApi = new ApisubscriptionsApi(baseUrl);
        return new SubscriptionsService(apisubscriptionsApi);
    }

    public Subscription createSubscription(DateTime extActivationDate, DateTime extEndDate, String name, Period subsInterval,
            Integer amount, DateTime canceledAt, Status status, String clientId, String planId, String extId,
            DateTime extCreationInstant, DateTime extLastModifiedInstant, Map<String, String> classifiers) throws ApiException {
        checkNotNull(status);
        checkNotNull(extCreationInstant);
        checkNotNull(extId);

        checkNotNull(planId);
        checkNotNull(clientId);

        switch (status) {
        case ACTIVE:
            checkNotNull(extActivationDate, "If the subscription is active, you must supply when it was activated");
            break;
        case CANCELLED:
            checkNotNull(canceledAt, "Seen that the status is cancelled, you must supply the date when it happened");
        case DELETED:
        case EXPIRED:
        case FAILED:
        case INACTIVE:
            checkNotNull(extEndDate, "Given the status " + status + " you must supply when this status was achieved");
        }
        checkArgument(amount == null || amount >= 0, "We currently do not suppot negative amounts");

        Subscription subscription = new Subscription();
        subscription.setClassifiers(classifiers);
        subscription.setStatus(status);
        subscription.setExtCreationInstant(extCreationInstant.toDate());
        subscription.setExternalId(new ExternalId(extId));
        subscription.setPlanId(planId);
        subscription.setClientId(clientId);
        
        subscription.setExtActivationDate(extActivationDate == null ? null : extActivationDate.toDate());
        subscription.setExtEndDate(extEndDate == null ? null : extEndDate.toDate());
        
        subscription.setName(name);
        subscription.setAmount(amount);
        subscription.setCanceledAt(canceledAt == null ? null : canceledAt.toDate());
        subscription.setExtLastModifiedInstant(extLastModifiedInstant == null ? null : extLastModifiedInstant.toDate());

        return api.POST_controllers_api_Subscriptions$_createSubscription(subscription);
    }

    public Subscription changeStatus(Status newStatus, DateTime dateOfChange, boolean force, String extIdSubscriptionToChange)
            throws ApiException {
        checkNotNull(newStatus);
        checkNotNull(dateOfChange);
        checkNotNull(extIdSubscriptionToChange);
        SubscriptionStatusChange subscriptionStatusChange = new SubscriptionStatusChange();
        subscriptionStatusChange.setNewStatus(newStatus);
        subscriptionStatusChange.setDateOfChange(dateOfChange.toDate());
        subscriptionStatusChange.setForce(force);
        return api.PUT_controllers_api_Subscriptions$_changeStatus(subscriptionStatusChange, extIdSubscriptionToChange);
    }


}
