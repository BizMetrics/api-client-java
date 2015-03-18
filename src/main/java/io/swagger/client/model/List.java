package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class List  {
  
  private Boolean empty = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class List {\n");
    
    sb.append("  empty: ").append(empty).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
