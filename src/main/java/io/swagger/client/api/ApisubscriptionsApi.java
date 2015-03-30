package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Subscription;
import io.swagger.client.model.SubscriptionStatusChange;

import com.sun.jersey.core.util.Base64;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.HashMap;

public class ApisubscriptionsApi {
  String basePath = "http://localhost:9000/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

    String username;
    String password;

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
    public ApisubscriptionsApi(String basePath) {
        super();
        setBasePath(basePath);
    }

    
    public Subscription POST_controllers_api_Subscriptions$_createSubscription(Subscription subs) throws ApiException {
        Object postBody = subs;
    

    // create path and map variables
    String path = "/api/subscriptions".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/json"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {

      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
                return (Subscription) ApiInvoker.deserialize(response, "", Subscription.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
    
    public Subscription PUT_controllers_api_Subscriptions$_changeStatus(SubscriptionStatusChange subscriptionStatusChange,
            String extId)
            throws ApiException {
        Object postBody = subscriptionStatusChange;
    

    // create path and map variables
        String path = "/api/subscriptions/".replaceAll("\\{format\\}", "json");
        try {
            path += URLEncoder.encode(extId, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new ApiException(e);
        }

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/json"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
                return (Subscription) ApiInvoker.deserialize(response, "", Subscription.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
}
