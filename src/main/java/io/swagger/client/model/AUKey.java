package io.swagger.client.model;

import io.swagger.client.model.Account;
import io.swagger.client.model.BMUser;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class AUKey  {
  
  private BMUser bmUser = null;
  private Account account = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("bmUser")
  public BMUser getBmUser() {
    return bmUser;
  }
  public void setBmUser(BMUser bmUser) {
    this.bmUser = bmUser;
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
    sb.append("class AUKey {\n");
    
    sb.append("  bmUser: ").append(bmUser).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
