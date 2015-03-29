package io.swagger.client.api.services;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Period;

import io.swagger.client.ApiException;
import io.swagger.client.api.ApiclientsApi;
import io.swagger.client.api.ApiplansApi;
import io.swagger.client.model.Client;
import io.swagger.client.model.ExternalId;
import io.swagger.client.model.Plan;
import io.swagger.client.model.Plan.PlanState;

public class PlansService extends Service {
    final ApiplansApi api;

    PlansService(ApiplansApi api) {
        this.api = api;

    }

    public static PlansService getInstance(String baseUrl) {
        //TODO make this configurable
        ApiplansApi apiplansApi = new ApiplansApi(baseUrl);
        return new PlansService(apiplansApi);
    }

    public Plan createPlan(String extId, Integer amount, String currency, String metaDescription, Period planInterval,
            PlanState state, String name, DateTime extCreationInstant, DateTime extLastModifiedInstant,
            Map<String, String> classifiers) throws ApiException {
        checkNotNull(extId);
        checkNotNull(amount);
        checkArgument(amount > 0);
        checkArgument(StringUtils.isNotBlank(currency));
        checkNotNull(planInterval);
        checkNotNull(extCreationInstant);
        checkNotNull(state);
        DateTime timeOfLastModification = extLastModifiedInstant == null ? extCreationInstant : extLastModifiedInstant;

        Plan plan = new Plan();
        plan.setClassifiers(classifiers);
        plan.setExternalId(new ExternalId(extId));
        plan.setAmount(amount);
        plan.setCurrency(currency);
        plan.setMetaDescription(metaDescription);
        plan.setPlanInterval(planInterval);
        plan.setState(state);
        plan.setName(name);
        plan.setExtCreationInstant(extCreationInstant.toDate());
        plan.setExtLastModifiedInstant(timeOfLastModification.toDate());
        plan.setExternalId(new ExternalId(extId));

        //api.POST_controllers_api_Plans$_create(plan)
        return api.POST_controllers_api_Plans$_create(plan);

    }


    public List<Plan> createPlans(List<Plan> plans) throws ApiException {
        checkObjects(plans);
        return api.POST_controllers_api_Plans$_createFromArray(plans);

    }

//    public List<Client> createClients(List<Client> clients) throws ApiException {
//        Map<String, Client> extIds = new HashMap<String, Client>();
//        for (Client client : clients) {
//            checkNotNull(client.getExternalId().getExternalId());
//            checkNotNull(client.getExtCreationInstant());
//            if (extIds.keySet().contains(client.getExternalId().getExternalId())) {
//                throw new RuntimeException("External ID repeated. Ext id: " + client.getExternalId().getExternalId()
//                        + " clients in conflict: " + extIds.get(client).getExternalId().getExternalId() + " and: " + client);
//            }
//            extIds.put(client.getExternalId().getExternalId(), client);
//        }
//        
//        return api.POST_controllers_api_Clients$_createFromArray(clients);
//        
//    }
}
