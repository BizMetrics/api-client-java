package io.swagger.client.model;

import io.swagger.client.model.Role;
import io.swagger.client.model.BetaCode;
import io.swagger.client.model.Account;
import io.swagger.client.model.AccountUser;
import io.swagger.client.model.List[Role];
import io.swagger.client.model.List[? extends be.objectify.deadbolt.core.models.Permission];
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class BMUser  {
  
  private Object id = null;
  private BetaCode betaCode = null;
  private String email = null;
  private String password = null;
  private String username = null;
  private Boolean suspended = null;
  private String firstName = null;
  private String providerId = null;
  private String lastName = null;
  private String avatarUrl = null;
  private Date lastLoginInstant = null;
  private Role role = null;
  private List<AccountUser> accountUsers = new ArrayList<AccountUser>() ;
  private List[? extends be.objectify.deadbolt.core.models.Permission] permissions = null;
  private String identifier = null;
  private Boolean active = null;
  private Account defaultAccount = null;
  private AccountUser defaultAccountUser = null;
  private List[Role] roles = null;
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
  @JsonProperty("betaCode")
  public BetaCode getBetaCode() {
    return betaCode;
  }
  public void setBetaCode(BetaCode betaCode) {
    this.betaCode = betaCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }
  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("providerId")
  public String getProviderId() {
    return providerId;
  }
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("avatarUrl")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("lastLoginInstant")
  public Date getLastLoginInstant() {
    return lastLoginInstant;
  }
  public void setLastLoginInstant(Date lastLoginInstant) {
    this.lastLoginInstant = lastLoginInstant;
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
  @JsonProperty("accountUsers")
  public List<AccountUser> getAccountUsers() {
    return accountUsers;
  }
  public void setAccountUsers(List<AccountUser> accountUsers) {
    this.accountUsers = accountUsers;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("permissions")
  public List[? extends be.objectify.deadbolt.core.models.Permission] getPermissions() {
    return permissions;
  }
  public void setPermissions(List[? extends be.objectify.deadbolt.core.models.Permission] permissions) {
    this.permissions = permissions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("defaultAccount")
  public Account getDefaultAccount() {
    return defaultAccount;
  }
  public void setDefaultAccount(Account defaultAccount) {
    this.defaultAccount = defaultAccount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("defaultAccountUser")
  public AccountUser getDefaultAccountUser() {
    return defaultAccountUser;
  }
  public void setDefaultAccountUser(AccountUser defaultAccountUser) {
    this.defaultAccountUser = defaultAccountUser;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("roles")
  public List[Role] getRoles() {
    return roles;
  }
  public void setRoles(List[Role] roles) {
    this.roles = roles;
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
    sb.append("class BMUser {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  betaCode: ").append(betaCode).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  suspended: ").append(suspended).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  providerId: ").append(providerId).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  lastLoginInstant: ").append(lastLoginInstant).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("  accountUsers: ").append(accountUsers).append("\n");
    sb.append("  permissions: ").append(permissions).append("\n");
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  defaultAccount: ").append(defaultAccount).append("\n");
    sb.append("  defaultAccountUser: ").append(defaultAccountUser).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  creationInstant: ").append(creationInstant).append("\n");
    sb.append("  lastModifiedInstant: ").append(lastModifiedInstant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
