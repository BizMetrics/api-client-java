package io.swagger.client.model;

import io.swagger.client.model.ProviderStatus;
import java.util.Date;
import io.swagger.client.model.Provider;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Status  {
  
  private Object id = null;
  private ProviderStatus providerStatus = null;
  private Provider provider = null;
  private Date extCreationInstant = null;
  private Date extLastModifiedInstant = null;
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
  @JsonProperty("providerStatus")
  public ProviderStatus getProviderStatus() {
    return providerStatus;
  }
  public void setProviderStatus(ProviderStatus providerStatus) {
    this.providerStatus = providerStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("provider")
  public Provider getProvider() {
    return provider;
  }
  public void setProvider(Provider provider) {
    this.provider = provider;
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
  @JsonProperty("extLastModifiedInstant")
  public Date getExtLastModifiedInstant() {
    return extLastModifiedInstant;
  }
  public void setExtLastModifiedInstant(Date extLastModifiedInstant) {
    this.extLastModifiedInstant = extLastModifiedInstant;
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
    sb.append("class Status {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  providerStatus: ").append(providerStatus).append("\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("  extCreationInstant: ").append(extCreationInstant).append("\n");
    sb.append("  extLastModifiedInstant: ").append(extLastModifiedInstant).append("\n");
    sb.append("  creationInstant: ").append(creationInstant).append("\n");
    sb.append("  lastModifiedInstant: ").append(lastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
