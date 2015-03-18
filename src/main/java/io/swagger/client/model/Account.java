package io.swagger.client.model;

import io.swagger.client.model.ProviderStatus;
import io.swagger.client.model.AccountUser;
import io.swagger.client.model.Event;
import java.util.*;
import io.swagger.client.model.AccountType;
import io.swagger.client.model.ProviderRequestCode;
import java.util.Date;
import io.swagger.client.model.Provider;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Account  {
  
  private Object id = null;
  private Provider provider = null;
  private String name = null;
  private String businessName = null;
  private String website = null;
  private List<AccountUser> members = new ArrayList<AccountUser>() ;
  private Boolean suspended = null;
  private AccountType accountType = null;
  private Event lastEventFullyProcessed = null;
  private ProviderRequestCode providerRequest = null;
  private ProviderStatus providerStatus = null;
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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("businessName")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("members")
  public List<AccountUser> getMembers() {
    return members;
  }
  public void setMembers(List<AccountUser> members) {
    this.members = members;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }
  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("accountType")
  public AccountType getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("lastEventFullyProcessed")
  public Event getLastEventFullyProcessed() {
    return lastEventFullyProcessed;
  }
  public void setLastEventFullyProcessed(Event lastEventFullyProcessed) {
    this.lastEventFullyProcessed = lastEventFullyProcessed;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("providerRequest")
  public ProviderRequestCode getProviderRequest() {
    return providerRequest;
  }
  public void setProviderRequest(ProviderRequestCode providerRequest) {
    this.providerRequest = providerRequest;
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
    sb.append("class Account {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  businessName: ").append(businessName).append("\n");
    sb.append("  website: ").append(website).append("\n");
    sb.append("  members: ").append(members).append("\n");
    sb.append("  suspended: ").append(suspended).append("\n");
    sb.append("  accountType: ").append(accountType).append("\n");
    sb.append("  lastEventFullyProcessed: ").append(lastEventFullyProcessed).append("\n");
    sb.append("  providerRequest: ").append(providerRequest).append("\n");
    sb.append("  providerStatus: ").append(providerStatus).append("\n");
    sb.append("  creationInstant: ").append(creationInstant).append("\n");
    sb.append("  lastModifiedInstant: ").append(lastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
