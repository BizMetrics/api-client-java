package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ProviderRequestCode  {
  
  private String generatedCode = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("generatedCode")
  public String getGeneratedCode() {
    return generatedCode;
  }
  public void setGeneratedCode(String generatedCode) {
    this.generatedCode = generatedCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderRequestCode {\n");
    
    sb.append("  generatedCode: ").append(generatedCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
