package io.swagger.client.model;

import io.swagger.client.model.AUKey;
import io.swagger.client.model.Role;
import io.swagger.client.model.Account;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class AccountUser  {
  
  private AUKey key = null;
  private Boolean membershipSuspended = null;
  private Role role = null;
  private Object id = null;
  private Account account = null;
  private Date creationInstant = null;
  private Date lastModifiedInstant = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("key")
  public AUKey getKey() {
    return key;
  }
  public void setKey(AUKey key) {
    this.key = key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("membershipSuspended")
  public Boolean getMembershipSuspended() {
    return membershipSuspended;
  }
  public void setMembershipSuspended(Boolean membershipSuspended) {
    this.membershipSuspended = membershipSuspended;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("role")
  public Role getRole() {
    return role;
  }
  public void setRole(Role role) {
    this.role = role;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("id")
  public Object getId() {
    return id;
  }
  public void setId(Object id) {
    this.id = id;
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
    sb.append("class AccountUser {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  membershipSuspended: ").append(membershipSuspended).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  creationInstant: ").append(creationInstant).append("\n");
    sb.append("  lastModifiedInstant: ").append(lastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
