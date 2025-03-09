package dto.sample;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dto.sample.ContractParticipantResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SampleResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-10T01:47:11.164016500+05:00[Asia/Karachi]")
public class SampleResponse {

  private Long id;

  private String version;

  private String creatorAddress;

  private String createdOn;

  private String updatedAt;

  private String description;

  private Boolean isActive;

  @Valid
  private List<@Valid ContractParticipantResponse> participants;

  public SampleResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SampleResponse version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SampleResponse creatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
    return this;
  }

  /**
   * Get creatorAddress
   * @return creatorAddress
  */
  
  @Schema(name = "creatorAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorAddress")
  public String getCreatorAddress() {
    return creatorAddress;
  }

  public void setCreatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
  }

  public SampleResponse createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  */
  
  @Schema(name = "createdOn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdOn")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public SampleResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public SampleResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SampleResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  
  @Schema(name = "isActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public SampleResponse participants(List<@Valid ContractParticipantResponse> participants) {
    this.participants = participants;
    return this;
  }

  public SampleResponse addParticipantsItem(ContractParticipantResponse participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

  /**
   * Get participants
   * @return participants
  */
  @Valid 
  @Schema(name = "participants", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("participants")
  public List<@Valid ContractParticipantResponse> getParticipants() {
    return participants;
  }

  public void setParticipants(List<@Valid ContractParticipantResponse> participants) {
    this.participants = participants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleResponse sampleResponse = (SampleResponse) o;
    return Objects.equals(this.id, sampleResponse.id) &&
        Objects.equals(this.version, sampleResponse.version) &&
        Objects.equals(this.creatorAddress, sampleResponse.creatorAddress) &&
        Objects.equals(this.createdOn, sampleResponse.createdOn) &&
        Objects.equals(this.updatedAt, sampleResponse.updatedAt) &&
        Objects.equals(this.description, sampleResponse.description) &&
        Objects.equals(this.isActive, sampleResponse.isActive) &&
        Objects.equals(this.participants, sampleResponse.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, creatorAddress, createdOn, updatedAt, description, isActive, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    creatorAddress: ").append(toIndentedString(creatorAddress)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

