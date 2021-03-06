package com.onemda.onemdabackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "participants")
public class Participant {

	@JsonProperty(value="participant_id")
	@Field("participantId")
	private String participantId;
	
	@JsonProperty(value="participant_name")
	@Field("participantName")
	private String participantName;

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

}
