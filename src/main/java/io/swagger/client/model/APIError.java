package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A generic error class with a descriptive reason
 **/
@ApiModel(description = "A generic error class with a descriptive reason")
public class APIError  {
  
  private String reason = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIError {\n");
    
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
