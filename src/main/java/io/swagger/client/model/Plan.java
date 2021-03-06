package io.swagger.client.model;

import io.swagger.client.model.ExternalId;

import java.util.*;
import java.util.List;

import io.swagger.client.model.Subscription;

import java.util.Date;

import org.joda.time.Period;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class Plan implements ModelInterface {

    public static enum PlanState {
        ACTIVE, INACTIVE;
    }
  
  private Integer amount = null;
  private String currency = null;
  private String metaDescription = null;
  private Period planInterval = null;
  private PlanState state = null;
  private String name = null;
  private Map<String,String> classifiers = null;
  private ExternalId externalId = null;
  private Date extCreationInstant = null;
  private Date extLastModifiedInstant = null;

  
  
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
  @JsonProperty("metaDescription")
  public String getMetaDescription() {
    return metaDescription;
  }
  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("planInterval")
  public Period getPlanInterval() {
    return planInterval;
  }
  public void setPlanInterval(Period planInterval) {
    this.planInterval = planInterval;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("state")
  public PlanState getState() {
    return state;
  }
  public void setState(PlanState state) {
    this.state = state;
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
  @JsonProperty("classifiers")
  public Map<String,String> getClassifiers() {
    return classifiers;
  }
  public void setClassifiers(Map<String,String> classifiers) {
    this.classifiers = classifiers;
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
    sb.append("class Plan {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  metaDescription: ").append(metaDescription).append("\n");
    sb.append("  planInterval: ").append(planInterval).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  classifiers: ").append(classifiers).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  extCreationInstant: ").append(extCreationInstant).append("\n");
    sb.append("  extLastModifiedInstant: ").append(extLastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
