/*
 * The User API
 * API to manage teams, members and tokens
 *
 * The version of the OpenAPI document: 1.3.7 frequent-amara
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.user.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lab5e.user.model.UserProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Member
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T15:24:30.863Z[GMT]")
public class Member {
  public static final String SERIALIZED_NAME_TEAM_ID = "teamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserProfile user;


  public Member teamId(String teamId) {
    
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeamId() {
    return teamId;
  }


  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public Member role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public Member userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Member user(UserProfile user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserProfile getUser() {
    return user;
  }


  public void setUser(UserProfile user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.teamId, member.teamId) &&
        Objects.equals(this.role, member.role) &&
        Objects.equals(this.userId, member.userId) &&
        Objects.equals(this.user, member.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, role, userId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

