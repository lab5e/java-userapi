/*
 * The User API
 * API to manage teams, members and tokens
 *
 * The version of the OpenAPI document: 1.3.10 constant-champ
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
import com.lab5e.user.model.Invite;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of active invites. Onece an invite has been redeemed it will be removed automatically. An administrator of the team can delete unused invites.
 */
@ApiModel(description = "List of active invites. Onece an invite has been redeemed it will be removed automatically. An administrator of the team can delete unused invites.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-03T20:30:32.460Z[GMT]")
public class InviteList {
  public static final String SERIALIZED_NAME_INVITES = "invites";
  @SerializedName(SERIALIZED_NAME_INVITES)
  private List<Invite> invites = null;


  public InviteList invites(List<Invite> invites) {
    
    this.invites = invites;
    return this;
  }

  public InviteList addInvitesItem(Invite invitesItem) {
    if (this.invites == null) {
      this.invites = new ArrayList<>();
    }
    this.invites.add(invitesItem);
    return this;
  }

   /**
   * Get invites
   * @return invites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Invite> getInvites() {
    return invites;
  }


  public void setInvites(List<Invite> invites) {
    this.invites = invites;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteList inviteList = (InviteList) o;
    return Objects.equals(this.invites, inviteList.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteList {\n");
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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

