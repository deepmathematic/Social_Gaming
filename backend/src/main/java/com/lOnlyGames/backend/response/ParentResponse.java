package com.lOnlyGames.backend.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ParentResponse {
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;

    private String code;

	public ParentResponse() {
		this.timestamp = LocalDateTime.now();
	}

	public LocalDateTime getTimestamp() {
		return this.timestamp;
    }
    
    public String getCode() {
		return this.code;
	}
}