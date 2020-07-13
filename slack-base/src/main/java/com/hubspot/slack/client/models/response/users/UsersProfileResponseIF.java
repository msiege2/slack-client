package com.hubspot.slack.client.models.response.users;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.response.SlackResponse;
import com.hubspot.slack.client.models.users.UserProfile;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface UsersProfileResponseIF extends SlackResponse {
  @JsonProperty("profile")
  UserProfile getUserProfile();
}
