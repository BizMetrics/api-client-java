package io.swagger.client.model;

import io.swagger.client.model.ExternalId;
import io.swagger.client.model.Client;
import io.swagger.client.model.Subscription;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Event  {
  
  private Object id = null;
  private ExternalId externalId = null;
  private Client client = null;
  private Subscription subscription = null;
  private Date extCreationInstant = null;
  private Date creationInstant = null;
  private Date lastModifiedInstant = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("id")
  public Object getId() {
    return id;
  }
  public void setId(Object id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("externalId")
  public ExternalId getExternalId() {
    return externalId;
  }
  public void setExternalId(ExternalId externalId) {
    this.externalId = externalId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("client")
  public Client getClient() {
    return client;
  }
  public void setClient(Client client) {
    this.client = client;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("subscription")
  public Subscription getSubscription() {
    return subscription;
  }
  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("extCreationInstant")
  public Date getExtCreationInstant() {
    return extCreationInstant;
  }
  public void setExtCreationInstant(Date extCreationInstant) {
    this.extCreationInstant = extCreationInstant;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("creationInstant")
  public Date getCreationInstant() {
    return creationInstant;
  }
  public void setCreationInstant(Date creationInstant) {
    this.creationInstant = creationInstant;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("lastModifiedInstant")
  public Date getLastModifiedInstant() {
    return lastModifiedInstant;
  }
  public void setLastModifiedInstant(Date lastModifiedInstant) {
    this.lastModifiedInstant = lastModifiedInstant;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  client: ").append(client).append("\n");
    sb.append("  subscription: ").append(subscription).append("\n");
    sb.append("  extCreationInstant: ").append(extCreationInstant).append("\n");
    sb.append("  creationInstant: ").append(creationInstant).append("\n");
    sb.append("  lastModifiedInstant: ").append(lastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
