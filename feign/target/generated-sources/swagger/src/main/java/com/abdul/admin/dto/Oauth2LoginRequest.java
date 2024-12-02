package com.abdul.admin.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Oauth2LoginRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T23:18:52.461980+05:00[Asia/Karachi]")
public class Oauth2LoginRequest {

  private String searchTerm;

  public Oauth2LoginRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Oauth2LoginRequest(String searchTerm) {
    this.searchTerm = searchTerm;
  }

  public Oauth2LoginRequest searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }

  /**
   * Get searchTerm
   * @return searchTerm
  */
  @NotNull 
  @Schema(name = "searchTerm", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("searchTerm")
  public String getSearchTerm() {
    return searchTerm;
  }

  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2LoginRequest oauth2LoginRequest = (Oauth2LoginRequest) o;
    return Objects.equals(this.searchTerm, oauth2LoginRequest.searchTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oauth2LoginRequest {\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
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

