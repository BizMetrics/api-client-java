package io.swagger.client.model;

import io.swagger.client.model.Status;
import io.swagger.client.model.Account;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Provider  {
  
  private Object id = null;
  private Account account = null;
  private Status providerStatus = null;
  private String alphaUid = null;
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
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("providerStatus")
  public Status getProviderStatus() {
    return providerStatus;
  }
  public void setProviderStatus(Status providerStatus) {
    this.providerStatus = providerStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("alphaUid")
  public String getAlphaUid() {
    return alphaUid;
  }
  public void setAlphaUid(String alphaUid) {
    this.alphaUid = alphaUid;
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
    sb.append("class Provider {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  providerStatus: ").append(providerStatus).append("\n");
    sb.append("  alphaUid: ").append(alphaUid).append("\n");
    sb.append("  creationInstant: ").append(creationInstant).append("\n");
    sb.append("  lastModifiedInstant: ").append(lastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
