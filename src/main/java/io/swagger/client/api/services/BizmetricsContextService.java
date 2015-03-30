package io.swagger.client.api.services;

import com.sun.jersey.core.util.Base64;

import io.swagger.client.ApiInvoker;

public class BizmetricsContextService {

    public static void setCredentials(String username, String password) {
        ApiInvoker apiInvoker = ApiInvoker.getInstance();
        String userCredentials = username + ":" + password;
        String basicAuth = "Basic " + new String(Base64.encode(userCredentials.getBytes()));
        apiInvoker.addDefaultHeader("Authorization", basicAuth);
    }

}
