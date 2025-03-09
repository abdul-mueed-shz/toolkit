package dto.sample;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dto.sample.ContractParticipantRequest;
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
 * CreateSampleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-10T01:47:11.164016500+05:00[Asia/Karachi]")
public class CreateSampleRequest {

  private String creatorAddress;

  private String description;

  @Valid
  private List<@Valid ContractParticipantRequest> participants;

  private Boolean isActive = true;

  public CreateSampleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSampleRequest(String creatorAddress, String description) {
    this.creatorAddress = creatorAddress;
    this.description = description;
  }

  public CreateSampleRequest creatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
    return this;
  }

  /**
   * Creator Address required
   * @return creatorAddress
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "creatorAddress", description = "Creator Address required", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creatorAddress")
  public String getCreatorAddress() {
    return creatorAddress;
  }

  public void setCreatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
  }

  public CreateSampleRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Brief description of the contract. Description required
   * @return description
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "description", description = "Brief description of the contract. Description required", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateSampleRequest participants(List<@Valid ContractParticipantRequest> participants) {
    this.participants = participants;
    return this;
  }

  public CreateSampleRequest addParticipantsItem(ContractParticipantRequest participantsItem) {
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
  public List<@Valid ContractParticipantRequest> getParticipants() {
    return participants;
  }

  public void setParticipants(List<@Valid ContractParticipantRequest> participants) {
    this.participants = participants;
  }

  public CreateSampleRequest isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether the contract is active
   * @return isActive
  */
  
  @Schema(name = "isActive", description = "Whether the contract is active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSampleRequest createSampleRequest = (CreateSampleRequest) o;
    return Objects.equals(this.creatorAddress, createSampleRequest.creatorAddress) &&
        Objects.equals(this.description, createSampleRequest.description) &&
        Objects.equals(this.participants, createSampleRequest.participants) &&
        Objects.equals(this.isActive, createSampleRequest.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorAddress, description, participants, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSampleRequest {\n");
    sb.append("    creatorAddress: ").append(toIndentedString(creatorAddress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

