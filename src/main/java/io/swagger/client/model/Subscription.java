package io.swagger.client.model;

import io.swagger.client.model.Status;
import io.swagger.client.model.ExternalId;
import io.swagger.client.model.Period;
import io.swagger.client.model.Plan;
import io.swagger.client.model.Client;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class Subscription  {
  
  private Date extActivationDate = null;
  private Date extEndDate = null;
  private Plan plan = null;
  private Client client = null;
  private String currency = null;
  private String name = null;
  private Date dateOfNextCharge = null;
  private Period subsInterval = null;
  private Period validityOfSubscription = null;
  private Integer amount = null;
  private Date trialStartTime = null;
  private Date trialEndTime = null;
  private Date canceledAt = null;
  private Status status = null;
  private Long id = null;
  private Integer version = null;
  private ExternalId externalId = null;
  private Date extCreationInstant = null;
  private Date extLastModifiedInstant = null;
  private Date creationInstant = null;
  private Date lastModifiedInstant = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("extActivationDate")
  public Date getExtActivationDate() {
    return extActivationDate;
  }
  public void setExtActivationDate(Date extActivationDate) {
    this.extActivationDate = extActivationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("extEndDate")
  public Date getExtEndDate() {
    return extEndDate;
  }
  public void setExtEndDate(Date extEndDate) {
    this.extEndDate = extEndDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("plan")
  public Plan getPlan() {
    return plan;
  }
  public void setPlan(Plan plan) {
    this.plan = plan;
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
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
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
  @JsonProperty("dateOfNextCharge")
  public Date getDateOfNextCharge() {
    return dateOfNextCharge;
  }
  public void setDateOfNextCharge(Date dateOfNextCharge) {
    this.dateOfNextCharge = dateOfNextCharge;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("subsInterval")
  public Period getSubsInterval() {
    return subsInterval;
  }
  public void setSubsInterval(Period subsInterval) {
    this.subsInterval = subsInterval;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("validityOfSubscription")
  public Period getValidityOfSubscription() {
    return validityOfSubscription;
  }
  public void setValidityOfSubscription(Period validityOfSubscription) {
    this.validityOfSubscription = validityOfSubscription;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("trialStartTime")
  public Date getTrialStartTime() {
    return trialStartTime;
  }
  public void setTrialStartTime(Date trialStartTime) {
    this.trialStartTime = trialStartTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("trialEndTime")
  public Date getTrialEndTime() {
    return trialEndTime;
  }
  public void setTrialEndTime(Date trialEndTime) {
    this.trialEndTime = trialEndTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("canceledAt")
  public Date getCanceledAt() {
    return canceledAt;
  }
  public void setCanceledAt(Date canceledAt) {
    this.canceledAt = canceledAt;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }
  public void setStatus(Status status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
    sb.append("class Subscription {\n");
    
    sb.append("  extActivationDate: ").append(extActivationDate).append("\n");
    sb.append("  extEndDate: ").append(extEndDate).append("\n");
    sb.append("  plan: ").append(plan).append("\n");
    sb.append("  client: ").append(client).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  dateOfNextCharge: ").append(dateOfNextCharge).append("\n");
    sb.append("  subsInterval: ").append(subsInterval).append("\n");
    sb.append("  validityOfSubscription: ").append(validityOfSubscription).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  trialStartTime: ").append(trialStartTime).append("\n");
    sb.append("  trialEndTime: ").append(trialEndTime).append("\n");
    sb.append("  canceledAt: ").append(canceledAt).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  extCreationInstant: ").append(extCreationInstant).append("\n");
    sb.append("  extLastModifiedInstant: ").append(extLastModifiedInstant).append("\n");
    sb.append("  creationInstant: ").append(creationInstant).append("\n");
    sb.append("  lastModifiedInstant: ").append(lastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
