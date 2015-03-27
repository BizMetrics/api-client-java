package io.swagger.client.model;

import io.swagger.client.model.ExternalId;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class RefundBean  {
  
  private ExternalId extId = null;
  private Integer amount = null;
  private Date dateOfChange = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("extId")
  public ExternalId getExtId() {
    return extId;
  }
  public void setExtId(ExternalId extId) {
    this.extId = extId;
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
  @JsonProperty("dateOfChange")
  public Date getDateOfChange() {
    return dateOfChange;
  }
  public void setDateOfChange(Date dateOfChange) {
    this.dateOfChange = dateOfChange;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundBean {\n");
    
    sb.append("  extId: ").append(extId).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  dateOfChange: ").append(dateOfChange).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
