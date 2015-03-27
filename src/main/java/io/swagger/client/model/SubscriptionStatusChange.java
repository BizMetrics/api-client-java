package io.swagger.client.model;

import io.swagger.client.model.Subscription.Status;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class SubscriptionStatusChange  {
  
  private Status newStatus = null;
  private Date dateOfChange = null;
  private Boolean force = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("newStatus")
  public Status getNewStatus() {
    return newStatus;
  }
  public void setNewStatus(Status newStatus) {
    this.newStatus = newStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("dateOfChange")
  public Date getDateOfChange() {
    return dateOfChange;
  }
  public void setDateOfChange(Date dateOfChange) {
    this.dateOfChange = dateOfChange;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }
  public void setForce(Boolean force) {
    this.force = force;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionStatusChange {\n");
    
    sb.append("  newStatus: ").append(newStatus).append("\n");
    sb.append("  dateOfChange: ").append(dateOfChange).append("\n");
    sb.append("  force: ").append(force).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
