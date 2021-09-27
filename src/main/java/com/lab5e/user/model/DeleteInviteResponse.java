/*
 * The User API
 * API to manage teams, members and tokens
 *
 * The version of the OpenAPI document: 1.3.11 lucky-fremont
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

/**
 * DeleteInviteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T20:56:39.273Z[GMT]")
public class DeleteInviteResponse {
  public static final String SERIALIZED_NAME_INVITE = "invite";
  @SerializedName(SERIALIZED_NAME_INVITE)
  private Invite invite;


  public DeleteInviteResponse invite(Invite invite) {
    
    this.invite = invite;
    return this;
  }

   /**
   * Get invite
   * @return invite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Invite getInvite() {
    return invite;
  }


  public void setInvite(Invite invite) {
    this.invite = invite;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteInviteResponse deleteInviteResponse = (DeleteInviteResponse) o;
    return Objects.equals(this.invite, deleteInviteResponse.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInviteResponse {\n");
    sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
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

