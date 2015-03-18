package io.swagger.client.api.services;

import io.swagger.client.api.ApiclientsApi;

public class ClientService {
    final ApiclientsApi api;

    ClientService(ApiclientsApi api) {
        this.api=api;

    }

    public static ClientService getInstance() {
        //TODO make this configurable
        ApiclientsApi apiclientsApi = new ApiclientsApi("http://localhost:9000/");
        return new ClientService(apiclientsApi);
    }
    
    public createClient() {

    }


}
