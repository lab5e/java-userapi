/*
 * The User API
 * API to manage teams, members and tokens
 *
 * The version of the OpenAPI document: 1.3.13 bordering-jerilyn
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AnAPIToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T09:16:22.625Z[GMT]")
public class AnAPIToken {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_WRITE = "write";
  @SerializedName(SERIALIZED_NAME_WRITE)
  private Boolean write;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_LAST_USE = "lastUse";
  @SerializedName(SERIALIZED_NAME_LAST_USE)
  private String lastUse;

  public static final String SERIALIZED_NAME_USES = "uses";
  @SerializedName(SERIALIZED_NAME_USES)
  private String uses;


  public AnAPIToken resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * The resource of the token.  The token applies to the specified resource and any resources below this so the resource &#x60;/&#x60; applies to the root resource and any resource below the root resource. In the same manner &#x60;/collections&#x60; will apply to all collectins while &#x60;/collections/{id}&#x60; will apply to that particular collection.
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The resource of the token.  The token applies to the specified resource and any resources below this so the resource `/` applies to the root resource and any resource below the root resource. In the same manner `/collections` will apply to all collectins while `/collections/{id}` will apply to that particular collection.")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public AnAPIToken write(Boolean write) {
    
    this.write = write;
    return this;
  }

   /**
   * Write flag for token.  If this is set to &#x60;true&#x60; the token can be used for write operations in the API such as POST, DELETE and PATCH.
   * @return write
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Write flag for token.  If this is set to `true` the token can be used for write operations in the API such as POST, DELETE and PATCH.")

  public Boolean getWrite() {
    return write;
  }


  public void setWrite(Boolean write) {
    this.write = write;
  }


  public AnAPIToken tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AnAPIToken putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Tags for the token.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags for the token.")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public AnAPIToken lastUse(String lastUse) {
    
    this.lastUse = lastUse;
    return this;
  }

   /**
   * The last time the token was used. Time in ms since epoch.
   * @return lastUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last time the token was used. Time in ms since epoch.")

  public String getLastUse() {
    return lastUse;
  }


  public void setLastUse(String lastUse) {
    this.lastUse = lastUse;
  }


  public AnAPIToken uses(String uses) {
    
    this.uses = uses;
    return this;
  }

   /**
   * Get uses
   * @return uses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUses() {
    return uses;
  }


  public void setUses(String uses) {
    this.uses = uses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnAPIToken anAPIToken = (AnAPIToken) o;
    return Objects.equals(this.resource, anAPIToken.resource) &&
        Objects.equals(this.write, anAPIToken.write) &&
        Objects.equals(this.tags, anAPIToken.tags) &&
        Objects.equals(this.lastUse, anAPIToken.lastUse) &&
        Objects.equals(this.uses, anAPIToken.uses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, write, tags, lastUse, uses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnAPIToken {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    lastUse: ").append(toIndentedString(lastUse)).append("\n");
    sb.append("    uses: ").append(toIndentedString(uses)).append("\n");
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
