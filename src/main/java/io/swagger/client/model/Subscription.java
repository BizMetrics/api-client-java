package io.swagger.client.model;

import io.swagger.client.model.ExternalId;

import java.util.Date;

import org.joda.time.Period;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class Subscription  {
  
    public static enum Status {
        ACTIVE, INACTIVE, EXPIRED, FAILED, CANCELLED, DELETED;
    }
  private Date extActivationDate = null;
  private Date extEndDate = null;
  private String name = null;
  private Period subsInterval = null;
  private Integer amount = null;
  private Date canceledAt = null;
  private Status status = null;
  private String clientId = null;
  private String planId = null;
  private ExternalId externalId = null;
  private Date extCreationInstant = null;
  private Date extLastModifiedInstant = null;

  
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
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("planId")
  public String getPlanId() {
    return planId;
  }
  public void setPlanId(String planId) {
    this.planId = planId;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("  extActivationDate: ").append(extActivationDate).append("\n");
    sb.append("  extEndDate: ").append(extEndDate).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  subsInterval: ").append(subsInterval).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  canceledAt: ").append(canceledAt).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  planId: ").append(planId).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  extCreationInstant: ").append(extCreationInstant).append("\n");
    sb.append("  extLastModifiedInstant: ").append(extLastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
