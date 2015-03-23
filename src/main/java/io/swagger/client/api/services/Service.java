package io.swagger.client.api.services;

import static com.google.common.base.Preconditions.checkNotNull;
import io.swagger.client.ApiException;
import io.swagger.client.model.ModelInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {

    public Service() {
        super();
    }

    protected <T extends ModelInterface> void checkObjects(List<T> objects) throws ApiException {
        Map<String, T> extIds = new HashMap<String, T>();
        for (T t : objects) {
            checkNotNull(t.getExternalId().getExternalId());
            checkNotNull(t.getExtCreationInstant());
            if (extIds.keySet().contains(t.getExternalId().getExternalId())) {
                throw new RuntimeException("External ID repeated. Ext id: " + t.getExternalId().getExternalId()
                        + t.getClass().getSimpleName() + " in conflict: " + extIds.get(t).getExternalId().getExternalId()
                        + " and: " + t);
            }
            extIds.put(t.getExternalId().getExternalId(), t);
        }
        
    }

}