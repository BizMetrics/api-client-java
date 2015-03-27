package io.swagger.client.api.services;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.HashSet;
import java.util.List;
import org.joda.time.DateTime;


import org.joda.time.DateTime;

import io.swagger.client.ApiException;
import io.swagger.client.api.ApiclientsApi;
import io.swagger.client.model.Client;
import io.swagger.client.model.ExternalId;

public class ClientsService extends Service {
    final ApiclientsApi api;

    ClientsService(ApiclientsApi api) {
        this.api = api;

    }

    public static ClientsService getInstance(String baseUrl) {
        //TODO make this configurable
        ApiclientsApi apiclientsApi = new ApiclientsApi(baseUrl);
        return new ClientsService(apiclientsApi);
    }

    public Client createClient(String name, String email, String description, String extId, DateTime creationInstant,
            DateTime modificationTime) throws ApiException {
        checkNotNull(creationInstant);
        checkNotNull(extId);
        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setDescription(description);
        client.setExternalId(new ExternalId(extId));
        client.setExtCreationInstant(creationInstant.toDate());
        client.setExtLastModifiedInstant(modificationTime != null ? modificationTime.toDate() : null);
        return api.POST_controllers_api_Clients$_create(client);
    }

    public List<Client> createClients(List<Client> clients) throws ApiException {
        checkObjects(clients);
        return api.POST_controllers_api_Clients$_createFromArray(clients);
        
    }
}
