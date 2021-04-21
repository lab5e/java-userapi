/*
 * The User API
 * API to manage teams, members and tokens
 *
 * The version of the OpenAPI document: 1.3.6 crooked-daija
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
import com.lab5e.user.model.Token;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TokenList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T12:53:27.149Z[GMT]")
public class TokenList {
  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private List<Token> tokens = null;


  public TokenList tokens(List<Token> tokens) {
    
    this.tokens = tokens;
    return this;
  }

  public TokenList addTokensItem(Token tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Token> getTokens() {
    return tokens;
  }


  public void setTokens(List<Token> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenList tokenList = (TokenList) o;
    return Objects.equals(this.tokens, tokenList.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenList {\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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

