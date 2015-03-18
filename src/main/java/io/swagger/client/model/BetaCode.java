package io.swagger.client.model;

import io.swagger.client.model.BMUser;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class BetaCode  {
  
  private Object id = null;
  private BMUser associatedUser = null;
  private String uidSlashCode = null;
  private Date creationInstant = null;
  private Date lastModifiedInstant = null;

  
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
  @JsonProperty("associatedUser")
  public BMUser getAssociatedUser() {
    return associatedUser;
  }
  public void setAssociatedUser(BMUser associatedUser) {
    this.associatedUser = associatedUser;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("uidSlashCode")
  public String getUidSlashCode() {
    return uidSlashCode;
  }
  public void setUidSlashCode(String uidSlashCode) {
    this.uidSlashCode = uidSlashCode;
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
    sb.append("class BetaCode {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  associatedUser: ").append(associatedUser).append("\n");
    sb.append("  uidSlashCode: ").append(uidSlashCode).append("\n");
    sb.append("  creationInstant: ").append(creationInstant).append("\n");
    sb.append("  lastModifiedInstant: ").append(lastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
