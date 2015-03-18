package io.swagger.client.model;

import io.swagger.client.model.Account;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ExternalId  {
  
  private String externalId = null;
  private Account account = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalId {\n");
    
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
